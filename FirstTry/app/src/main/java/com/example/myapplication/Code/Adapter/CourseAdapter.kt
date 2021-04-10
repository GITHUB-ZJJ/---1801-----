package com.example.myapplication.Code.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Code.Entity.Course
import com.example.myapplication.R
import de.hdodenhof.circleimageview.CircleImageView

class CourseAdapter(val courseList: List<Course>): RecyclerView.Adapter<CourseAdapter.ViewHolder>(){
    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val course_name:TextView=view.findViewById(R.id.course_name)
        val course_des:TextView=view.findViewById(R.id.course_des)
        val course_teacher_name:TextView=view.findViewById(R.id.teacher_name)
        val course_teacher_portial:CircleImageView=view.findViewById(R.id.teacher_portial)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.course_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val course=courseList[position]
        holder.course_name.text=course.cname
        holder.course_des.text=course.desc
        holder.course_teacher_name.text="张政馗"
        holder.course_teacher_portial.setImageResource(R.drawable.portial)
    }

    override fun getItemCount(): Int {
        return courseList.size
    }
}