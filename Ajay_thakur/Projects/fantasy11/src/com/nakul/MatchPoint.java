package com.nakul;

public class MatchPoint {

    private int matchId;
    private int playerId;
    private int runs;
    private int wickets;
    private int catches;
    private int totalPoint;

    public MatchPoint(int matchId, int playerId, int runs, int wickets, int catches, int totalPoint) {
        this.matchId = matchId;
        this.playerId = playerId;
        this.runs = runs;
        this.wickets = wickets;
        this.catches = catches;
        this.totalPoint = totalPoint;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public int getCatches() {
        return catches;
    }

    public void setCatches(int catches) {
        this.catches = catches;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }
}
