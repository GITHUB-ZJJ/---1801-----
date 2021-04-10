package com.example.myapplication.Code.Dao

import androidx.room.*
import com.example.myapplication.Code.Entity.User

@Dao
interface UserDao {
    //插入用户
    @Insert
    fun insertUser(user: User):Long
    //更新用户
    @Update
    fun updateUser(newUser: User)
    //查询所有用户
    @Query("select *from User")
    fun loadAllUser():List<User>
    //根据用户名和密码查询数据
    @Query("select * from User where userName =:userName and passWord=:passWord")
    fun queryUserByUserNameAndPassWord(userName:String,passWord:String):User

    //根据用户名查询用户
    @Query("select * from User where userName =:userName")
    fun queryUserByUserName(userName:String):User
    //删除用户
    @Delete
    fun delete(user: User)

    //根据用户名修改密码
    @Query("update User Set passWord=:passWord where userName=:userName")
    fun  updateUserByUserName(userName: String,passWord: String)

    //根据用户名删除用户
    @Query("delete from User where userName=:userName")
    fun deleteUserByUserName(userName: String):User
}