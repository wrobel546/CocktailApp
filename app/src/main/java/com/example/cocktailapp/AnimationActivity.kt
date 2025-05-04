package com.example.cocktailapp

import android.animation.ObjectAnimator
import android.content.Intent
import android.graphics.drawable.Drawable
import android.hardware.*
import android.os.*
import android.view.Gravity
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.cocktailapp.databinding.ActivityAnimationBinding
import kotlin.random.Random

class AnimationActivity : AppCompatActivity(), SensorEventListener {
    private lateinit var sensorManager: SensorManager
    private var lightSensor: Sensor? = null
    private lateinit var rootLayout: FrameLayout

    // List grafik drinków
    private val drinkDrawables = listOf(
        R.drawable.mojito, R.drawable.martini, R.drawable.margarita, R.drawable.hugo,
        R.drawable.aperolspritz, R.drawable.raspberrycollins, R.drawable.cubalibre, R.drawable.pina_colada
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        rootLayout = findViewById(R.id.rootLayout)

        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        lightSensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT)

        startDrinkRain()

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 4000)
    }

    private fun startDrinkRain() {
        rootLayout.post {
            val screenWidth = rootLayout.width
            val screenHeight = rootLayout.height
            val drinkSize = 300
            val slotCount = screenWidth / (drinkSize + 40)
            val slotWidth = screenWidth / slotCount

            repeat(16) {
                val slot = Random.nextInt(0, slotCount)
                val drawableRes = drinkDrawables.random()

                val imageView = ImageView(this).apply {
                    setImageDrawable(ContextCompat.getDrawable(context, drawableRes))
                    layoutParams = FrameLayout.LayoutParams(drinkSize, drinkSize).apply {
                        gravity = Gravity.TOP
                        leftMargin = (slot * slotWidth) + Random.nextInt(0, slotWidth - drinkSize)
                    }
                    alpha = Random.nextFloat().coerceIn(0.8f, 1f)
                    rotation = Random.nextFloat() * 360
                }

                imageView.translationY = -drinkSize.toFloat()
                rootLayout.addView(imageView)

                val fallDistance = screenHeight + drinkSize + 300f

                // ANIMACJA SPADANIA
                val fallAnim = ObjectAnimator.ofFloat(imageView, "translationY", -drinkSize.toFloat(), fallDistance).apply {
                    duration = Random.nextLong(2500, 4000)
                    startDelay = Random.nextLong(0, 800)
                    interpolator = android.view.animation.AccelerateInterpolator() // fizyka
                }

                // ANIMACJA OBROTU
                val rotateAnim = ObjectAnimator.ofFloat(imageView, "rotation", imageView.rotation, imageView.rotation + Random.nextInt(180, 360)).apply {
                    duration = fallAnim.duration
                    interpolator = android.view.animation.LinearInterpolator()
                }

                // ANIMACJA SKALI (pulsowanie)
                val scaleX = ObjectAnimator.ofFloat(imageView, "scaleX", 1f, 1.1f, 1f).apply {
                    duration = 1000
                    repeatCount = ObjectAnimator.INFINITE
                    repeatMode = ObjectAnimator.REVERSE
                }
                val scaleY = ObjectAnimator.ofFloat(imageView, "scaleY", 1f, 1.1f, 1f).apply {
                    duration = 1000
                    repeatCount = ObjectAnimator.INFINITE
                    repeatMode = ObjectAnimator.REVERSE
                }

                // URUCHAMIAMY WSZYSTKO
                fallAnim.start()
                rotateAnim.start()
                scaleX.start()
                scaleY.start()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        lightSensor?.let {
            sensorManager.registerListener(this, it, SensorManager.SENSOR_DELAY_NORMAL)
        }
    }

    override fun onPause() {
        super.onPause()
        sensorManager.unregisterListener(this)
    }

    override fun onSensorChanged(event: SensorEvent?) {
        // Można dodać reakcję np. na światło, zmieniając tło lub przezroczystość
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {}
}
