package com.fiap.mvp_project

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.TextView

class ActivityTime : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)

        val backButton = findViewById<Button>(R.id.back_button)
        val textBox1 = findViewById<TextView>(R.id.textBox1)
        val textBox2 = findViewById<TextView>(R.id.textBox2)
        val dateText = findViewById<TextView>(R.id.dateText)
        val user = getIntent().getStringExtra("USER")
        val date = getIntent().getStringExtra("DATE")

        dateText.text = date

        if (user != null) {

            when {
                user.equals("elias") -> {

                    textBox1.text = "Pintura paredes do quarto"
                    textBox2.text = "Pintura paredes do quarto"

                }
                user.equals("danielle") -> {

                    textBox1.text = "Revisão do projeto do banheiro"
                    textBox1.setTextSize(TypedValue.COMPLEX_UNIT_SP,14f)
                    textBox2.text = "Revisão do projeto do banheiro"
                    textBox2.setTextSize(TypedValue.COMPLEX_UNIT_SP,14f)

                }
                user.equals("vitor") -> {
                    textBox1.text = "Construção do muro da fachada"
                    textBox1.setTextSize(TypedValue.COMPLEX_UNIT_SP,14f)
                    textBox2.text = "Construção do muro da fachada"
                    textBox2.setTextSize(TypedValue.COMPLEX_UNIT_SP,14f)

                }
                user.equals("raquel") -> {
                    textBox1.text = "Vistoria de obra"
                    textBox2.text = "Vistoria de obra"

                }
            }

        }


        backButton.setOnClickListener{
            val intent = Intent(this, ActivityDates::class.java)
            intent.putExtra("USER", user);
            startActivity(intent)
        }
    }
}