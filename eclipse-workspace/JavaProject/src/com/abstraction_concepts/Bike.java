package com.abstraction_concepts;

public abstract class Bike {
	
	public void bikeName() {   // Non abstract method
		
		System.out.println("Pulsar");
		
	}
	
	public void bikeModel() {
		
		System.out.println("NS200");    //Implementation part
		
	}
	
	public void bikeManYear() {
		
		System.out.println(2021);
		
	}
	
	public abstract void bikeManDate();   //Abstract Method
	
	public abstract void bikeManPlace();  // Signature Part
	
//	public static void main(String[] args) {
//		
//		Bike b = new Bike();
//		
//	}

}
