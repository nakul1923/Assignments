package com.nakul.service;

import com.nakul.dao.PrizePoolBreakdownDao;
import com.nakul.model.PrizePoolBreakdown;

import java.sql.SQLException;

public class PrizePoolBreakdownService {

    private PrizePoolBreakdownDao prizePoolBreakdownDao;

    public PrizePoolBreakdownService(){

        this.prizePoolBreakdownDao = new PrizePoolBreakdownDao();
    }

    public boolean addPrizePool(PrizePoolBreakdown ppb)throws SQLException {

        return prizePoolBreakdownDao.addPrizePool(ppb);
    }

    public void deletePrizePoolBreakdown(int id)throws SQLException {

          prizePoolBreakdownDao.deletePrizePoolBreakdown(id);
    }
}
