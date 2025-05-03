import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import com.example.cocktailapp.R

class TimerFragment : Fragment() {

    private lateinit var timerText: TextView
    private lateinit var spinnerMinutes: Spinner
    private lateinit var spinnerSeconds: Spinner
    private lateinit var startButton: ImageButton
    private lateinit var stopButton: ImageButton
    private lateinit var cancelButton: ImageButton

    private var countDownTimer: CountDownTimer? = null
    private var remainingTimeInMillis: Long = 0
    private var isTimerRunning = false
    private var isPaused = false // Dodajemy flagę, która określa, czy minutnik jest wstrzymany

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_timer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        timerText = view.findViewById(R.id.timer_text)
        spinnerMinutes = view.findViewById(R.id.spinner_minutes)
        spinnerSeconds = view.findViewById(R.id.spinner_seconds)
        startButton = view.findViewById(R.id.button)
        stopButton = view.findViewById(R.id.button2)
        cancelButton = view.findViewById(R.id.button3)

        // Wypełnianie spinnerów
        val minutesList = (0..60).map { it.toString() }
        val secondsList = (0..55 step 5).map { it.toString().padStart(2, '0') }

        spinnerMinutes.adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, minutesList)
        spinnerSeconds.adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, secondsList)

        // Start przycisk - uruchomienie minutnika
        startButton.setOnClickListener {
            val minutes = spinnerMinutes.selectedItem.toString().toInt()
            val seconds = spinnerSeconds.selectedItem.toString().toInt()
            remainingTimeInMillis = (minutes * 60 + seconds) * 1000L
            if (remainingTimeInMillis > 0) {
                startTimer()
            }
        }

        // Stop/Pauza przycisk - zatrzymywanie lub wznowienie minutnika
        stopButton.setOnClickListener {
            if (isTimerRunning) {
                pauseTimer()
                stopButton.setImageResource(R.drawable.pause_button_grey) // Zmiana ikony na play
//                stopButton.setBackgroundColor(resources.getColor(R.color.green)) // Zmiana koloru przycisku
            } else if (isPaused && remainingTimeInMillis > 0) {
                resumeTimer()
                stopButton.setImageResource(R.drawable.pause_button_svgrepo_com_1_) // Zmiana ikony na pauzę
//                stopButton.setBackgroundColor(resources.getColor(R.color.red)) // Zmiana koloru na czerwoną
            }
        }

        // Cancel przycisk - reset minutnika
        cancelButton.setOnClickListener {
            cancelTimer()
        }

        if (isTimerRunning) {
            startTimer()
        } else if (remainingTimeInMillis > 0) {
            updateTimerText()
        }
    }

    private fun startTimer() {
        countDownTimer?.cancel()
        countDownTimer = object : CountDownTimer(remainingTimeInMillis, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                remainingTimeInMillis = millisUntilFinished
                updateTimerText()
            }

            override fun onFinish() {
                isTimerRunning = false
                timerText.text = "Gotowe!"
            }
        }.start()
        isTimerRunning = true
        stopButton.setImageResource(R.drawable.pause_button_svgrepo_com_1_) // Zmiana ikony na pauzę
//        stopButton.setBackgroundColor(resources.getColor(R.color.red)) // Kolor przycisku
    }

    private fun pauseTimer() {
        countDownTimer?.cancel()
        isTimerRunning = false
        isPaused = true // Flaga pauzy ustawiona na true
    }

    private fun resumeTimer() {
        startTimer() // Wznowienie minutnika z miejsca zatrzymania
        isPaused = false // Flaga pauzy ustawiona na false
    }

    private fun cancelTimer() {
        countDownTimer?.cancel()
        isTimerRunning = false
        remainingTimeInMillis = 0
        timerText.text = "00:00"
        stopButton.setImageResource(R.drawable.pause_button_svgrepo_com_1_) // Zmiana ikony na play
//        stopButton.setBackgroundColor(resources.getColor(R.color.gray)) // Kolor przycisku na domyślny
    }

    private fun updateTimerText() {
        val minutes = (remainingTimeInMillis / 1000) / 60
        val seconds = (remainingTimeInMillis / 1000) % 60
        timerText.text = String.format("%02d:%02d", minutes, seconds)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putLong("remainingTime", remainingTimeInMillis)
        outState.putBoolean("isRunning", isTimerRunning)
        outState.putBoolean("isPaused", isPaused)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        savedInstanceState?.let {
            remainingTimeInMillis = it.getLong("remainingTime", 0)
            isTimerRunning = it.getBoolean("isRunning", false)
            isPaused = it.getBoolean("isPaused", false)
            if (isTimerRunning) {
                startTimer()
            } else {
                updateTimerText()
            }
        }
    }
}
