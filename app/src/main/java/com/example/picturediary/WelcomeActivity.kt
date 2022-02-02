package com.example.picturediary

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.picturediary.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityWelcomeBinding
    var welcomeScreenCount : Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_welcome)

        binding.welcomeNextButton.setOnClickListener {
            changeScreenByScreenCount()
        }

        binding.welcomeGoMainButton.setOnClickListener {
            startMainActivity()
        }
    }

    fun changeScreenByScreenCount(){
        when(welcomeScreenCount){
            1, 2 -> setWelcomeScreenTextAndImage(welcomeScreenCount)
            3 -> startMainActivity()
        }
        welcomeScreenCount++
    }

    fun setWelcomeScreenTextAndImage(fragmentCount: Int){
        when(fragmentCount){
            1 -> {
                binding.welcomeTextView.text = "오늘의 기분을\n나만의 일기장에\n표현해보세요"
                binding.welcomeImageView.setImageResource(R.drawable.ic_launcher_background)
                binding.welcomeScreenView1.setImageResource(R.drawable.welcome_graycircle)
                binding.welcomeScreenView2.setImageResource(R.drawable.welcome_whitecircle)
            }

            2 -> {
                binding.welcomeTextView.text = "표현한 일기를\nSNS를 통해\n공유해보세요"
                binding.welcomeNextButton.text = "메인으로"
                binding.welcomeGoMainButton.visibility = View.INVISIBLE
                binding.welcomeImageView.setImageResource(R.drawable.ic_launcher_background)
                binding.welcomeScreenView2.setImageResource(R.drawable.welcome_graycircle)
                binding.welcomeScreenView3.setImageResource(R.drawable.welcome_whitecircle)
            }
        }
    }
    fun startMainActivity() = startActivity(Intent(this, MainActivity::class.java))
}