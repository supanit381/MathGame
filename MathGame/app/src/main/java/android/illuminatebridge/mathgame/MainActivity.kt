package android.illuminatebridge.mathgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btnStartOnClick(view: View) {


        if (edtText_Name.text.toString() =="") {
            Toast.makeText(this,"Please Enter Your Name Before Start!",Toast.LENGTH_LONG).show()
        }else{
            var GameActivityIntent = Intent(this,GameActivity::class.java)

            GameActivityIntent.putExtra("name",edtText_Name.text.toString())
            startActivity(GameActivityIntent)
        }
    }
}
