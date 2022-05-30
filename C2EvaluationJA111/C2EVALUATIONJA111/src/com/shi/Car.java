package com.shi;

public class Car {
	private int numberOfPassenger;
	private int numberOfKms;
	
	class Sedan extends Car {
		final int farePerKm =20;
	}
	
	class HatchBack extends Car {
		final int farePerKm =15;
	}
	
	class OLA {
		public void bookCar(int numberOfPassenger, int numberOfKMs) {
			
		}
		
		public void calculateBill(Car car) {
			
		}
		
		
	}

}
