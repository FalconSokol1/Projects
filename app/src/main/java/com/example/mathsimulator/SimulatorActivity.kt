package com.example.mathsimulator

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import com.example.mathsimulator.databinding.ActivitySimulatorBinding

class SimulatorActivity : AppCompatActivity() {
    private val SHORT_DELAY = 1000
    var rightAnswer: String?=null
    var rightAnswerCount = 0
    var quizCount = 1
    val QUIZ_COUNT = 4
    var quizDataTable = mutableListOf(
        mutableListOf("Сколько будет 2*6?","12","32","1"),
        mutableListOf("Сколько будет 4*5?","20","23","2"),
        mutableListOf("Сколько будет 9*22?","198","196","199"),
        mutableListOf("Сколько будет 1*1?","1","11","10"),
    )
    var quizDataАrithmetic = mutableListOf(
        mutableListOf("Сколько будет 2*6?","12","32","1"),
        mutableListOf("Сколько будет 4*5?","20","23","2"),
        mutableListOf("Сколько будет 9*22?","198","196","199"),
        mutableListOf("Сколько будет 1*1?","1","11","10"),
    )
    var quizDataEquations = mutableListOf(
        mutableListOf("Сколько будет 2*6?","12","32","1"),
        mutableListOf("Сколько будет 4*5?","20","23","2"),
        mutableListOf("Сколько будет 9*22?","198","196","199"),
        mutableListOf("Сколько будет 1*1?","1","11","10"),
    )

     lateinit var binding: ActivitySimulatorBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simulator)
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        binding = ActivitySimulatorBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        quizDataTable.shuffle()

        showNextQuiz()
        val imageqbtn = findViewById<ImageButton>(R.id.imageBack2)
        imageqbtn.setOnClickListener{
            finish()
        }

    }
     fun showNextQuiz(){
        var quiz = quizDataTable[0]
        binding.textView.text = quiz[0]
        rightAnswer = quiz[1]

        quiz.removeAt(0)

        quiz.shuffle()

        binding.bOne.text = quiz[0]
        binding.bTwo.text = quiz[1]
        binding.bThree.text = quiz[2]

        quizDataTable.removeAt(0)


    }
     fun checkQuizCount(){
        if(quizCount == QUIZ_COUNT){
            val intent = Intent(this@SimulatorActivity,ResultActivity::class.java)
            intent.putExtra("RIGHT_ANSWERS_T",rightAnswerCount)
            startActivity(intent)

        }else{
            quizCount++
            showNextQuiz()
        }
    }

    fun checkAnswer(view: View) {
        val answerBtn: Button = findViewById(view.id)
        val btnText = answerBtn.text.toString()

        if (btnText == rightAnswer){
            Toast.makeText(this,"Правильно",LENGTH_SHORT).show()
            rightAnswerCount++
            checkQuizCount()

        } else{
            Toast.makeText(this,"Упс...Вы ошиблись)",SHORT_DELAY).show()
            checkQuizCount()

        }


    }

}