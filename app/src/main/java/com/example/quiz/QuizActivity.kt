package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quiz.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {

    companion object {
        const val QUIZ_ID = "quizId"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val quizId: Int? = intent?.extras?.getInt(QUIZ_ID)

        val textId = resources.getIdentifier("quiz_content$quizId","string", packageName)

        binding.quizImage.setImageResource(R.drawable.mark_question)
        binding.quizText.text = this.resources.getString(textId)

        binding.answerButton.setOnClickListener {
            val intent = Intent(this, AnswerActivity::class.java)
            intent.putExtra(QUIZ_ID, quizId)
            this.startActivity(intent)
        }

        binding.backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            this.startActivity(intent)
        }

    }
}