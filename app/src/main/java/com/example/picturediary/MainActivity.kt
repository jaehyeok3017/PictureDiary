package com.example.picturediary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.picturediary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.mainRecyclerView.setOnClickListener {
            // 화면 전환 (어떻게 할 지 모르겠어서 임시로 비워둠)
        }

        binding.mainFab.setOnClickListener{
            startActivity(Intent(this, MakeDiaryActivity::class.java))
        }
    }
}