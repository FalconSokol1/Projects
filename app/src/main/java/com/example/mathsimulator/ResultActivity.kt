package com.example.mathsimulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.mathsimulator.databinding.ActivityResultBinding


class ResultActivity : AppCompatActivity() {
    lateinit var  binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val score = intent.getIntExtra("RIGHT_ANSWERS_T", 0)
        if(score==4){
            val imageView = findViewById<ImageView>(R.id.imageResult)
            imageView.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.win))

        } else if(score==3){
            val imageView = findViewById<ImageView>(R.id.imageResult)
            imageView.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.mid))

        } else if (score<=2){
            val imageView = findViewById<ImageView>(R.id.imageResult)
            imageView.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.def))

        }


        binding.bStart.setOnClickListener{
            val intent = Intent(this@ResultActivity,SimulatorMenu::class.java)
            startActivity(intent)
            finish()
        }

    }
}