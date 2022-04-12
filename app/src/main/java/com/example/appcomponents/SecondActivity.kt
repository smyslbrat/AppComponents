package com.example.appcomponents

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import com.example.appcomponents.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = Intent(this, MusicServ::class.java)


        binding.scndBtn.setOnClickListener {
            binding.scndBtn.setBackgroundColor(ContextCompat.getColor(this,R.color.two_button_color))
                stopService(intent)
        }
    }
}