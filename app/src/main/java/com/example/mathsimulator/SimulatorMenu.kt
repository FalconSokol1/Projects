package com.example.mathsimulator

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.ListView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class SimulatorMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simulator_menu)
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        val imageqbtn = findViewById<ImageButton>(R.id.imageBack4)
        imageqbtn.setOnClickListener{
            finish()
        }

        val listView = findViewById<ListView>(R.id.listview_2)
        val items = ArrayList<Model>()
        items.add(Model("Основы счёта","Складывай и вычитай!", R.drawable.ic_score))
        items.add(Model("Таблица умножения","Проверь знания таблицы!", R.drawable.ic_multiplication))
        items.add(Model("Уравнения","Порешай уравнения!", R.drawable.ic_equations))
        items.add(Model("Задачи","Оцени возможности, решив задачки!", R.drawable.ic_task))

        val adapter = MyCustomAdapter(this,R.layout.item_custom_layout, items)
        listView.adapter = adapter

        listView.setOnItemClickListener{parent,view,position,id ->
           if (position == 0){
               Toast.makeText(this,"Временно недоступно!",LENGTH_SHORT).show()
               """val newWindow = Intent(this,SimulatorActivity::class.java)
                startActivity(newWindow)""" }
            if (position == 1){val newWindow = Intent(this,SimulatorActivity::class.java)
                startActivity(newWindow)}
            if (position == 2){ Toast.makeText(this,"Временно недоступно!",LENGTH_SHORT).show()
                """val newWindow = Intent(this,SimulatorActivity::class.java)
                startActivity(newWindow)"""}
            if (position == 3){Toast.makeText(this,"Временно недоступно!",LENGTH_SHORT).show()
                """val newWindow = Intent(this,SimulatorActivity::class.java)
                startActivity(newWindow)"""}
        }

    }
}