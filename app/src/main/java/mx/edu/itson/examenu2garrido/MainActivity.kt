package mx.edu.itson.examenu2garrido

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnVisitar: Button = findViewById(R.id.btn_visitar)
        btnVisitar.setOnClickListener() {
            var intent: Intent = Intent(this, Principal::class.java)
            startActivity(intent)
        }
    }
}