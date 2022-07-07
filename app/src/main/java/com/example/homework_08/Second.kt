package com.example.homework_08

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.HtmlCompat
import com.example.homework_08.databinding.ActivitySecondBinding

class Second : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        binding.textV2.text = HtmlCompat.fromHtml("<font color='DFDBDB'> Dont't have an account? </font> <font color='#37C13D'> Sign Up</font>",HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}