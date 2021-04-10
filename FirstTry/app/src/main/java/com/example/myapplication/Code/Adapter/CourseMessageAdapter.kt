package com.example.myapplication.Code.Adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Code.Entity.CourseMessage
import com.example.myapplication.R

class CourseMessageAdapter(val courseMessageList: List<CourseMessage>):RecyclerView.Adapter<CourseMessageAdapter.ViewHolder>() {

    inner class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val messageInformer:TextView=view.findViewById(R.id.course_message_informer)
        val messageInformTime:TextView=view.findViewById(R.id.course_message_inform_time)
        val messageAction:TextView=view.findViewById(R.id.course_message_action)
        val messageDes:TextView=view.findViewById(R.id.course_message_des)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context)
                .inflate(R.layout.course_message_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val messageInform=courseMessageList[position]
        holder.messageInformer.text=messageInform.Cname
        holder.messageInformTime.text="2021-03-28"
        holder.messageDes.text="工程伦理---工程伦理4"+messageInform.messageContent+"工程的风险 安全与责任已经发布，请尽快完成"
        holder.messageAction.text="发布了新课件"
    }

    override fun getItemCount(): Int {
        return courseMessageList.size
    }
}