package com.nakul.coin;

public class Coins {

    private String coinName;
    private String coinSymbol;
    private double current_price;
    private int quantity;

    public Coins(String coinName, String coinSymbol, double current_price, int quantity) {
        this.coinName = coinName;
        this.coinSymbol = coinSymbol;
        this.current_price = current_price;
        this.quantity = quantity;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public String getCoinSymbol() {
        return coinSymbol;
    }

    public void setCoinSymbol(String coinSymbol) {
        this.coinSymbol = coinSymbol;
    }

    public double getCurrent_price() {
        return current_price;
    }

    public void setCurrent_price(double current_price) {
        this.current_price = current_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
