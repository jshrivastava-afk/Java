package com.ltts.model;

public class Player {

	private int playerNumber;
	private String playername;
	public Player(int playerNumber, String playername) {
		super();
		this.playerNumber = playerNumber;
		this.playername = playername;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPlayerNumber() {
		return playerNumber;
	}
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	@Override
	public String toString() {
		return "Player [playerNumber=" + playerNumber + ", playername=" + playername + "]";
	}
	
	
}
