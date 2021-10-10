package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quiz.databinding.ActivityAnswerBinding

class AnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAnswerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val quizId = intent?.extras?.getInt(QuizActivity.QUIZ_ID)

        val answerId = resources.getIdentifier("quiz_answer${quizId}", "string", packageName)
        binding.answer.text = resources.getString(answerId)

        binding.backButton.setOnClickListener {
            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra(QuizActivity.QUIZ_ID, quizId)
            this.startActivity(intent)
        }

    }
}