package com.fiap.mvp_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ActivityList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        var user : String = ""

        val backButton = findViewById<Button>(R.id.back_button)
        val eliasButton = findViewById<Button>(R.id.button)
        val danielleButton = findViewById<Button>(R.id.button2)
        val vitorButton = findViewById<Button>(R.id.button3)
        val raquelButton = findViewById<Button>(R.id.button4)

        backButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

        eliasButton.setOnClickListener{
            val intent = Intent(this, ActivityDates::class.java)
            user = "elias"
            intent.putExtra("USER", user);
            startActivity(intent)
        }

        danielleButton.setOnClickListener{
            val intent = Intent(this, ActivityDates::class.java)
            user = "danielle"
            intent.putExtra("USER", user);
            startActivity(intent)
        }

        vitorButton.setOnClickListener{
            val intent = Intent(this, ActivityDates::class.java)
            user = "vitor"
            intent.putExtra("USER", user);
            startActivity(intent)
        }

        raquelButton.setOnClickListener{
            val intent = Intent(this, ActivityDates::class.java)
            user = "raquel"
            intent.putExtra("USER", user);
            startActivity(intent)
        }

    }


}