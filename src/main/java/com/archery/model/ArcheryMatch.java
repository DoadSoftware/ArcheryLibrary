package com.archery.model;

import java.util.ArrayList;
import java.util.List;

public class ArcheryMatch {
	
    private String matchFileName;
    private int teamAId;
    private int teamBId;
    private Team teamA;
    private Team teamB;
    private int teamACurrentPlayers=4;
    private int teamASubstitutes=6;
    private int teamBCurrentPlayers=4;
    private int teamBSubstitutes=6;
    private List<MatchPlayer> teamAPlayers=new ArrayList<>();
    private List<MatchPlayer> teamBPlayers=new ArrayList<>();
    private int currentPlayerId;
    private boolean started=false;
    private boolean completed=false;
    private int totalSets=1;
    private int currentSet=1;
    private List<SetResult> setResults=new ArrayList<>();
    private List<Arrow> arrows=new ArrayList<>();
    private List<Substitution> substitutions=new ArrayList<>();
    private boolean tieBreakerStarted=false;
    private boolean tieBreakerCompleted=false;
    private int tieBreakerWinnerTeamId;
    private int tieBreakerRound=1;
    private List<TieBreakerArrow> tieBreakerArrows=new ArrayList<>();

    public String getMatchFileName(){return matchFileName;}
    public void setMatchFileName(String matchFileName){this.matchFileName=matchFileName;}
    public int getTeamAId(){return teamAId;}
    public void setTeamAId(int teamAId){this.teamAId=teamAId;}
    public int getTeamBId(){return teamBId;}
    public void setTeamBId(int teamBId){this.teamBId=teamBId;}
    public Team getTeamA(){return teamA;}
    public void setTeamA(Team teamA){this.teamA=teamA;}
    public Team getTeamB(){return teamB;}
    public void setTeamB(Team teamB){this.teamB=teamB;}
    public int getTeamACurrentPlayers(){return teamACurrentPlayers;}
    public void setTeamACurrentPlayers(int teamACurrentPlayers){this.teamACurrentPlayers=teamACurrentPlayers;}
    public int getTeamASubstitutes(){return teamASubstitutes;}
    public void setTeamASubstitutes(int teamASubstitutes){this.teamASubstitutes=teamASubstitutes;}
    public int getTeamBCurrentPlayers(){return teamBCurrentPlayers;}
    public void setTeamBCurrentPlayers(int teamBCurrentPlayers){this.teamBCurrentPlayers=teamBCurrentPlayers;}
    public int getTeamBSubstitutes(){return teamBSubstitutes;}
    public void setTeamBSubstitutes(int teamBSubstitutes){this.teamBSubstitutes=teamBSubstitutes;}
    public List<MatchPlayer> getTeamAPlayers(){return teamAPlayers;}
    public void setTeamAPlayers(List<MatchPlayer> teamAPlayers){this.teamAPlayers=teamAPlayers;}
    public List<MatchPlayer> getTeamBPlayers(){return teamBPlayers;}
    public void setTeamBPlayers(List<MatchPlayer> teamBPlayers){this.teamBPlayers=teamBPlayers;}
    public int getCurrentPlayerId(){return currentPlayerId;}
    public void setCurrentPlayerId(int currentPlayerId){this.currentPlayerId=currentPlayerId;}
    public boolean isStarted(){return started;}
    public void setStarted(boolean started){this.started=started;}
    public boolean isCompleted(){return completed;}
    public void setCompleted(boolean completed){this.completed=completed;}
    public int getTotalSets(){return totalSets;}
    public void setTotalSets(int totalSets){this.totalSets=totalSets;}
    public int getCurrentSet(){return currentSet;}
    public void setCurrentSet(int currentSet){this.currentSet=currentSet;}
    public List<SetResult> getSetResults(){return setResults;}
    public void setSetResults(List<SetResult> setResults){this.setResults=setResults;}
    public List<Arrow> getArrows(){return arrows;}
    public void setArrows(List<Arrow> arrows){this.arrows=arrows;}
    public List<Substitution> getSubstitutions(){return substitutions;}
    public void setSubstitutions(List<Substitution> substitutions){this.substitutions=substitutions;}
    public boolean isTieBreakerStarted(){return tieBreakerStarted;}
    public void setTieBreakerStarted(boolean tieBreakerStarted){this.tieBreakerStarted=tieBreakerStarted;}
    public boolean isTieBreakerCompleted(){return tieBreakerCompleted;}
    public void setTieBreakerCompleted(boolean tieBreakerCompleted){this.tieBreakerCompleted=tieBreakerCompleted;}
    public int getTieBreakerWinnerTeamId(){return tieBreakerWinnerTeamId;}
    public void setTieBreakerWinnerTeamId(int tieBreakerWinnerTeamId){this.tieBreakerWinnerTeamId=tieBreakerWinnerTeamId;}
    public int getTieBreakerRound(){return tieBreakerRound;}
    public void setTieBreakerRound(int tieBreakerRound){this.tieBreakerRound=tieBreakerRound;}
    public List<TieBreakerArrow> getTieBreakerArrows(){return tieBreakerArrows;}
    public void setTieBreakerArrows(List<TieBreakerArrow> tieBreakerArrows){this.tieBreakerArrows=tieBreakerArrows;}
    
	@Override
	public String toString() {
		return "ArcheryMatch [matchFileName=" + matchFileName + ", teamAId=" + teamAId + ", teamBId=" + teamBId
				+ ", teamA=" + teamA + ", teamB=" + teamB + ", teamACurrentPlayers=" + teamACurrentPlayers
				+ ", teamASubstitutes=" + teamASubstitutes + ", teamBCurrentPlayers=" + teamBCurrentPlayers
				+ ", teamBSubstitutes=" + teamBSubstitutes + ", teamAPlayers=" + teamAPlayers + ", teamBPlayers="
				+ teamBPlayers + ", currentPlayerId=" + currentPlayerId + ", started=" + started + ", completed="
				+ completed + ", totalSets=" + totalSets + ", currentSet=" + currentSet + ", setResults=" + setResults
				+ ", arrows=" + arrows + ", substitutions=" + substitutions + ", tieBreakerStarted=" + tieBreakerStarted
				+ ", tieBreakerCompleted=" + tieBreakerCompleted + ", tieBreakerWinnerTeamId=" + tieBreakerWinnerTeamId
				+ ", tieBreakerArrows=" + tieBreakerArrows + "]";
	}

}