package com.example.mathsimulator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView

class WorkZone : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work_zone)

        val imageqbtn = findViewById<ImageButton>(R.id.imageBack)
        imageqbtn.setOnClickListener {
            finish()
        }

        val pdf_view = findViewById<PDFView>(R.id.pdf_view)
        val check = intent.extras!!.getString("T")

        if (check == "OK_0") {
            pdf_view.fromAsset("first_lec.pdf").enableSwipe(true).swipeHorizontal(false).load()

        } else if (check == "OK_1") {
            val pdf_view = findViewById<PDFView>(R.id.pdf_view)
            pdf_view.fromAsset("second_lec.pdf").enableSwipe(true).swipeHorizontal(false).load()

        } else if (check == "OK_2") {
            val pdf_view = findViewById<PDFView>(R.id.pdf_view)
            pdf_view.fromAsset("third_lec.pdf").enableSwipe(true).swipeHorizontal(false).load()

        } else if (check == "OK_3") {
            val pdf_view = findViewById<PDFView>(R.id.pdf_view)
            pdf_view.fromAsset("four_lec.pdf").enableSwipe(true).swipeHorizontal(false).load()

        }
    }

}
