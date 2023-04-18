package com.todolist

import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class CategoriesViewHolder(view:View): RecyclerView.ViewHolder(view) {

    private val tvCategoryName: TextView = view.findViewById(R.id.tvCategoryName)
    private val divider: View = view.findViewById(R.id.divider)

    fun render(taskCategory: TaskCategory){
        tvCategoryName.text="EJEMPLO"

        when (taskCategory){
            TaskCategory.Business -> {
                tvCategoryName.text = R.string.business.toString()
                divider.setBackgroundColor(ContextCompat.getColor(divider.context, R.color.business_category))
            }
            TaskCategory.Other -> {
                tvCategoryName.text = R.string.other.toString()
                divider.setBackgroundColor(ContextCompat.getColor(divider.context, R.color.other_category))
            }
            TaskCategory.Personal -> {
                tvCategoryName.text = R.string.personal.toString()
                divider.setBackgroundColor(ContextCompat.getColor(divider.context, R.color.personal_category))
            }
        }
    }

}