package com.archery.model;

public class SetResult {
    private int setNumber;
    private int teamAScore;
    private int teamBScore;

    public SetResult(){}

    public SetResult(int setNumber,int teamAScore,int teamBScore){
        this.setNumber=setNumber;
        this.teamAScore=teamAScore;
        this.teamBScore=teamBScore;
    }

    public int getSetNumber(){return setNumber;}
    public void setSetNumber(int setNumber){this.setNumber=setNumber;}
    public int getTeamAScore(){return teamAScore;}
    public void setTeamAScore(int teamAScore){this.teamAScore=teamAScore;}
    public int getTeamBScore(){return teamBScore;}
    public void setTeamBScore(int teamBScore){this.teamBScore=teamBScore;}

	@Override
	public String toString() {
		return "SetResult [setNumber=" + setNumber + ", teamAScore=" + teamAScore + ", teamBScore=" + teamBScore
				+ ", getSetNumber()=" + getSetNumber() + ", getTeamAScore()=" + getTeamAScore() + ", getTeamBScore()="
				+ getTeamBScore() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
    
}