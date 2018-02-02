package fr.imie.bataillenavale;

public class Map {

	private Ship field[][];
	
	public Map(int x, int y) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				this.field[x][y] = null;
			}
		}
		
	}
	
	public Ship[][] getField() {
		return field;
	}

	public Boolean isEmpty(int x, int y) {
		Boolean empty = (this.field[x][y] == null) ? true : false;
		return empty;
	}
}
