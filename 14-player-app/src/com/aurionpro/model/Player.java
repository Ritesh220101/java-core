package com.aurionpro.model;

public class Player {
	private String playerName;
	private int playerAge;
	private String playerId;

	private static int idCount = 101;
	
	public Player(String playerName, int playerAge) {
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.playerId = generateId();
	}

	private String generateId() {
		return "P"+idCount++;
	}

	public Player(String playerName) {
		this(playerName, 30);
	}
	


	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", playerAge=" + playerAge + ", playerId=" + playerId + "]";
	}





	public String getPlayerName() {
		return playerName;
	}

	public int getPlayerAge() {
		return playerAge;
	}

	public String getPlayerId() {
		return playerId;
	}

	public Player whoIsElder(Player player2) {
		if (this.playerAge > player2.playerAge)
			return this;
		return player2;
	}

}
