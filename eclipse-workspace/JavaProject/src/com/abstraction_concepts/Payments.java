package com.abstraction_concepts;

public class Payments implements Gpay , Phonepay {

	@Override
	public void upi() {
		
		System.out.println("UPI using Gpay");
		
	}

	@Override
	public void transaction() {
		
		System.out.println("Transaction in Gpay");
		
	}

	@Override
	public void scanner() {
		
		System.out.println("Scanner using Phonepay");
		
	}

	public static void main(String[] args) {
		
		Payments obj = new Payments();
		obj.upi();
		obj.transaction();
		obj.scanner();
		
	}
	
}
