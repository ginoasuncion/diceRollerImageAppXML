package ginoasuncion.com.lesson4

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceImageView: ImageView = findViewById(R.id.diceImage)
        val rollButton: Button = findViewById(R.id.rollButton)

        rollButton.setOnClickListener {
            val randomNumber = (1..6).random()
            val drawableName = "dice_$randomNumber"
            val resourceId = resources.getIdentifier(drawableName, "drawable", packageName)
            diceImageView.setImageResource(resourceId)
        }
    }
}
