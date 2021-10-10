package com.example.quiz.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quiz.QuizActivity
import com.example.quiz.R
import com.example.quiz.holder.ItemViewHolder
import com.example.quiz.model.QuizTitle

class ItemAdapter(private val context: Context, private val dataset: List<QuizTitle>)
    : RecyclerView.Adapter<ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.button.text = context.resources.getString(item.stringResourceId)
        holder.button.setOnClickListener {
            val context = holder.view.context
            val intent = Intent(context, QuizActivity::class.java)
            intent.putExtra(QuizActivity.QUIZ_ID, position + 1)
            context.startActivity(intent)
            /**
             * Intent.ACTION_VIEW
             * CATEGORY_APP_MAPS
             * CATEGORY_APP_EMAIL
             * CATEGORY_APP_GALLERY
             * ACTION_SET_ALARM
             * ACTION_DIAL
             */
        }
    }

    override fun getItemCount(): Int = dataset.size


}