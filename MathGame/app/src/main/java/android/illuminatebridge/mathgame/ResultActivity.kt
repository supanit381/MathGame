package android.illuminatebridge.mathgame

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_game.txtView_Name
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var intentData = intent.extras

        txtView_Name.text = "Hi ${intentData!!.getString("name")}, your score is"
        txtView_Score.text = " ${intentData.getInt("score")} "

        btn_Restart.setOnClickListener{
            var GameActivityIntent = Intent(this,GameActivity::class.java)

            GameActivityIntent.putExtra("name",intentData!!.getString("name"))
            startActivity(GameActivityIntent)
        }
    }
}
