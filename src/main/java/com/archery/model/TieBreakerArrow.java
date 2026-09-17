package com.archery.model;

public class TieBreakerArrow {
    private int arrowNumber;
    private int playerId;
    private String playerName;
    private int teamId;
    private double xPercent;
    private double yPercent;
    private double distanceFromCentre;

    public TieBreakerArrow(){}

    public TieBreakerArrow(int arrowNumber,int playerId,String playerName,int teamId,double xPercent,double yPercent,double distanceFromCentre){
        this.arrowNumber=arrowNumber;
        this.playerId=playerId;
        this.playerName=playerName;
        this.teamId=teamId;
        this.xPercent=xPercent;
        this.yPercent=yPercent;
        this.distanceFromCentre=distanceFromCentre;
    }

    public int getArrowNumber(){return arrowNumber;}
    public void setArrowNumber(int arrowNumber){this.arrowNumber=arrowNumber;}
    public int getPlayerId(){return playerId;}
    public void setPlayerId(int playerId){this.playerId=playerId;}
    public String getPlayerName(){return playerName;}
    public void setPlayerName(String playerName){this.playerName=playerName;}
    public int getTeamId(){return teamId;}
    public void setTeamId(int teamId){this.teamId=teamId;}
    public double getxPercent(){return xPercent;}
    public void setxPercent(double xPercent){this.xPercent=xPercent;}
    public double getyPercent(){return yPercent;}
    public void setyPercent(double yPercent){this.yPercent=yPercent;}
    public double getDistanceFromCentre(){return distanceFromCentre;}
    public void setDistanceFromCentre(double distanceFromCentre){this.distanceFromCentre=distanceFromCentre;}

	@Override
	public String toString() {
		return "TieBreakerArrow [arrowNumber=" + arrowNumber + ", playerId=" + playerId + ", playerName=" + playerName
				+ ", teamId=" + teamId + ", xPercent=" + xPercent + ", yPercent=" + yPercent + ", distanceFromCentre="
				+ distanceFromCentre + "]";
	}
    
    
}