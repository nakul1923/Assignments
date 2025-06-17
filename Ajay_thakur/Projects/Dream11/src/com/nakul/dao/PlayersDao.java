package com.nakul.dao;

import com.nakul.model.Players;

import java.sql.*;

public class PlayersDao {

    private String url = "jdbc:mysql://127.0.0.1:3306/fantasy11";
    private String user = "root";
    private String password = "root";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    public boolean addPlayer(Players player) throws SQLException{

        String sql = "INSERT INTO players(name,team,role,credit) VALUES(?,?,?,?)";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1,player.getPlayerName());
        pstm.setString(2,player.getPlayerTeam());
        pstm.setString(3,player.getPlayerRole());
        pstm.setDouble(4,player.getCredits());
        int row =  pstm.executeUpdate();

        if(row>0){

            return true;
        } else{

            return false;
        }
    }

    public ResultSet getListOfPlayers() throws SQLException{

        String sql = "SELECT * from players";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        ResultSet rs =  pstm.executeQuery();

        return rs;
    }

    public boolean deletePlayer(int id) throws SQLException{

        String sql = "DELETE FROM players WHERE player_id=?";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setInt(1,id);
        int row = pstm.executeUpdate();

        if(row>0){

            return true;
        } else{

            return false;
        }
    }

    public void getListOfPlayersByMatch(String name)throws SQLException{

        String str[] = name.split(" ");

        String sql = "SELECT * FROM players WHERE team = ? OR team = ?";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1,str[0]);

        pstm.setString(2,str[2]);
        ResultSet rs =  pstm.executeQuery();

        System.out.println("Select Players from the list                 Total credit limit=100");

        while(rs.next()){

            System.out.println("Id : "+rs.getInt(1)+"Name : "+rs.getString(2)+ "      Team : "+ rs.getString(3)+"      Role : "+ rs.getString(4)+"      Credit : "+rs.getDouble(5));

        }
    }

    public Players getPlayerById(int id)throws SQLException{

        String sql = "SELECT * FROM players WHERE player_id=?";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setInt(1,id);
        ResultSet rs =  pstm.executeQuery();

        if(rs.next()){

            Players player = new Players(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5));

            return player;
        }


        return null;
    }
}
