package com.example.picturediary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var mainRecycler : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainRecycler = findViewById(R.id.mainRecyclerView)
        mainRecycler.setOnClickListener {
            // 화면 전환 (어떻게 할 지 모르겠어서 임시로 비워둠)
        }
    }
}