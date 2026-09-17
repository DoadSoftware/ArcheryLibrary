package com.archery.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Players")
public class Player implements Comparable<Player> {
    @Id
    @Column(name = "PlayerID")
    private int playerId;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "Surname")
    private String surname;

    @Column(name = "TickerName")
    private String tickerName;

    @Column(name = "Photo")
    private String photo;

    @Column(name = "TEAMID")
    private Integer teamId;

    public Player() {}

    public int getPlayerId() {
		return playerId;
	}


	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getTickerName() {
		return tickerName;
	}


	public void setTickerName(String tickerName) {
		this.tickerName = tickerName;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public Integer getTeamId() {
		return teamId;
	}


	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}


	public String getDisplayName() {
        if (fullName != null && !fullName.isBlank()) return fullName;
        return ((firstName == null ? "" : firstName.trim()) + " " +
                (surname == null ? "" : surname.trim())).trim();
    }

    @Override
    public int compareTo(Player other) {
        return Integer.compare(playerId, other.playerId);
    }
}
