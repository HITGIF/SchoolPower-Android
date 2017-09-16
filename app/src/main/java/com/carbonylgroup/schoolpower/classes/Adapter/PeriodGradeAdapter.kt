/**
 * Copyright (C) 2017 Gustav Wang
 */

package com.carbonylgroup.schoolpower.classes.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

import com.carbonylgroup.schoolpower.R
import com.carbonylgroup.schoolpower.R2
import com.carbonylgroup.schoolpower.classes.Data.Subject
import com.carbonylgroup.schoolpower.classes.Utils.Utils
import kotterknife.bindView

class PeriodGradeAdapter(private val context: Context, objects: Map<String, Subject.Grade>) : RecyclerView.Adapter<PeriodGradeAdapter.PeriodGradeViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private val gradeMap: Map<String, Subject.Grade> = objects
    private val utils: Utils = Utils(context)
    private val keys = objects.keys.toTypedArray()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeriodGradeViewHolder {

        val view = inflater.inflate(R.layout.period_grade_list_item, parent, false)
        return PeriodGradeViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: PeriodGradeViewHolder, position: Int) {

        val item = gradeMap[keys[position]]!!
        viewHolder.period_indicator.text = keys[position]
        viewHolder.period_latter_grade.text = item.letter
        viewHolder.period_percentage_grade.text = item.percentage
        viewHolder.period_grade_background.setBackgroundColor(utils.getColorByLetterGrade(context, item.letter))
    }

    override fun getItemCount(): Int {
        return gradeMap.size
    }

    class PeriodGradeViewHolder internal constructor(view: View) : RecyclerView.ViewHolder(view) {
        val period_indicator: TextView by bindView(R2.id.period_indicator)
        val period_latter_grade: TextView by bindView(R2.id.period_latter_grade)
        val period_percentage_grade: TextView by bindView(R2.id.period_percentage_grade)
        val period_grade_background: LinearLayout by bindView(R2.id.period_grade_background)
    }
}