package com.hr.dao;

import com.hr.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> queryAllUsers(){
//     模拟查询数据库

        List<User> users = new ArrayList<>();
        users.add(new User(1,"admin","123"));
        users.add(new User(2,"admin2","1234"));
        users.add(new User(3,"admin3","1235"));
        users.add(new User(4,"admin4","1236"));
        users.add(new User(5,"admin5","1237"));
        users.add(new User(6,"admin6","1238"));

        return users;
    };

}
