package com.archery.model;

public class MatchPlayer {

	public static final String ON = "ON";
    public static final String OFF = "OFF";
    public static final String SUBSTITUTE = "SUBSTITUTE";
    
    private int playerId;
    private String playerName;
    private String status;
    private int position;
    
    public MatchPlayer() {}
    
    public MatchPlayer(int playerId,String playerName,String status,int position) {
        this.playerId=playerId;
        this.playerName=playerName;
        this.status=status;
        this.position=position;
    }
    public int getPlayerId() {
        return playerId;
    }
    public void setPlayerId(int playerId) {
        this.playerId=playerId;
    }
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName=playerName;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status=status;
    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position=position;
    }
    @Override
    public String toString() {
        return "MatchPlayer{playerId="+playerId+", playerName='"+playerName+"', status='"+status+"', position="+position+"}";
    }
}