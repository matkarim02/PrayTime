package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailedPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_page)

        val item = intent.getParcelableExtra<Zikr>("item")
        if (item != null) {
            val zikr: TextView = findViewById(R.id.zikrName)
            val context: TextView = findViewById(R.id.zikrContext)
            zikr.text = item.zikrName
            context.text = item.aboutZikr
        }
    }
}