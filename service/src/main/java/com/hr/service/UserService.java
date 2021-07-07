package com.hr.service;

import com.hr.dao.UserDao;
import com.hr.entity.User;

import java.util.List;

public class UserService {
    public List<User> getAllUsers(){
        UserDao userDao = new UserDao();
        return  userDao.queryAllUsers();
    }
}
