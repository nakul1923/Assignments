package com.nakul.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.nakul.coin.Coins;
public class CoinDao {

    private String url = "jdbc:mysql://127.0.0.1:3306/project";
    private String user = "root";
    private String password = "root";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    // To add a coin
    public void addCoin(Coins coin) throws SQLException{

        String sql = "INSERT INTO coins(coin_name,coin_symbol,current_price,quantity) VALUES(?,?,?,?)";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1,coin.getCoinName());
        pstm.setString(2,coin.getCoinSymbol());
        pstm.setDouble(3,coin.getCurrent_price());
        pstm.setInt(4,coin.getQuantity());
        pstm.executeUpdate();

    }

    // To update quantity of a coin

    public void updateQuantity(String name,int quantity) throws SQLException{

        String sql = "update coins set quantity = quantity + ? where coin_name = ?";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setInt(1,quantity);
        pstm.setString(2,name);
        pstm.executeUpdate();

    }

}
