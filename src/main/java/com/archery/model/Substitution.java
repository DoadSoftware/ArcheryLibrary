package com.archery.model;

public class Substitution {
    private int replacedPlayerId;
    private int substitutePlayerId;
    private int previousCurrentPlayerId;
    private int setNumber;
    private int arrowCountAtSubstitution;

    public Substitution(){}

    public Substitution(int replacedPlayerId,int substitutePlayerId,int previousCurrentPlayerId,int setNumber,int arrowCountAtSubstitution){
        this.replacedPlayerId=replacedPlayerId;
        this.substitutePlayerId=substitutePlayerId;
        this.previousCurrentPlayerId=previousCurrentPlayerId;
        this.setNumber=setNumber;
        this.arrowCountAtSubstitution=arrowCountAtSubstitution;
    }

    public int getReplacedPlayerId(){
        return replacedPlayerId;
    }

    public void setReplacedPlayerId(int replacedPlayerId){
        this.replacedPlayerId=replacedPlayerId;
    }

    public int getSubstitutePlayerId(){
        return substitutePlayerId;
    }

    public void setSubstitutePlayerId(int substitutePlayerId){
        this.substitutePlayerId=substitutePlayerId;
    }

    public int getPreviousCurrentPlayerId(){
        return previousCurrentPlayerId;
    }

    public void setPreviousCurrentPlayerId(int previousCurrentPlayerId){
        this.previousCurrentPlayerId=previousCurrentPlayerId;
    }

    public int getSetNumber(){
        return setNumber;
    }

    public void setSetNumber(int setNumber){
        this.setNumber=setNumber;
    }

    public int getArrowCountAtSubstitution(){
        return arrowCountAtSubstitution;
    }

    public void setArrowCountAtSubstitution(int arrowCountAtSubstitution){
        this.arrowCountAtSubstitution=arrowCountAtSubstitution;
    }

	@Override
	public String toString() {
		return "Substitution [replacedPlayerId=" + replacedPlayerId + ", substitutePlayerId=" + substitutePlayerId
				+ ", previousCurrentPlayerId=" + previousCurrentPlayerId + ", setNumber=" + setNumber
				+ ", arrowCountAtSubstitution=" + arrowCountAtSubstitution + "]";
	}
    
}