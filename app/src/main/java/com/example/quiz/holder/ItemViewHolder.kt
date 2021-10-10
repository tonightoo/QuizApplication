package com.example.quiz.holder

import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.quiz.R

class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view){
    val button: Button = view.findViewById(R.id.item_button)
}