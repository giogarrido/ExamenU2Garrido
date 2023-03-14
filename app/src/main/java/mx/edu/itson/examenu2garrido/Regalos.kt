package mx.edu.itson.examenu2garrido

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Regalos : AppCompatActivity() {

    var adapter: AdaptadorRegalos? = null

    var detalles = java.util.ArrayList<Detalles>()
    var globos = ArrayList<Detalles>()
    var peluches = ArrayList<Detalles>()
    var regalos = ArrayList<Detalles>()
    var tazas = ArrayList<Detalles>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regalos)
        agregarDetalles()

        if(intent.getStringExtra("click").equals("detalles")){
            adapter = AdaptadorRegalos(this,detalles)
            var gridv:GridView = findViewById(R.id.gv_catalogo)
            val titulo=findViewById(R.id.tv_titulo) as TextView
            titulo.setText("Detalles")
            gridv.adapter = adapter
        }

        if(intent.getStringExtra("click").equals("globos")){
            adapter = AdaptadorRegalos(this,globos)
            var gridv:GridView = findViewById(R.id.gv_catalogo)
            val titulo=findViewById(R.id.tv_titulo) as TextView
            titulo.setText("Globos")
            gridv.adapter = adapter
        }

        if(intent.getStringExtra("click").equals("peluches")){
            adapter = AdaptadorRegalos(this,peluches)
            var gridv:GridView = findViewById(R.id.gv_catalogo)
            val titulo=findViewById(R.id.tv_titulo) as TextView
            titulo.setText("Peluches")
            gridv.adapter = adapter
        }
        if(intent.getStringExtra("click").equals("regalos")){
            adapter = AdaptadorRegalos(this,regalos)
            var gridv:GridView = findViewById(R.id.gv_catalogo)
            val titulo=findViewById(R.id.tv_titulo) as TextView
            titulo.setText("Regalos")
            gridv.adapter = adapter
        }

        if(intent.getStringExtra("click").equals("tazas")){
            adapter = AdaptadorRegalos(this,tazas)
            var gridv:GridView = findViewById(R.id.gv_catalogo)
            val titulo=findViewById(R.id.tv_titulo) as TextView
            titulo.setText("Tazas")
            gridv.adapter = adapter
        }
    }




    fun agregarDetalles() {
        detalles.add(Detalles(R.drawable.cumplebotanas, "Cumple Botanas", "$100"))
        detalles.add(Detalles(R.drawable.cumplecheve, "Cumple Cheve", "$200"))
        detalles.add(Detalles(R.drawable.cumpleescolar, "Cumple Escolar", "250"))
        detalles.add(Detalles(R.drawable.cumplepaletas, "Cumple Paletas", "300"))
        detalles.add(Detalles(R.drawable.cumplesnack, "Cumple Snack", "350"))
        detalles.add(Detalles(R.drawable.cumplevinos, "Cumple Vinos", "400"))

        globos.add(Detalles(R.drawable.globos,"Globos","100"))
        globos.add(Detalles(R.drawable.globoamor,"Globo Amor","150"))
        globos.add(Detalles(R.drawable.globocumple,"Globo Cumple","200"))
        globos.add(Detalles(R.drawable.globonum,"Globo Num","250"))
        globos.add(Detalles(R.drawable.globofestejo,"Globo Festejo","300"))
        globos.add(Detalles(R.drawable.globoregalo,"Globo Regalo","350"))

        peluches.add(Detalles(R.drawable.peluches,"Peluches","100"))
        peluches.add(Detalles(R.drawable.peluchemario,"Peluche Mario","150"))
        peluches.add(Detalles(R.drawable.pelucheminecraft,"Peluche Minecraft","200"))
        peluches.add(Detalles(R.drawable.peluchepeppa,"Peluche Peppa","250"))
        peluches.add(Detalles(R.drawable.peluchesony,"Peluche Sony","300"))
        peluches.add(Detalles(R.drawable.peluchestich,"Peluche Stich","350"))
        peluches.add(Detalles(R.drawable.peluchevarios,"Peluche Varios","400"))

        regalos.add(Detalles(R.drawable.regalos,"Regalos","100"))
        regalos.add(Detalles(R.drawable.regalobebe,"Regalo Bebe","150"))
        regalos.add(Detalles(R.drawable.regaloazul,"Regalo Azul","200"))
        regalos.add(Detalles(R.drawable.regalocajas,"Regalo Cajas","250"))
        regalos.add(Detalles(R.drawable.regalocolores,"Regalo Colores","300"))
        regalos.add(Detalles(R.drawable.regalovarios,"Regalo Varios","350"))


        tazas.add(Detalles(R.drawable.tazas,"Tazas ","100"))
        tazas.add(Detalles(R.drawable.tazalove,"Taza Love ","150"))
        tazas.add(Detalles(R.drawable.tazaabuela,"Taza Abuela","200"))
        tazas.add(Detalles(R.drawable.tazaquiero,"Taza Quiero","250"))



    }

    class AdaptadorRegalos : BaseAdapter {

        var regalos=ArrayList<Detalles>()
        var context:Context?=null

        constructor(context: Context,regalos:ArrayList<Detalles>):super() {
            this.regalos = regalos
            this.context = context
        }

        override fun getCount(): Int {
            return regalos.size
        }

        override fun getItem(p0: Int): Any {
            return regalos[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

            var regal=regalos[p0]
            var inflator=context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var vista=inflator.inflate(R.layout.activity_detalle_regalos,null)
            var imagen=vista.findViewById(R.id.iv_regalo_imagen) as ImageView
            var titulo=vista.findViewById(R.id.tv_regalo_titulo)as TextView
            var precio=vista.findViewById(R.id.tv_regalo_precio) as TextView

            imagen.setImageResource(regal.image)
            titulo.setText(regal.titulo)
            precio.setText(regal.precio)

            return vista

        }


    }
}