package com.nakul.dao;

import com.nakul.*;

import java.sql.*;

public class FantasyDao {

    private String url = "jdbc:mysql://127.0.0.1:3306/fantasy11";
    private String user = "root";
    private String password = "root";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    public ResultSet getListOfPlayers() throws SQLException{

        String sql = "SELECT * from players";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        ResultSet rs =  pstm.executeQuery();

        return rs;
    }

    public ResultSet availableContests() throws SQLException{

        String sql = "SELECT * FROM contests";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        ResultSet rs = pstm.executeQuery();

        return rs;
    }

    public ResultSet getContestById(int id) throws SQLException{

        String sql = "SELECT * FROM contests WHERE contest_id=?";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setInt(1,id);
        ResultSet rs =  pstm.executeQuery();

        return rs;
    }

    public void addPrizePoolBreakdown(PrizePoolBreakdown ppb)throws SQLException{

        String sql = "INSERT INTO prize_pool_breakdown VALUES(?,?,?)";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setInt(1,ppb.getRank());
        pstm.setDouble(2,ppb.getWinnings());
        pstm.setInt(3,ppb.getContestId());
        pstm.executeUpdate();

    }

    public void addUser(Users user) throws SQLException{

        String sql = "INSERT INTO users(username,phone,password) VALUES(?,?,?)";

        Connection con =getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1,user.getUsername());
        pstm.setString(2,user.getPhone());
        pstm.setString(3, user.getPassword());
        pstm.executeUpdate();
    }

    public Users checkLogin(String phone,String password) throws SQLException{

        String sql = "SELECT * FROM users WHERE phone=? AND password=? ";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1,phone);
        pstm.setString(2,password);
        ResultSet rs =  pstm.executeQuery();

        if(rs.next()){

            Users user = new Users(rs.getString("username"),rs.getString("phone"), rs.getString("password"),rs.getDouble("wallet"));

            return user;
        } else{

            return null;
        }


    }

    public Admin checkAdmin(String username,String password) throws  SQLException{

        String sql = "SELECT * FROM admin where username=? AND password=?";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1,username);
        pstm.setString(2,password);
        ResultSet rs =  pstm.executeQuery();

        if(rs.next()){

            Admin admin = new Admin(rs.getString(2),rs.getString(3));
            return admin;
        } else{

            return  null;
        }

    }

    public void addPlayer(Players player) throws SQLException{

        String sql = "INSERT INTO players(name,team,role,credit) VALUES(?,?,?,?)";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1,player.getPlayerName());
        pstm.setString(2,player.getPlayerTeam());
        pstm.setString(3,player.getPlayerRole());
        pstm.setDouble(4,player.getCredits());
        pstm.executeUpdate();

    }

    public void addContest(Contests contest) throws SQLException{

        String sql = "INSERT INTO contests VALUES(?,?,?,?,?)";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setInt(1,contest.getId());
        pstm.setString(2,contest.getContestName());
        pstm.setDouble(3,contest.getEntryFee());
        pstm.setDouble(4,contest.getPrizePool());
        pstm.setInt(5,contest.getMaxPart());
        pstm.executeUpdate();
    }

    public void deletePlayer(int id) throws SQLException{

        String sql = "DELETE FROM players WHERE player_id=?";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setInt(1,id);
        pstm.executeUpdate();

    }

    public void deleteContest(int id)throws SQLException{

        String sql = "DELETE FROM prize_pool_breakdown WHERE contest_id = ?";
        String sql1 = "DELETE FROM contests WHERE contest_id=?";
        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setInt(1,id);
        pstm.executeUpdate();

        PreparedStatement pstm1 = con.prepareStatement(sql1);
        pstm1.setInt(1,id);
        pstm1.executeUpdate();
    }

    public ResultSet getPrizePoolBreakdown(int id)throws SQLException{

        String sql = "SELECT * FROM prize_pool_breakdown WHERE contest_id=?";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setInt(1,id);
        ResultSet rs =  pstm.executeQuery();

        return rs;
    }

    public ResultSet getPlayersByMatch(String match) throws SQLException{

        String[] str = match.split(" ");

        String sql = "SELECT * FROM players WHERE team=? OR team=?";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1,str[0]);
        pstm.setString(2,str[2]);

        ResultSet rs = pstm.executeQuery();

        return rs;
    }

    public void addMoney(double amount,String phone)throws SQLException{

        String sql = "UPDATE users SET wallet= ? WHERE phone=?";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setDouble(1,amount);
        pstm.setString(2,phone);
        pstm.executeUpdate();
    }

    public Players getPlayerById(int id) throws SQLException{

        String sql = "SELECT * FROM players WHERE player_id=?";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setInt(1,id);
        ResultSet rs = pstm.executeQuery();

        if(rs.next()){

            Players player = new Players(rs.getString("name"),rs.getString("team"),rs.getString("role"),rs.getDouble("credit"));

            return player;

        } else{

            return null;
        }

    }

}
