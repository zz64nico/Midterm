import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class GuessFragment : Fragment() {
    private var randomNumber = (1..100).random()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layoutId = resources.getIdentifier("fragment_guess", "layout", requireContext().packageName)
        return inflater.inflate(layoutId, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editTextGuessId = resources.getIdentifier("editTextGuess", "id", requireContext().packageName)
        val buttonSubmitGuessId = resources.getIdentifier("buttonSubmitGuess", "id", requireContext().packageName)

        val editTextGuess: EditText = view.findViewById(editTextGuessId)
        val buttonSubmitGuess: Button = view.findViewById(buttonSubmitGuessId)

        buttonSubmitGuess.setOnClickListener {
            val guess = editTextGuess.text.toString().toIntOrNull()
            if (guess != null) {
                if (guess == randomNumber) {
                    // Correct guess logic
                } else {
                    // Incorrect guess logic
                }
            }
        }
    }
}
