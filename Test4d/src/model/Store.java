package model;

public class Store {

	Zone[] zones = new Zone[100];
	private int zoneNumber = 0;

	public Store() {

	}

	public void addZones(Zone[] z) {
		for (int i = 0; i < z.length; i++) {
			this.zones[zoneNumber] = z[i];
			zoneNumber++;
		}
	}

	public Zone[] getZones() {
		Zone[] currentZones = new Zone[zoneNumber];
		for (int i = 0; i < zoneNumber; i++) {
			currentZones[i] = this.zones[i];
		}

		return currentZones;
	}

	public Zone[] getZones(int numOfDVDs) {
		int counter = 0;

		for (int i = 0; i < zoneNumber; i++) {
			if ((10 - zones[i].getCapacity()) <= numOfDVDs) {
				counter++;
			}
		}

		Zone[] currentZones = new Zone[counter];
		counter = 0;

		for (int i = 0; i < zoneNumber; i++) {
			if ((10 - zones[i].getCapacity()) <= numOfDVDs) {
				currentZones[counter] = zones[i];
				counter++;
			}
		}

		return currentZones;
	}

	public int[] getStats(String name) {
		int index0 = 0;
		int index1 = 0;

		for (int i = 0; i < zoneNumber; i++) {
			for (int l = 0; l < zones[i].getNumberOfMovieRecords(); l++) {
				if (zones[i].getRecords()[l].getName() == name) {
					index0++;
					index1 += zones[i].getRecords()[l].getNumberOfDVDs();
				}
			}
		}

		int[] stats = new int[2];
		stats[0] = index0;
		stats[1] = index1;

		return stats;
	}
}
