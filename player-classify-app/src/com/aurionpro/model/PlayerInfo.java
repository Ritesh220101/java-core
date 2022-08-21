package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayerInfo {
	private ArrayList<Player> players;

	public PlayerInfo(ArrayList<Player> players) {
		this.players = players;
	}

	ArrayList<Player> aList = new ArrayList<Player>();
	ArrayList<Player> bList = new ArrayList<Player>();
	ArrayList<Player> cList = new ArrayList<Player>();

	public ArrayList<Player> getAListers() {

//		for (int i = 0; i < players.size(); i++) {
//			if ()) {
//				aList.add(players.get(i));
//			}
//		}

		for (Player player : players) {
			if (player.getMatches() > 100 && (player.getRuns() > 5000 || player.getWickets() >= 150)) {
				aList.add(player);
			}
		}

		return aList;
	}

	public ArrayList<Player> getBListers() {

//		for (int i = 0; i < players.size(); i++) {
//			if ((players.get(i).getMatches() > 50 && players.get(i).getMatches() <= 100)
//					&& ((players.get(i).getRuns() >= 3000) || players.get(i).getWickets() >= 75)) {
//				bList.add(players.get(i));
//			}
//		}
		for (Player player : players) {
			if ((player.getMatches() > 50 && player.getMatches() <= 100)
					&& ((player.getRuns() >= 3000) || player.getWickets() >= 75)) {
				bList.add(player);
			}
		}

		return bList;
	}

	public ArrayList<Player> getCListers() {

//		for (int i = 0; i < players.size(); i++) {
//			if ((players.get(i).getMatches() > 0 && players.get(i).getMatches() <= 50)
//					&& (players.get(i).getRuns() > 0 || players.get(i).getWickets() > 0)) {
//				cList.add(players.get(i));
//			}
//		}
		for (Player player : players) {
//			if((player.getMatches() > 0)
//					&& (player.getRuns()< 3000 || player.getWickets()< 75)) {
//				cList.add(player);
//			}
			if (!aList.contains(player) && !bList.contains(player))
				cList.add(player);
		}
		return cList;
	}

	public Player maxRunsPlayer() {
		int max = 0;
		int index = 0;

		for (int i = 1; i < players.size(); i++) {
			if (players.get(i).getRuns() > max) {
				max = players.get(i).getRuns();
				index = i;
			}
		}
		return players.get(index);
	}

	@Override
	public String toString() {
		return "PlayerInfo [players=" + players + "]";
	}

	public Player maxWicketsPlayer() {
		int max = 0;
		int index = 0;

		for (int i = 0; i < players.size(); i++) {
			if (players.get(i).getWickets() > max) {
				max = players.get(i).getWickets();
				index = i;
			}
		}
		return players.get(index);

	}
}