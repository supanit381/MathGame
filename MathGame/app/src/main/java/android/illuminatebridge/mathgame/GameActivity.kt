package android.illuminatebridge.mathgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import androidx.annotation.IntegerRes
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        var intentData = intent.extras
        txtView_Name.text = "Hi ${intentData!!.getString("name")}, please answer quiz below"

        btn_Submit.setOnClickListener {
            var countCorrectAns: Int = 0
            var ansOne = edtText_One.text.toString()
            var ansTwo = edtText_Two.text.toString()
            var ansThree = edtText_Three.text.toString()
            var ansFour = edtText_Four.text.toString()
            var ansFive = edtText_Five.text.toString()

            if (ansOne == "134") {
                ++countCorrectAns
            }
            if (ansTwo == "889") {
                ++countCorrectAns
            }
            if (ansThree == "10") {
                ++countCorrectAns
            }
            if (ansFour == "875") {
                ++countCorrectAns
            }
            if (ansFive == "88") {
                ++countCorrectAns
            }

            var ResultActivityIntent = Intent(this,ResultActivity::class.java)


            ResultActivityIntent.putExtra("name",intentData!!.getString("name"))
            ResultActivityIntent.putExtra("score",countCorrectAns)
            startActivity(ResultActivityIntent)
        }
    }
}
