package com.keywords_concepts;

public class Static_Demo {

	static String ecommerce = "Flipkart"; // static Class variable
	long number = 8667574819l;

	public static void mobiles() { // static method

		System.out.println("Samsung");
		System.out.println("Oneplus");

	}

	private void laptops() {

		System.out.println("Dell");
		System.out.println("Lenovo");

	}

	static void furnitures() { // static method

		System.out.println("Bed");
		System.out.println("Table");

	}

	static void add() {

		int a = 10;
		int b = 20;
		int c = a + b;

	}

	public static void main(String[] args) {

		System.out.println(ecommerce);
		// System.out.println(number);
		mobiles();
		furnitures();
		// laptops();
		add();

	}

}
