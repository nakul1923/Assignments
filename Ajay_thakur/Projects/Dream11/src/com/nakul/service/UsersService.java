package com.nakul.service;

import com.nakul.dao.UsersDao;
import com.nakul.model.Users;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersService {

    private UsersDao usersDao;

    public UsersService(){

        this.usersDao = new UsersDao();
    }

    public boolean addUser(Users user)throws SQLException {

        return usersDao.addUser(user);
    }

    public ResultSet checkUser(String phone, String password)throws SQLException{

        return usersDao.checkUser(phone,password);
    }

    public boolean addMoney(double amount,String password)throws SQLException{

        return usersDao.addMoney(amount,password);
    }
}
