package com.abstraction_concepts;

public class BikeDetails extends Bike{

	
	public void bikeManDate() {
		
		System.out.println("25-05-2021");
		
	}

	
	public void bikeManPlace() {
		
		System.out.println("Pune");
		
	}
	
	public static void main(String[] args) {
		
		BikeDetails obj = new BikeDetails();
		obj.bikeName();
		obj.bikeManPlace();
		obj.bikeModel();
		
	}

}
