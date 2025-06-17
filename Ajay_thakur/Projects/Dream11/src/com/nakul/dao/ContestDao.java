package com.nakul.dao;

import com.nakul.model.Contest;

import java.sql.*;

public class ContestDao {

    private String url = "jdbc:mysql://127.0.0.1:3306/fantasy11";
    private String user = "root";
    private String password = "root";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    public boolean addContest(Contest contest) throws SQLException{

        String sql = "INSERT INTO contests VALUES(?,?,?,?,?)";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setInt(1,contest.getId());
        pstm.setString(2,contest.getContestName());
        pstm.setDouble(3,contest.getEntryFee());
        pstm.setDouble(4,contest.getPrizePool());
        pstm.setInt(5,contest.getMaxPart());
        int row =  pstm.executeUpdate();

        if(row>0){

            return true;
        } else{

            return false;
        }
    }

    public ResultSet getListOfContests()throws SQLException{

        String sql = "SELECT * FROM contests;";

        Connection con  = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        return pstm.executeQuery();
    }

    public ResultSet getContestById(int id)throws SQLException{

        String sql = "SELECT * FROM contests WHERE contest_id=?";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setInt(1,id);
        ResultSet rs =  pstm.executeQuery();

        return rs;
    }

    public boolean deleteContest(int id)throws SQLException{

        String sql = "DELETE FROM contests WHERE contest_id=?";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setInt(1,id);
        int row =  pstm.executeUpdate();

        if(row>0){

            return true;
        } else{

            return false;
        }
    }
}
