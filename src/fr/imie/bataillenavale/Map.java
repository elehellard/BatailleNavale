package fr.imie.bataillenavale;

public class Map {
	protected int field[][];
	
	public Map(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				this.field[i][j] = null;
			}
		}
	}
	
	
}
