package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailedPage : AppCompatActivity() {
    private lateinit var taspih_txt : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_page)

        val item = intent.getParcelableExtra<Zikr>("item")
        if (item != null) {
            val zikr: TextView = findViewById(R.id.arab)
            val context: TextView = findViewById(R.id.latin)
            zikr.text = item.arab
            context.text = item.latin
        }
        var timeClicked = 0
         taspih_txt = findViewById(R.id.textView3)

         taspih_txt.setOnClickListener {
             timeClicked += 1
             taspih_txt.text = timeClicked.toString()

         }

    }
}