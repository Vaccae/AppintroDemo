package dem.vac.appintrodemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private val title = "Test"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var isfirst = SpHelper.getBoolean(this, title, true)
        if (isfirst) {
            val intent = Intent(this, IntroActivity::class.java)
            startActivity(intent)

            SpHelper.putBoolean(this, title, false)
        }

    }
}
