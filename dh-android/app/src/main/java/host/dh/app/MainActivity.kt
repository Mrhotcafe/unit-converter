package host.dh.app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val value: String? = null
    // BUG: force-unwrap null -> NullPointerException on launch
    findViewById<TextView>(R.id.headline).text = value!!.trim()
  }
}
