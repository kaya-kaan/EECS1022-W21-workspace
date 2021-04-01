package model;

public class Zone {

	private int capacity = 0;
	private static int j = 23;
	private String id;
	private int numberRecords = 0;
	private MovieRecord[] records;

	private int error = 0;
	private String errorMessage = "";

	public Zone(int cap) {
		this.records = new MovieRecord[cap];
		this.id = "Zone-" + j;
		j += 11;
	}

	public void addMovieRecord(MovieRecord r) {
		int sameName = 0;
		int recIndex = -1;

		for (int i = 0; i < numberRecords; i++) {
			if (r.getName() == records[i].getName()) {
				sameName = 1;
				recIndex = i;
			}
		}

		if (capacity >= 10) {
			this.error = 1;
			this.errorMessage = "Error: maximum number of movie DVDs (10) reached";
		} else if ((r.getNumberOfDVDs() + capacity > 10)) {
			this.error = 1;
			this.errorMessage = "Error: insufficient space left in the zone ("
					+ (this.capacity + r.getNumberOfDVDs() - 10) + " DVDs short)";
		} else if (sameName == 1) {
			records[recIndex].addToStock(r.getNumberOfDVDs());
		} else {
			this.records[this.numberRecords] = r;
			this.numberRecords++;
			this.capacity += r.getNumberOfDVDs();
		}

	}

	public String getID() {
		return this.id;
	}

	public MovieRecord[] getRecords() {
		return this.records;
	}

	public int getNumberOfMovieRecords() {
		return this.numberRecords;
	}

	public int getNumberOfMovieDVDs() {
		int counter = 0;
		for (int i = 0; i < this.numberRecords; i++) {
			counter += records[i].getNumberOfDVDs();
		}

		return counter;
	}

	public String getStatus() {
		String status = "";

		if (error == 1) {
			status = this.errorMessage;
		} else {
			status += "" + this.numberRecords + " records and " + this.getNumberOfMovieDVDs() + " DVDs: {";
			for (int i = 0; i < this.numberRecords; i++) {
				if (i > 0) {
					status += ", ";
				}
				status += records[i].getName() + " (" + records[i].getNumberOfDVDs() + ")";
			}

			status += "}";
		}

		return status;
	}

	public int getCapacity() {
		return this.capacity;
	}
}
