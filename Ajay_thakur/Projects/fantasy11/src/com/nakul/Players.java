package com.nakul;

public class Players {

    private String playerName;
    private String playerTeam;
    private String playerRole;
    private double credits;

    public Players(String playerName, String playerTeam, String playerRole, double credits) {
        this.playerName = playerName;
        this.playerTeam = playerTeam;
        this.playerRole = playerRole;
        this.credits = credits;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerTeam() {
        return playerTeam;
    }

    public void setPlayerTeam(String playerTeam) {
        this.playerTeam = playerTeam;
    }

    public String getPlayerRole() {
        return playerRole;
    }

    public void setPlayerRole(String playerRole) {
        this.playerRole = playerRole;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return
                playerName + "         " +
                "         " + playerTeam + "       " +
                "         " + playerRole + "       " +
                "         " + credits;
    }
}
