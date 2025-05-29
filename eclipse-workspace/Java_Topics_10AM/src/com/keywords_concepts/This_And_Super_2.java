package com.keywords_concepts;

public class This_And_Super_2 extends This_And_Super_1 {

	int value = 3000;

	public void sampleMethod() {

		int value = 1000;
		System.out.println(value);
		System.out.println(this.value);
		System.out.println(super.value);

	}

	public void divide() {

		super.divide();
		System.out.println("Child Division");

	}

	public static void main(String[] args) {

		This_And_Super_2 ts = new This_And_Super_2();
//		ts.sampleMethod();
		ts.divide();

	}

}
