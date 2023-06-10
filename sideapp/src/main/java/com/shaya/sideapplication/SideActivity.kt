package com.shaya.sideapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shaya.sideapplication.databinding.ActivitySideBinding

class SideActivity : AppCompatActivity() {
    lateinit var binding: ActivitySideBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySideBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            Intent(this, HomeActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}