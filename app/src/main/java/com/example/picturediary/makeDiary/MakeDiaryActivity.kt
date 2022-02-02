package com.example.picturediary.makeDiary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.picturediary.R
import com.example.picturediary.databinding.ActivityMakeDiaryBinding

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
        }
        transaction.commit()
    }
}