package com.example.mathsimulator

import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.pm.ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        val imagebtn = findViewById<ImageButton>(R.id.info_button)
        imagebtn.setOnClickListener{
            val intent = Intent(this,AboutAppActivity::class.java)
            startActivity(intent)
        }
    }

    fun openLectures(view: View) {
        val newWindow = Intent(this,LecturesActivity::class.java)
        startActivity(newWindow)
    }
    fun openTest(view: View) {
        val newWindow = Intent(this,SimulatorMenu::class.java)
        startActivity(newWindow)
    }
    fun openPC(view: View) {
        val url = Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/topic-199769348_49114297"))
        startActivity(url)
    }




}