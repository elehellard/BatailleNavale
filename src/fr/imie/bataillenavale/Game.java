package fr.imie.bataillenavale;

import java.util.Scanner;

/**
 * @author ahsyaj
 *
 */
public class Game {
	protected int shipNumber;
	protected Player players[];
	public static Scanner sc = null;
	/**
	 * @return the shipNumber
	 */
	public int getShipNumber() {
		return shipNumber;
	}
	/**
	 * @param shipNumber the shipNumber to set
	 */
	public void setShipNumber(int shipNumber) {
		this.shipNumber = shipNumber;
	}
	/**
	 * @return the players
	 */
	public Player[] getPlayers() {
		return players;
	}
	/**
	 * @param players the players to set
	 */
	public void setPlayers(Player[] players) {
		this.players = players;
	}
	
	
}
