package com.bignerdranch.android.klestpr23

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.ButtonBarLayout
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var buttonClick: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var h =  findViewById<TextView>(R.id.text7)
        var k = 1

        buttonClick = findViewById(R.id.button_click)

        buttonClick.setOnClickListener {
            if(k == 1)h.text = "Клестов Вячеслав получил "+ " 5 "
            else if(k == 2) h.text = "Максим Харитонов получил "+ " 4 "
            else if(k == 3) h.text = "Лев Гагаринов получил "+ " 3 "
            else if(k == 4) h.text = "Иван Комаров получил "+ " 2 "
            else k=0
            k++
        }
    }

}