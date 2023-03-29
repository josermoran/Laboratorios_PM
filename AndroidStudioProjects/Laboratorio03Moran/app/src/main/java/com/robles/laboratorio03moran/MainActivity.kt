package com.robles.laboratorio03moran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var fiveCentsImageView:ImageView
    private lateinit var tenCentsImageView:ImageView
    private lateinit var quarterImageView:ImageView
    private lateinit var dollarImageView:ImageView
    private lateinit var cashTextView:TextView
    private var cash = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fiveCentsImageView = findViewById(R.id.five_cents_iv)
        tenCentsImageView = findViewById(R.id.ten_cents_iv)
        quarterImageView = findViewById(R.id.quarter_iv)
        dollarImageView = findViewById(R.id.one_dolar_iv)
        cashTextView= findViewById(R.id.cantidad_tv)

        fiveCentsImageView.setOnClickListener {
            cash += 0.05
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }
        tenCentsImageView.setOnClickListener {
            cash += 0.10
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }
        quarterImageView.setOnClickListener {
            cash += 0.25
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }
        dollarImageView.setOnClickListener {
            cash += 1.00
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }
    }
}