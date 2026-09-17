package com.archery.model;

public class Arrow {
    private long id;
    private int arrowNumber;
    private int playerId;
    private String playerName;
    private int teamId;
    private int setNumber;
    private double xPercent;
    private double yPercent;
    private int score;
    private String scoreDisplay;
    private int previousCurrentPlayerId;

    public Arrow(){}

    public Arrow(int arrowNumber,int playerId,String playerName,int teamId,int setNumber,double xPercent,double yPercent,int score,String scoreDisplay,int previousCurrentPlayerId){
        this.arrowNumber=arrowNumber;
        this.playerId=playerId;
        this.playerName=playerName;
        this.teamId=teamId;
        this.setNumber=setNumber;
        this.xPercent=xPercent;
        this.yPercent=yPercent;
        this.score=score;
        this.scoreDisplay=scoreDisplay;
        this.previousCurrentPlayerId=previousCurrentPlayerId;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id=id;
    }

    public int getArrowNumber(){
        return arrowNumber;
    }

    public void setArrowNumber(int arrowNumber){
        this.arrowNumber=arrowNumber;
    }

    public int getPlayerId(){
        return playerId;
    }

    public void setPlayerId(int playerId){
        this.playerId=playerId;
    }

    public String getPlayerName(){
        return playerName;
    }

    public void setPlayerName(String playerName){
        this.playerName=playerName;
    }

    public int getTeamId(){
        return teamId;
    }

    public void setTeamId(int teamId){
        this.teamId=teamId;
    }

    public int getSetNumber(){
        return setNumber;
    }

    public void setSetNumber(int setNumber){
        this.setNumber=setNumber;
    }

    public double getxPercent(){
        return xPercent;
    }

    public void setxPercent(double xPercent){
        this.xPercent=xPercent;
    }

    public double getyPercent(){
        return yPercent;
    }

    public void setyPercent(double yPercent){
        this.yPercent=yPercent;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score=score;
    }

    public String getScoreDisplay(){
        return scoreDisplay;
    }

    public void setScoreDisplay(String scoreDisplay){
        this.scoreDisplay=scoreDisplay;
    }

    public int getPreviousCurrentPlayerId(){
        return previousCurrentPlayerId;
    }

    public void setPreviousCurrentPlayerId(int previousCurrentPlayerId){
        this.previousCurrentPlayerId=previousCurrentPlayerId;
    }

	@Override
	public String toString() {
		return "Arrow [id=" + id + ", arrowNumber=" + arrowNumber + ", playerId=" + playerId + ", playerName="
				+ playerName + ", teamId=" + teamId + ", setNumber=" + setNumber + ", xPercent=" + xPercent
				+ ", yPercent=" + yPercent + ", score=" + score + ", scoreDisplay=" + scoreDisplay
				+ ", previousCurrentPlayerId=" + previousCurrentPlayerId + "]";
	}
    
}