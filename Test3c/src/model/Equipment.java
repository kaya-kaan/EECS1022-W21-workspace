package model;

public class Equipment {

	private String name;
	private int stock;

	private boolean error = false;
	private int errorNum;
	private int lastSubtratcion;
	
	public Equipment() {
		name = "";
		stock = 0;
	}

	public Equipment(String name) {
		this.name = name;
	}

	public void addStock(int add) {
		
		if (add <= 0) {
			error = true;
			errorNum = add;
		} else {
			stock += add;
		}
	}

	public void removeStock(int subtract) {

		if (subtract <= 0) {
			error = true;
			errorNum = subtract;
		} else {
			stock -= subtract;
			lastSubtratcion = subtract;
		}
		
	}

	// +++++SETTERS+++++
	

	// +++++GETTERS+++++

	public String getName() {
		return name;
	}

	public int getStock() {
		return stock;
	}

	public String getStatus() {
		String result = "";
		if (error == true) {

			result += "Error: non-positive quantity " + errorNum;
			//stock = 0;
			error = false;

		} else if (stock < 0){
			
			result += "Error: quantity is short of " + (stock * -1);
			stock += lastSubtratcion;
			
		} else {

			result += "Equipment: " + name + " (" + stock + ")";
		}
		return result;
	}
}
