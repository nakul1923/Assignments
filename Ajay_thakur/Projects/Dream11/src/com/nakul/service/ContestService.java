package com.nakul.service;

import com.nakul.dao.ContestDao;
import com.nakul.model.Contest;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ContestService {

    private ContestDao contestDao;

    public ContestService(){

        this.contestDao = new ContestDao();
    }

    public boolean addContest(Contest contest)throws SQLException {

        return contestDao.addContest(contest);
    }

    public boolean deleteContest(int id)throws SQLException{

        return contestDao.deleteContest(id);
    }

    public ResultSet getListOfContests()throws SQLException{

        return contestDao.getListOfContests();
    }

    public ResultSet getContestById(int id)throws SQLException{

        return contestDao.getContestById(id);
    }
}
