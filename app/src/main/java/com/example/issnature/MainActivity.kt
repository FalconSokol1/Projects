package com.example.issnature

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.github.barteksc.pdfviewer.PDFView

class MainActivity : AppCompatActivity() {

    val key_one = "0"
    val key_two = "1"
    val key_three = "2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun openA(view:View){
            val intent = Intent(this@MainActivity,BookActivity::class.java)
            intent.putExtra("Q", key_one);
            startActivity(intent)

    }

    fun openR(view:View){

        val intent = Intent(this@MainActivity,BookActivity::class.java)
        intent.putExtra("Q", key_two);
        startActivity(intent)
    }

    fun openI(view:View){

        val intent = Intent(this@MainActivity,InfoActivity::class.java)
        startActivity(intent)
    }
    fun openC(view:View){

        val intent = Intent(this@MainActivity,BookActivity::class.java)
        intent.putExtra("Q", key_three);
        startActivity(intent)
    }
}