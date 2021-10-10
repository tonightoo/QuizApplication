package com.example.quiz.data

import com.example.quiz.R
import com.example.quiz.model.QuizTitle

class Datasource {

    public fun loadTitles(): List<QuizTitle> {
        return listOf<QuizTitle>(
            QuizTitle(R.string.quiz_title1),
            QuizTitle(R.string.quiz_title2),
            QuizTitle(R.string.quiz_title3),
            QuizTitle(R.string.quiz_title4),
            QuizTitle(R.string.quiz_title5),
            QuizTitle(R.string.quiz_title6),
            QuizTitle(R.string.quiz_title7),
            QuizTitle(R.string.quiz_title8),
            QuizTitle(R.string.quiz_title9),
            QuizTitle(R.string.quiz_title10)
        )
    }



}