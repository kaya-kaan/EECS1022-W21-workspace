package model;

public class MovieRecord {

	private String name;
	private int stock;
	private Zone movieZone;
	private String id;

	private static int k = 1;

	public MovieRecord(String name, int number, Zone z) {
		this.name = name;
		this.stock = number;
		this.movieZone = z;
		this.id = z.getID() + "-" + name + "-" + MovieRecord.k;
		k++;
	}

	public void addToZone(Zone z) {
		z.addMovieRecord(this);
	}

	public void addToStock(int add) {
		this.stock += add;
	}

	public String getName() {
		return this.name;
	}

	public int getNumberOfDVDs() {
		return this.stock;
	}

	public Zone getZone() {
		return this.movieZone;
	}

	public String getID() {
		return id;
	}

}
