package com.example.picturediary

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.picturediary.databinding.ActivityMainBinding
import com.example.picturediary.makeDiary.MakeDiaryActivity
import com.example.picturediary.welcomePage.WelcomeActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        /*binding.mainRecyclerView.setOnClickListener {
            // 화면 전환 (어떻게 할 지 모르겠어서 임시로 비워둠)
        }*/

        var SharedPreferences = getSharedPreferences("welcomeViewWatched", Activity.MODE_PRIVATE)
        var checkSharedPreferences = SharedPreferences.getBoolean("welcomeViewWatched", false)

        when(checkSharedPreferences){
            false -> {
                val editBoolean = SharedPreferences.edit()
                editBoolean.putBoolean("welcomeViewWatched", true)
                editBoolean.commit()
                startActivity(Intent(this@MainActivity, WelcomeActivity::class.java))
            }
        }


        binding.mainFab.setOnClickListener{
            Toast.makeText(this, "aaaa", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, MakeDiaryActivity::class.java))
        }
    }
}