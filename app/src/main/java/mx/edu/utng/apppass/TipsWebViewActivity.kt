package mx.edu.utng.apppass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_tips_web_view.*

class TipsWebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips_web_view)

        //WEBVIEW
        webView.loadUrl("https://www.guiadelnino.com/educacion/consejos-de-educacion/5-claves-para-hacer-un-buen-uso-de-los-videojuegos")
    }
}
