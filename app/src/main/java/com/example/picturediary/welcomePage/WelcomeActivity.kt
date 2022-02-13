package com.example.picturediary.welcomePage

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.picturediary.MainActivity
import com.example.picturediary.R
import com.example.picturediary.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityWelcomeBinding
    private lateinit var mPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_welcome)

        mPager = binding.viewPage
        val pageAdapter = WelcomeFragmentAdapter(supportFragmentManager)
        mPager.adapter = pageAdapter

        val indicator = binding.indicator
        indicator.setViewPager(mPager)

        mPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageSelected(position: Int) {
                when(position){
                    2 -> binding.welcomeToStartMainActivityButton.visibility = View.VISIBLE
                }
            }

            override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {}
            override fun onPageScrollStateChanged(state: Int) {}
        })

        binding.welcomeToStartMainActivityButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    override fun onBackPressed() {
        when(mPager.currentItem){
            0 -> super.onBackPressed()
            else -> mPager.currentItem = mPager.currentItem - 1
        }
    }

}