package fr.imie.bataillenavale;

public class Game {
	protected int shipNumber;
	protected Player players[];
	
	public Game(int shpNb, Player plyrs[]) {
		this.shipNumber = shpNb;
		this.players = plyrs;
	}

	public int getShipNumber() {
		return shipNumber;
	}

	public void setShipNumber(int shipNumber) {
		this.shipNumber = shipNumber;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}
	
	
}
