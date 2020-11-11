package com.example.digitalhousefoods

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_prato.*

class PratoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prato)
        voltarDetalhe.setOnClickListener {
            startActivity(Intent(this, DetalheActivity::class.java))
        }
        textView3.text = intent.extras!!.getString("descricao")

    }
}