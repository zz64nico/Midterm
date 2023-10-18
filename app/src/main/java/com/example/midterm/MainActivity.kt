import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Dynamically set the content view based on resource ID
        val layoutId = resources.getIdentifier("activity_main", "layout", packageName)
        setContentView(layoutId)

        // Dynamically find the resource IDs for buttons
        val btnPlayGameId = resources.getIdentifier("btnPlayGame", "id", packageName)
        val btnViewHighScoresId = resources.getIdentifier("btnViewHighScores", "id", packageName)

        // Find buttons by their IDs
        val btnPlayGame = findViewById<Button>(btnPlayGameId)
        val btnViewHighScores = findViewById<Button>(btnViewHighScoresId)

        // Set click listeners for buttons
        btnPlayGame.setOnClickListener {
            // Navigate to Game Screen (Implement your logic here)
        }

        btnViewHighScores.setOnClickListener {
            // Navigate to HighScore Screen (Implement your logic here)
        }
    }
}
