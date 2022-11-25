package com.example.mathsimulator

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LecturesActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lectures)
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        val imageqbtn = findViewById<ImageButton>(R.id.imageBack3)
        imageqbtn.setOnClickListener{
            finish()
        }


        val key_one = "OK_0"
        val key_two = "OK_1"
        val key_three = "OK_2"
        val key_four = "OK_3"


        val listView = findViewById<ListView>(R.id.listview_1)
        val items = ArrayList<Model>()
        items.add(Model("Основы счёта","Научись считать быстрее!", R.drawable.ic_score))
        items.add(Model("Таблица умножения","Таблица поможет тебе!", R.drawable.ic_multiplication))
        items.add(Model("Уравнения","Пойми уравнения!", R.drawable.ic_equations))
        items.add(Model("Задачи","Как решать задачки быстрее!", R.drawable.ic_task))

        val adapter = MyCustomAdapter(this,R.layout.item_custom_layout, items)
        listView.adapter = adapter

        listView.setOnItemClickListener{parent,view,position,id ->
            if (position == 0){val newWindow = Intent(this,WorkZone::class.java)
                newWindow.putExtra("T", key_one);
                startActivity(newWindow)}
            if (position == 1){val newWindow = Intent(this,WorkZone::class.java)
                newWindow.putExtra("T",key_two);
                startActivity(newWindow)}
            if (position == 2){val newWindow = Intent(this,WorkZone::class.java)
                newWindow.putExtra("T", key_three);
                startActivity(newWindow)}
            if (position == 3){val newWindow = Intent(this,WorkZone::class.java)
                Toast.makeText(this,"Временно недоступно!", Toast.LENGTH_SHORT).show()
                """newWindow.putExtra("T", key_four);
                startActivity(newWindow)"""}
            }
        }
    }