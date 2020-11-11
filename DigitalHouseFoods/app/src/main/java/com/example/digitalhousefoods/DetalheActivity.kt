package com.example.digitalhousefoods

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_detalhe.*

class DetalheActivity : AppCompatActivity(), ListaPratosAdapter.OnItemClickListenerPrato {
    private val listapratos = getListaPratos()
    private val adapter = ListaPratosAdapter(listapratos, this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe)
        voltarMain.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        RecyclerViewPratos.adapter = adapter
        RecyclerViewPratos.layoutManager = GridLayoutManager(this, 2)
        RecyclerViewPratos.setHasFixedSize(true)
    }
    fun getListaPratos(): ArrayList<Prato> {
        var prato = Prato(R.drawable.image2, "Salada com molho Gengibre", "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore")
        var lista_pratos = arrayListOf(prato, prato, prato, prato, prato, prato, prato, prato, prato, prato, prato, prato)
        return lista_pratos
    }

    override fun onItemClick(position: Int) {
        if(position == 0) {
            val i = Intent(this, PratoActivity::class.java)
            i.putExtra("descricao", listapratos[position].descricao)
            startActivity(i)
        }
    }
}