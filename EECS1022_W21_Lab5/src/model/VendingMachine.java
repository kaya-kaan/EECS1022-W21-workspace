package model;

public class VendingMachine {

	String productName;
	int cokeStock;
	int orangeJuiceStock;
	int chunkyBarStock;
	int laysClassicChipsStock;

	int recentStockChange;
	String recentProduct;

	boolean invalidProduct;

	public VendingMachine() {
		cokeStock = 0;
		orangeJuiceStock = 0;
		chunkyBarStock = 0;
		laysClassicChipsStock = 0;
		recentStockChange = 0;
		recentProduct = "";
		invalidProduct = false;
	}

	public String checkStock() {
		String result = "Stock: Coke (" + cokeStock + "), Orange Juice (" + orangeJuiceStock + "), Kitkat Chunky Bar ("
				+ chunkyBarStock + "), Lay's Classic Chips (" + laysClassicChipsStock + ")";
		return result;
	}

	public String checkStock(String productName) {
		String result = "";

		switch (productName) {
		case "Coke":
			result = productName + " (" + cokeStock + ")";
			break;

		case "Orange Juice":
			result = productName + " (" + orangeJuiceStock + ")";
			break;

		case "Kitkat Chunky Bar":
			result = productName + " (" + chunkyBarStock + ")";
			break;

		case "Lay's Classic Chips":
			result = productName + " (" + laysClassicChipsStock + ")";
			break;

		default:
			result = "Invalid product: " + productName;
			return result;
		}

		return result;
	}

	public String checkStatus() {
		String result = "";
		
		if (invalidProduct == true) {
			result = "Invalid product: " + recentProduct;
			invalidProduct = false;
		} else {
			if (recentStockChange == 0) {
				result = "Empty VM Started";
			} else {
				if (recentStockChange > 0) {
					result = "Product added: " + recentProduct + " (" + recentStockChange + ")";
				} else {
					result = "Product removed: " + recentProduct + " (" + (recentStockChange * -1) + ")";
				}
			}
		}

		return result;
	}

	public String add(String productName, int stockAddition) {
		String result = "";

		switch (productName) {
		case "Coke":
			cokeStock += stockAddition;
			break;

		case "Orange Juice":
			orangeJuiceStock += stockAddition;
			break;

		case "Kitkat Chunky Bar":
			chunkyBarStock += stockAddition;
			break;

		case "Lay's Classic Chips":
			laysClassicChipsStock += stockAddition;
			break;

		default:
			result = "Invalid product: " + productName;
			invalidProduct = true;
		}

		recentStockChange = stockAddition;
		recentProduct = "" + productName;

		return result;
	}

	public String dispense(String productName, int dispenseAmount) {
		String result = "";

		switch (productName) {
		case "Coke":
			cokeStock -= dispenseAmount;
			break;

		case "Orange Juice":
			orangeJuiceStock -= dispenseAmount;
			break;

		case "Kitkat Chunky Bar":
			chunkyBarStock -= dispenseAmount;
			break;

		case "Lay's Classic Chips":
			laysClassicChipsStock -= dispenseAmount;
			break;

		default:
			result = "Invalid product: " + productName;
			invalidProduct = true;
		}

		recentStockChange = dispenseAmount * -1;
		recentProduct = "" + productName;

		return result;
	}

}
