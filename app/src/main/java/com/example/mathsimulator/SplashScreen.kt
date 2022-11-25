package com.example.mathsimulator

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.VideoView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen2)


        var videoView = findViewById<VideoView>(R.id.videoV)
        videoView!!.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.v))
        videoView!!.requestFocus()
        videoView!!.start()
        videoView!!.setOnCompletionListener{
            var run = Runnable {
                val intent = Intent(this@SplashScreen,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            Handler().postDelayed(run,2000)


    }
}
}