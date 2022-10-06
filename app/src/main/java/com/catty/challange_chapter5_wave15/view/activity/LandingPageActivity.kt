package com.catty.challange_chapter5_wave15.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.catty.challange_chapter5_wave15.databinding.ActivityLandingPageBinding
import com.catty.challange_chapter5_wave15.view.adapter.ViewPagerAdapter
import com.catty.challange_chapter5_wave15.view.fragment.FirstLandingPageFragment
import com.catty.challange_chapter5_wave15.view.fragment.SecondLandingPageFragment
import com.catty.challange_chapter5_wave15.view.fragment.ThirdLandingPageFragment

class LandingPageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLandingPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getFragments()
        binding.circleIndicator.setViewPager(binding.viewPager)
    }

    private fun getFragments () {
        val fragment : ArrayList<Fragment> = arrayListOf(
            FirstLandingPageFragment(),
            SecondLandingPageFragment(),
            ThirdLandingPageFragment(),
        )
        ViewPagerAdapter(fragment,this).also {
            binding.viewPager.adapter = it
        }
    }
}