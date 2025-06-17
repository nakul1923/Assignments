package com.nakul;

public class Users {

    private String username;
    private String password;
    private String phone;
    private double wallet;


    public Users(String username, String phone, String password) {
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    public Users(String username, String phone, String password,double wallet) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.wallet = wallet;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
