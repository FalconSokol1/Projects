package com.example.issnature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.github.barteksc.pdfviewer.PDFView

class BookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)
        val pdfView = findViewById<PDFView>(R.id.pdiew)
        val check = intent.extras!!.getString("Q")

        if(check == "0"){

            pdfView.fromAsset("r.pdf").enableSwipe(true).swipeHorizontal(false).load()
        }

        if(check == "1"){

            pdfView.fromAsset("a.pdf").enableSwipe(true).swipeHorizontal(false).load()
        }
        if (check == "2"){
            pdfView.fromAsset("bp.pdf").enableSwipe(true).swipeHorizontal(false).load()
        }


    }


}