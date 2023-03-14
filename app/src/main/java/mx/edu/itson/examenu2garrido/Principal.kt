package mx.edu.itson.examenu2garrido

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        var btnDetalles: Button = findViewById(R.id.btn_detalles)
        var btnGlobos: Button = findViewById(R.id.btn_globos)
        var btnPeluches: Button = findViewById(R.id.btn_peluches)
        var btnRegalos: Button = findViewById(R.id.btn_regalos)
        var btnTazas: Button = findViewById(R.id.btn_tazas)

        var intent: Intent= Intent(this,Regalos::class.java)


        btnDetalles.setOnClickListener {
            intent.putExtra("click","detalles")
            startActivity(intent)
        }

        btnGlobos.setOnClickListener {
            intent.putExtra("click","globos")
            startActivity(intent)
        }

        btnPeluches.setOnClickListener {
            intent.putExtra("click","peluches")
            startActivity(intent)
        }

        btnRegalos.setOnClickListener {
            intent.putExtra("click","regalos")
            startActivity(intent)
        }

        btnTazas.setOnClickListener {
            intent.putExtra("click","tazas")
            startActivity(intent)
        }
    }
}