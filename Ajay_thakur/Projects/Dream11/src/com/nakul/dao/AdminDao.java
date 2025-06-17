package com.nakul.dao;

import java.sql.*;

public class AdminDao {

    private String url = "jdbc:mysql://127.0.0.1:3306/fantasy11";
    private String user = "root";
    private String password = "root";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    public boolean checkAdmin(String username,String password)throws SQLException{

        String sql = "SELECT * FROM admin where username=? AND password=?";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1,username);
        pstm.setString(2,password);

        ResultSet rs = pstm.executeQuery();
        while(rs.next()){

            if(username.equals(rs.getString(2))&&password.equals(rs.getString(3))){

                return true;
            }
        }

        return false;
    }

}
