package fr.imie.bataillenavale;

public class Map {

	private Ship field[][];
	
	public Map(int x, int y) {
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field.length; j++) {
				this.field[x][y] = null;
			}
		}
		
	}
	
	public Ship[][] getField() {
		return field;
	}

}
