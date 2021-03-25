package model;

public class Warehouse {

	private int capacity;

	Equipment[] equipments;

	private int occupied = 0;

	public Warehouse(int cap) {

		capacity = cap;
		equipments = new Equipment[cap];
	}

	public void addEquipment(Equipment eqp) {
		
		boolean sameName = false;
		int index = -1;
		for (int i = 0; i < occupied; i++) {
			if (eqp.getName() == equipments[i].getName()) {
				sameName = true;
				index = i;
			}
		}

		if (sameName == true) {
			
			equipments[index].addStock(eqp.getStock());

		} else {

			if (capacity == occupied) {

			} else {
				equipments[occupied] = eqp;
				occupied++;
			}
		}
	}
	
	public void addStock(String name, int add) {
		for (int i = 0; i < occupied; i++) {
			if (name == equipments[i].getName()) {
				equipments[i].addStock(add);
			}
		}
	}

	// +++++SETTERS+++++

	// +++++GETTERS+++++

	public Equipment getEquipment(String name) {
		int index = -1;

		for (int j = 0; j < occupied; j++) {
			if (name == equipments[j].getName()) {
				index = j;
			}
		}
		if (index != -1) {
			return equipments[index];
		} else {
			return null;
		}

	}

	public Equipment[] getEquipments() {
		Equipment[] eqp = new Equipment[occupied];

		for (int i = 0; i < occupied; i++) {
			eqp[i] = equipments[i];
		}
		return eqp;
	}

	public Equipment[] getEquipments(String[] names) {
		Equipment[] eqp = new Equipment[occupied];
		;
		int count = 0;

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < occupied; j++) {
				if (names[i] == equipments[j].getName()) {
					count++;
				}
			}
		}

		eqp = new Equipment[count];
		count = 0;

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < occupied; j++) {
				if (names[i] == equipments[j].getName()) {
					eqp[count] = equipments[j];
					count++;
				}
			}
		}

		return eqp;
	}

	public Equipment[] getEquipmentsWithinRange(int lower, int upper) {
		Equipment[] eqp;
		int count = 0;

		int eqpQuantity;

		for (int j = 0; j < occupied; j++) {
			eqpQuantity = equipments[j].getStock();
			if (eqpQuantity >= lower && eqpQuantity <= upper) {
				count++;
			}
		}

		eqp = new Equipment[count];
		count = 0;

		for (int j = 0; j < occupied; j++) {
			eqpQuantity = equipments[j].getStock();
			if (eqpQuantity >= lower && eqpQuantity <= upper) {
				eqp[count] = equipments[j];
				count++;
			}
		}

		return eqp;
	}

}
