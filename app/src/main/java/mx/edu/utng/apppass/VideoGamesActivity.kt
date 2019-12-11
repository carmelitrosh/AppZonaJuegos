package mx.edu.utng.apppass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_video_games.*

class VideoGamesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_games)

        btnGATO.setOnClickListener() {
            val int1 = Intent(this, GatoActivity::class.java)
            startActivity(int1)
        }
    }
}
