package com.example.myapplication.Code.Repository

import com.example.myapplication.Code.Context.MyApplication
import com.example.myapplication.Code.DataBase.AppDatabase
import com.example.myapplication.Code.Entity.User

object Repository {
    //UserDao

    //插入用户
    fun insertUser(user: User):Long{
        return AppDatabase.getDatabase(MyApplication.context).userDao().insertUser(user)
    }
    //更新用户
    fun updataUser(newUser: User){
        return AppDatabase.getDatabase(MyApplication.context).userDao().updateUser(newUser)
    }

    //查询用户
    fun loadAllUser():List<User>{
        return AppDatabase.getDatabase(MyApplication.context).userDao().loadAllUser()
    }
    //根据用户名和密码查询数据
    fun queryUserByUserNameAndPassWord(userName:String,passWord:String):User{
        return AppDatabase.getDatabase(MyApplication.context).userDao().queryUserByUserNameAndPassWord(userName,passWord)
    }
    //根据用户名查询用户
    fun queryUserByUserName(userName:String):User{
        return AppDatabase.getDatabase(MyApplication.context).userDao().queryUserByUserName(userName)
    }
    //删除用户
    fun delete(user: User){
        return AppDatabase.getDatabase(MyApplication.context).userDao().delete(user)
    }

    //根据用户名修改密码
    fun  updateUserByUserName(userName: String,passWord: String){
        return AppDatabase.getDatabase(MyApplication.context).userDao().updateUserByUserName(userName,passWord)
    }
    //根据用户名删除用户
    fun deleteUserByUserName(userName: String):User{
        return AppDatabase.getDatabase(MyApplication.context).userDao().deleteUserByUserName(userName)
    }

}
