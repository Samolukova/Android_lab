package com.example.ravencounter

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var raven_counter: Int=0;
    private var cat_counter: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun onClickCat(view: View) {
        val textViewCat: TextView= findViewById(R.id.textView_cat)
        textViewCat.setText("Я насчитала ${++cat_counter} котиков")
    }

    fun onClickRaven(view: View) {
        val textViewRaven: TextView= findViewById(R.id.textView_raven)
        textViewRaven.setText("Я насчитала ${++raven_counter} ворон")
    }


}