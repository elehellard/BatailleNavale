package fr.imie.bataillenavale;

import java.util.ArrayList;

public class Player {
	protected String name;
	protected ArrayList<Ship> ships;
	protected Map field;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the ships
	 */
	public ArrayList<Ship> getShips() {
		return ships;
	}
	/**
	 * @param ships the ships to set
	 */
	public void setShips(ArrayList<Ship> ships) {
		this.ships = ships;
	}
	/**
	 * @return the field
	 */
	public Map getField() {
		return field;
	}
	/**
	 * @param field the field to set
	 */
	public void setField(Map field) {
		this.field = field;
	}
	
	
}
