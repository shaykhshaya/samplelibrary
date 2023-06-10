package com.shaya.mainapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shaya.mainapplication.databinding.ActivityMainBinding
import com.shaya.sideapplication.SideActivity

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            Intent(this, SideActivity::class.java).apply {
                startActivity(this)
            }
        }


    }
}