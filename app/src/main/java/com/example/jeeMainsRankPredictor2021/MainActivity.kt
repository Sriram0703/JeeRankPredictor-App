package com.example.jeeMainsRankPredictor2021
import android.content.Intent
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btn_mark_to_per = findViewById(R.id.MarktoPer) as Button
        val btn_per_to_rank = findViewById(R.id.PertoRank) as Button
// set on-click listener
        btn_mark_to_per.setOnClickListener {
            val intent = Intent(this,PercentilePredictor::class.java)
            startActivity(intent)
        }
        btn_per_to_rank.setOnClickListener {
            val intent = Intent(this,RankPredictor::class.java)
            startActivity(intent)
        }
    }

}