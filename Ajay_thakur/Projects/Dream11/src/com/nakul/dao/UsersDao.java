package com.nakul.dao;

import com.nakul.model.Users;

import java.sql.*;

public class UsersDao {

    private String url = "jdbc:mysql://127.0.0.1:3306/fantasy11";
    private String user = "root";
    private String password = "root";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    public boolean addUser(Users user)throws SQLException{

        String sql = "INSERT INTO users(username,password,phone) VALUES(?,?,?)";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1,user.getUsername());
        pstm.setString(2,user.getPassword());
        pstm.setString(3, user.getPhone());
        int row =  pstm.executeUpdate();

        if(row>0){

            return true;
        } else{

            return false;
        }
    }

    public ResultSet checkUser(String phone,String password)throws SQLException{

        String sql = "SELECT * FROM users WHERE phone = ? AND password = ?";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1,phone);
        pstm.setString(2,password);

        ResultSet rs =  pstm.executeQuery();

        return rs;
    }

    public boolean addMoney(double amount,String password)throws SQLException{

        String sql = "UPDATE users SET wallet = wallet + ? WHERE password = ?";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setDouble(1,amount);
        pstm.setString(2,password);
        int row =  pstm.executeUpdate();

        if(row>0){

            return true;
        } else{

            return false;
        }
    }
}
