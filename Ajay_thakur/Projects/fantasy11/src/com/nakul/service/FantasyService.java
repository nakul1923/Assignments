package com.nakul.service;

import com.nakul.*;
import com.nakul.dao.FantasyDao;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FantasyService {

    private FantasyDao fantasyDao;

    public FantasyService(){

        this.fantasyDao = new FantasyDao();
    }

    public ResultSet getListOfPlayers() throws SQLException{

        return fantasyDao.getListOfPlayers();
    }

    public ResultSet availableContests() throws SQLException{

        return fantasyDao.availableContests();
    }

    public ResultSet getContestById(int id) throws SQLException{

        return fantasyDao.getContestById(id);
    }

    public void addPrizePoolBreakdown(PrizePoolBreakdown ppb) throws SQLException{

        fantasyDao.addPrizePoolBreakdown(ppb);
    }

    public void addUser(Users user) throws SQLException {

        fantasyDao.addUser(user);
    }

    public Users checkLogin(String phone,String password) throws SQLException{

        return fantasyDao.checkLogin(phone,password);
    }

    public Admin checkAdmin(String username,String password) throws  SQLException{

        return fantasyDao.checkAdmin(username,password);
    }

    public void addPlayer(Players player) throws  SQLException{

        fantasyDao.addPlayer(player);
    }

    public void addContest(Contests contest) throws SQLException{

        fantasyDao.addContest(contest);
    }
    public void deletePlayer(int id)throws SQLException{

        fantasyDao.deletePlayer(id);
    }

    public void deleteContest(int id)throws SQLException{

        fantasyDao.deleteContest(id);
    }

    public ResultSet getPrizePoolBreakdown(int id)throws SQLException{

        return fantasyDao.getPrizePoolBreakdown(id);
    }

    public ResultSet getPlayersByMatch(String match)throws SQLException{

        return fantasyDao.getPlayersByMatch(match);
    }

    public void addMoney(double amount,String phone)throws SQLException{

        fantasyDao.addMoney(amount,phone);
    }

    public Players getPlayerById(int id)throws SQLException{

        return fantasyDao.getPlayerById(id);
    }


}
