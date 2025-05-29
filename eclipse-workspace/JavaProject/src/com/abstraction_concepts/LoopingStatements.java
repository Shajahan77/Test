package com.abstraction_concepts;

public class LoopingStatements {
	
	
	public static void main (String[]args) {
		
		for(int i = 1; i <= 5; i++) {  //Outer for, rows
			
			//i = 2
			
			for(int j = 1; j <= 3; j++) { //Inner for, columns
				
				// i = 2 , j = 1
				
				System.out.print(j+" ");  // 1 2 3 
				                          // 1 2 3
				                          // 1 2 3 
			}
			
			System.out.println();
			
		}
		
	}

}
