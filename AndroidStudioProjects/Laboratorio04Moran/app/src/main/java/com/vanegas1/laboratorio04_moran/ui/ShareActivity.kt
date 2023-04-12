package com.vanegas1.laboratorio04_moran.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.vanegas1.laboratorio04_moran.R

class ShareActivity : AppCompatActivity() {
    private lateinit var nameTextView:TextView
    private lateinit var mailTextView:TextView
    private lateinit var numberTextView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)

       nameTextView = findViewById(R.id.name_info)
       mailTextView = findViewById(R.id.mail_info)
       numberTextView = findViewById(R.id.number_info)

        val nameShared = intent.getStringExtra("name", ).toString()
        val mailShared = intent.getStringExtra("mail", ).toString()
        val numberShared = intent.getStringExtra("number", ).toString()
        nameTextView.text = "Nombre: ${nameShared}"
        mailTextView.text = "Correo electrónico: ${mailShared}"
        numberTextView.text = "Numero de teléfono: ${numberShared}"
}}