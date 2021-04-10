package com.example.myapplication.Code.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Code.Adapter.CourseMessageAdapter
import com.example.myapplication.Code.Context.MyApplication
import com.example.myapplication.Code.Entity.CourseMessage
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentMessageBinding


class MessageFragment : Fragment() {

    private val messageList=ArrayList<CourseMessage>()
    private lateinit var mBinding:FragmentMessageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        initMessage()
        mBinding= FragmentMessageBinding.inflate(inflater)
        val view=mBinding.root

        val layoutManager=LinearLayoutManager(MyApplication.context)
        mBinding.messageRecyclerView.layoutManager=layoutManager
        val  adapter=CourseMessageAdapter(messageList)
        mBinding.messageRecyclerView.adapter=adapter
        return view
    }
    private fun initMessage(){
        repeat(4){
            messageList.add(CourseMessage("林秀丽","工程的安全和风险"))
            messageList.add(CourseMessage("印莹","需求分析原则"))
            messageList.add(CourseMessage("印莹","演进系列"))
        }
    }
}