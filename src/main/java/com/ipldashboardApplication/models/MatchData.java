package com.ipldashboardApplication.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MatchData {
	
	@Id
	private long id;
	
	private String city;
	private String team1;
	private String team2;
	private String venue;
	private Date date;
	private String teamWinner;
	private String playerOfMatch;
	private String tossWinner;
	private String tossDecision;
	private String result;
	private String resultMargin;
	private String umpire1;
	private String umpire2;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String vanue) {
		this.venue = vanue;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTeamWinner() {
		return teamWinner;
	}
	public void setTeamWinner(String winner) {
		this.teamWinner = winner;
	}
	public String getPlayerOfMatch() {
		return playerOfMatch;
	}
	public void setPlayerOfMatch(String playerOfMatch) {
		this.playerOfMatch = playerOfMatch;
	}
	public String getTossWinner() {
		return tossWinner;
	}
	public void setTossWinner(String tossWinner) {
		this.tossWinner = tossWinner;
	}
	public String getTossDecision() {
		return tossDecision;
	}
	public void setTossDecision(String tossDecesion) {
		this.tossDecision = tossDecesion;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getResultMargin() {
		return resultMargin;
	}
	public void setResultMargin(String resultMargin) {
		this.resultMargin = resultMargin;
	}
	public String getUmpire1() {
		return umpire1;
	}
	public void setUmpire1(String umpire1) {
		this.umpire1 = umpire1;
	}
	public String getUmpire2() {
		return umpire2;
	}
	public void setUmpire2(String umpire2) {
		this.umpire2 = umpire2;
	}
	
	@Override
	public String toString() {
		return "MatchData [id=" + id + ", city=" + city + ", team1=" + team1 + ", team2=" + team2 + ", venue=" + venue
				+ ", date=" + date + ", winner=" + teamWinner + ", playerOfMatch=" + playerOfMatch + ", tossWinner="
				+ tossWinner + ", tossDecesion=" + tossDecision + ", result=" + result + ", resultMargin="
				+ resultMargin + ", umpire1=" + umpire1 + ", umpire2=" + umpire2 + "]";
	
	}
}

	
	