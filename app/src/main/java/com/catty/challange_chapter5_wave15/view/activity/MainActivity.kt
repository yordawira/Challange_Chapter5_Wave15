package com.catty.challange_chapter5_wave15.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.catty.challange_chapter5_wave15.databinding.ActivityMainBinding

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var p




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}