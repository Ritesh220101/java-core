package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.*;

public class PlayerTest {

	public static void main(String[] args) {
		ArrayList<Player> players = new ArrayList<>();
		players.add(new Player(1,"ritesh",75,5000,100));
		players.add(new Player(2,"ztr",99,10000,200));
		players.add(new Player(3,"sehwag",300,10000,1));
		players.add(new Player(4,"hardik",200,2000,350));
		players.add(new Player(5,"dhoni",100,15000,0));
		players.add(new Player(6,"arT",300,500,10));
//		Player[] players = {
//				new Player(1,"ritesh",75,5000,100),
//				new Player(2,"ztr",99,10000,200),
//				new Player(3,"sehwag",300,10000,1),
//				new Player(4,"hardik",200,2000,350),
//				new Player(5,"dhoni",100,15000,0)	
//		};
		
		PlayerInfo playerInfo = new PlayerInfo(players);
		ArrayList<Player> aLister = playerInfo.getAListers();
		for(Player a:aLister) {
			System.out.println("A lister:" +a);
		}
		ArrayList<Player> bLister = playerInfo.getBListers();
		for(Player b:bLister) {
			System.out.println("B lister:" +b);
		}
		ArrayList<Player> cLister = playerInfo.getCListers();
		for(Player c:cLister) {
			System.out.println("C lister:" +c);
		}
		
		Player maxRuns = playerInfo.maxRunsPlayer();
		System.out.println("Maximum runs player: "+maxRuns);
		Player maxWickets = playerInfo.maxWicketsPlayer();
		System.out.println("Maximum wickets player: "+maxWickets);
	}

	
	

}
