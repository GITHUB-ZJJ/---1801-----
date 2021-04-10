package com.example.myapplication.Code.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Code.Adapter.CourseAdapter
import com.example.myapplication.Code.Context.MyApplication
import com.example.myapplication.Code.Entity.Course
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentCourseBinding

class CourseFragment : Fragment() {
    private val courseList=ArrayList<Course>()
    private lateinit var mBinding:FragmentCourseBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        initCourse()

        mBinding= FragmentCourseBinding.inflate(inflater)

        val view=mBinding.root

        val layoutManager=LinearLayoutManager(MyApplication.context)

        mBinding.courseRecyclerView.layoutManager=layoutManager

        val adapter=CourseAdapter(courseList)

        mBinding.courseRecyclerView.adapter=adapter

        return view
    }
    private fun initCourse(){

        repeat(4){
            courseList.add(Course("操作系统","物联网1801-02"))
            courseList.add(Course("工程伦理","2021春-全校"))
            courseList.add(Course("软件工程","2021春-物联网1801"))
        }

    }
}