import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.midterm.R // Adjust package name

class HighScoreFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_high_score, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find your views by their IDs
        val textViewHighScore = view.findViewById<TextView>(R.id.textViewHighScore)

        // Set your views' properties here
        textViewHighScore.text = "High Score: 1000"
    }
}
