package com.nakul.dao;

import com.nakul.model.PrizePoolBreakdown;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrizePoolBreakdownDao {

    private String url = "jdbc:mysql://127.0.0.1:3306/fantasy11";
    private String user = "root";
    private String password = "root";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    public boolean addPrizePool(PrizePoolBreakdown ppb) throws SQLException{

        String sql = "INSERT INTO prize_pool_breakdown VALUES(?,?,?)";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setInt(1,ppb.getRank());
        pstm.setDouble(2,ppb.getWinnings());
        pstm.setInt(3,ppb.getContestId());
        int row =  pstm.executeUpdate();

        if(row>0){

            return true;
        }else{

            return false;
        }
    }

    public void deletePrizePoolBreakdown(int id)throws SQLException{

        String sql = "DELETE FROM prize_pool_breakdown WHERE contest_id=?";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setInt(1,id);
        pstm.executeUpdate();
    }
}
