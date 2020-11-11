package com.example.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_loading.*

class LoadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)
        imageView2.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

}