package fr.imie.bataillenavale;

import java.util.Scanner;

public class Game {
	protected int shipNumber;
	protected Player players[];
	public static Scanner sc = null;
	
	
	public Game(int shipNumber, Player plyr[]) {
		this.shipNumber = shipNumber;
		this.players = plyr;
		if (Game.sc == null) {
			Game.sc = new Scanner(System.in);
		}
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


	public static Scanner getSc() {
		return sc;
	}


	public static void setSc(Scanner sc) {
		Game.sc = sc;
	}
	
	public void askName(Player plyr) {
		String name;
		System.out.println("Type your name :");
		name = Game.sc.nextLine();
		plyr.setName(name);
	}
}
