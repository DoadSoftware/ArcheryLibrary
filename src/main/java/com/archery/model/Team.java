package com.archery.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Teams")
public class Team {
    @Id
    @Column(name="TeamId")
    private int teamId;

    @Column(name="TeamBadge")
    private String teamBadge;

    @Column(name="TeamName1")
    private String teamName1;

    @Column(name="TeamName2")
    private String teamName2;

    @Column(name="TeamName3")
    private String teamName3;

    @Column(name="TeamName4")
    private String teamName4;

    public int getTeamId(){
        return teamId;
    }

    public void setTeamId(int teamId){
        this.teamId=teamId;
    }

    public String getTeamBadge(){
        return teamBadge;
    }

    public void setTeamBadge(String teamBadge){
        this.teamBadge=teamBadge;
    }

    public String getTeamName1(){
        return teamName1;
    }

    public void setTeamName1(String teamName1){
        this.teamName1=teamName1;
    }

    public String getTeamName2(){
        return teamName2;
    }

    public void setTeamName2(String teamName2){
        this.teamName2=teamName2;
    }

    public String getTeamName3(){
        return teamName3;
    }

    public void setTeamName3(String teamName3){
        this.teamName3=teamName3;
    }

    public String getTeamName4(){
        return teamName4;
    }

    public void setTeamName4(String teamName4){
        this.teamName4=teamName4;
    }

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamBadge=" + teamBadge + ", teamName1=" + teamName1 + ", teamName2="
				+ teamName2 + ", teamName3=" + teamName3 + ", teamName4=" + teamName4 + "]";
	}
    
}