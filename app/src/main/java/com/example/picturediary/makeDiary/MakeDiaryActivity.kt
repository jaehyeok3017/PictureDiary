package com.example.picturediary.makeDiary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.picturediary.MainActivity
import com.example.picturediary.R
import com.example.picturediary.databinding.ActivityMakeDiaryBinding
import com.example.picturediary.makeDiary.Drawing.DrawingFragment

class MakeDiaryActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMakeDiaryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMakeDiaryBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportFragmentManager.beginTransaction().replace(R.id.container, DrawingFragment()).commit()
    }

    fun openFragmentOnFrameLayout(int : Int){
        val transaction = supportFragmentManager.beginTransaction()
        when(int){
            1->transaction.replace(R.id.container, WritingFragment())
            2->transaction.replace(R.id.container, SharingFragment())
            3->startActivity(Intent(this, MainActivity::class.java))
        }
        transaction.commit()
    }
}