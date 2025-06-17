package com.nakul;

public class PrizePoolBreakdown {

    private int rank;
    private double winnings;
    private int contestId;

    public PrizePoolBreakdown(int rank, double winnings, int contestId) {
        this.rank = rank;
        this.winnings = winnings;
        this.contestId = contestId;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getWinnings() {
        return winnings;
    }

    public void setWinnings(double winnings) {
        this.winnings = winnings;
    }

    public int getContestId() {
        return contestId;
    }

    public void setContestId(int contestId) {
        this.contestId = contestId;
    }
}
