package com.nakul.model;

public class Contest {

    private int id;
    private String contestName;
    private double entryFee;
    private double prizePool;
    private int maxPart;

    public Contest(int id, String contestName, double entryFee, double prizePool, int maxPart) {
        this.id = id;
        this.contestName = contestName;
        this.entryFee = entryFee;
        this.prizePool = prizePool;
        this.maxPart = maxPart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContestName() {
        return contestName;
    }

    public void setContestName(String contestName) {
        this.contestName = contestName;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }

    public double getPrizePool() {
        return prizePool;
    }

    public void setPrizePool(double prizePool) {
        this.prizePool = prizePool;
    }

    public int getMaxPart() {
        return maxPart;
    }

    public void setMaxPart(int maxPart) {
        this.maxPart = maxPart;
    }
}
