package kolobovairinav.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.IllegalArgumentException

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlaySingle.setOnClickListener(this)
        btnStandalone.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val intent = when (view.id){
            R.id.btnPlaySingle -> Intent(this, YoutubeActivity::class.java)
            R.id.btnStandalone -> Intent(this, YoutubeActivity::class.java)
            else -> throw IllegalArgumentException("Undenified button clicked")
        }
        startActivity(intent)
    }
}
