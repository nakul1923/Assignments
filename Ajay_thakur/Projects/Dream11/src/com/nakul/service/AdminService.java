package com.nakul.service;

import com.nakul.dao.AdminDao;

import java.sql.SQLException;

public class AdminService {

    private AdminDao adminDao;

    public AdminService(){

        this.adminDao = new AdminDao();
    }

    public boolean checkAdmin(String username,String password) throws SQLException {

        return adminDao.checkAdmin(username, password);
    }
}
