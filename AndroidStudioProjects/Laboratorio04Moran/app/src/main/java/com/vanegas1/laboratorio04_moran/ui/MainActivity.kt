package com.vanegas1.laboratorio04_moran.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.vanegas1.laboratorio04_moran.R

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: TextInputEditText
    private lateinit var mailEditText: TextInputEditText
    private lateinit var numberEditText: TextInputEditText
    private lateinit var actionNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.name_value)
        mailEditText = findViewById(R.id.mail_value)
        numberEditText = findViewById(R.id.number_value)
        actionNext = findViewById(R.id.action_share)

        actionNext.setOnClickListener{
            val intent = Intent(this, ShareActivity::class.java)
            intent.putExtra(SHARE_NAME, nameEditText.text.toString())
            intent.putExtra(SHARE_MAIL, mailEditText.text.toString())
            intent.putExtra(SHARE_NUMBER, numberEditText.text.toString())
            startActivity(intent)
        }
    }

    companion object{
        const val SHARE_NAME = "name"
        const val SHARE_MAIL = "mail"
        const val SHARE_NUMBER = "number"
    }
}