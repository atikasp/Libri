package com.example.libraryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

class About : AppCompatActivity() {

    private lateinit var toolbarBack : Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        toolbarBack = findViewById(R.id.toolbarBack)
        setSupportActionBar(toolbarBack)

        toolbarBack.setNavigationIcon(R.drawable.ic_back)
        toolbarBack.setNavigationOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))

        }
    }
}
