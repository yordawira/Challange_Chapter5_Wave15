package com.catty.challange_chapter5_wave15.view.activity

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import com.catty.challange_chapter5_wave15.databinding.ActivitySplashScreenBinding

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)

        binding.ivFirstSplashScreen.load(SPLASH_SCREEN_URL){
            crossfade(1950)
        }

        binding.ivSecondSplashScreen.alpha = 0f
        binding.ivSecondSplashScreen.animate().setDuration(2800).alpha(1f).withEndAction{
            val intent = Intent(this,LandingPageActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }

    companion object{
        const val SPLASH_SCREEN_URL = "https://i.ibb.co/HC5ZPgD/splash-screen1.png"
    }
}