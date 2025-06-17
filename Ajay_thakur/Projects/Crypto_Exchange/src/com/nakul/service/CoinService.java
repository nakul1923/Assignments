package com.nakul.service;

import com.nakul.coin.Coins;
import com.nakul.dao.CoinDao;

import java.sql.SQLException;

public class CoinService {

    private CoinDao coindao ;

    public CoinService(){

        this.coindao = new CoinDao();

    }
// To add a new coin
    public void addCoin(Coins coin) throws SQLException {

        coindao.addCoin(coin);
    }

    //
    public void updateQuantity(String name,int quantity) throws  SQLException{

        coindao.updateQuantity(name,quantity);
    }
}
