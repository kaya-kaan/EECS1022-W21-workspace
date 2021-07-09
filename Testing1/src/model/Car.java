package model;

public class Car {

		private static long carNumber = 0; private String model;

		private long carID;

		private int speed;

		public Car (String model, int speed) {

		carID = ++carNumber;

		this.model = model; this.speed = speed;

		carNumber = carID;

		}

		public void incSpeed (int value) {

		if (value<0)

		speed -=-value ;

		else
			speed+=value;

		}

		public void decSpeed (int value) { 
			if (value<0)
		speed -= value;

		

		else
speed -= value;
		}

		

}
