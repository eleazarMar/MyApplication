package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    internal lateinit var fredButton: ImageButton
    internal lateinit var daphneButton: ImageButton
    internal lateinit var scoobyButton: ImageButton
    internal lateinit var velmaButton: ImageButton
    internal lateinit var shaggyButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fredButton = findViewById(R.id.fredButton)
        daphneButton = findViewById(R.id.daphneButton)
        scoobyButton = findViewById(R.id.scoobyButton)
        velmaButton = findViewById(R.id.velmaButton)
        shaggyButton = findViewById(R.id.shaggyButton)

        fredButton.setOnClickListener{
            val intent= Intent(this, Fred::class.java)
            startActivity(intent)
        }
        daphneButton.setOnClickListener{
            val intent= Intent(this, Daphne::class.java)
            startActivity(intent)
        }
        scoobyButton.setOnClickListener{
            val intent= Intent(this, Scooby::class.java)
            startActivity(intent)
        }
        velmaButton.setOnClickListener{
            val intent= Intent(this, Velma::class.java)
            startActivity(intent)
        }
        shaggyButton.setOnClickListener{
            val intent= Intent(this, Shaggy::class.java)
            startActivity(intent)
        }

    }
}