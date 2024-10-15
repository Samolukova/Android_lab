package com.example.lab5

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val secondText: TextView =findViewById(R.id.second_text)
        val thirdText: TextView =findViewById(R.id.third_text)
        val forthText: TextView =findViewById(R.id.forth_text)
        var leftBottomImage: ImageView = findViewById(R.id.imageView2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        leftBottomImage.setOnClickListener{
            val phrases = listOf(
                "Уже 6 часов утра, Наташ",
                "Вставай, мы всё уронили",
                "Наташ, ты чё опять лежиш?",
                "Часики-то тикают",
                "Мужика-то нашла себе?",
                "Уже дитачек пора рожать вообще-то"
            )
            val shuffledList=phrases.shuffled()
            secondText.text=shuffledList[0]
            thirdText.text=shuffledList[1]
            forthText.text=shuffledList[2]
        }
    }
}