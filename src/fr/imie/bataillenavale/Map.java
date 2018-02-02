package fr.imie.bataillenavale;

public class Map {
	private Ship field[][];

	public boolean isValid(int x, int y) {
		if (this.field[x][y] == null) {
			return true;
		} else {
			return false;
		}
	}
}
