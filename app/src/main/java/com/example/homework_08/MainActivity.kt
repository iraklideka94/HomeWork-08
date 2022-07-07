package com.example.homework_08

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.TextView
import androidx.core.text.HtmlCompat
import com.example.homework_08.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val text = findViewById<TextView>(R.id.txtView)

        text.text = HtmlCompat.fromHtml(getString(R.string.home_txt), HtmlCompat.FROM_HTML_MODE_LEGACY)

        binding.startBtn.setOnClickListener {
            val intent = Intent(this,Second::class.java)
            startActivity(intent)
        }
    }
}