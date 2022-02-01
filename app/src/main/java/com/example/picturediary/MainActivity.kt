package com.example.picturediary

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.picturediary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)

        var SharedPreferences = getSharedPreferences("welcomeView", Activity.MODE_PRIVATE)
        var checkSharedPreferences = SharedPreferences.getBoolean("welcomeView", false)

        when(checkSharedPreferences){
            false -> {
                val editBoolean = SharedPreferences.edit()
                editBoolean.putBoolean("welcomeView", true)
                editBoolean.commit()
                startActivity(Intent(this@MainActivity, WelcomeActivity::class.java))
            }
        }

        binding.mainRecyclerView.setOnClickListener {
            // 화면 전환 (어떻게 할 지 모르겠어서 임시로 비워둠)
        }

        binding.mainFab.setOnClickListener{
            startActivity(Intent(this, MakeDiaryActivity::class.java))
        }
    }
}