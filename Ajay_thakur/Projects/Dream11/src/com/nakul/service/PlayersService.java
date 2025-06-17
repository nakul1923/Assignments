package com.nakul.service;

import com.nakul.dao.PlayersDao;
import com.nakul.model.Players;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayersService {

    private PlayersDao playersDao;

    public PlayersService(){

        this.playersDao = new PlayersDao();
    }

    public boolean addPlayer(Players player) throws SQLException {

        return playersDao.addPlayer(player);
    }

    public ResultSet getListOfPlayers() throws SQLException{

        return playersDao.getListOfPlayers();
    }

    public boolean deletePlayer(int id) throws SQLException{

        return playersDao.deletePlayer(id);
    }

    public void getListOfPlayersByMatch(String match)throws SQLException{

        playersDao.getListOfPlayersByMatch(match);
    }

    public Players getPlayerById(int id)throws SQLException{

        return playersDao.getPlayerById(id);
    }
}
