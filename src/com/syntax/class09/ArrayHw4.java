package com.syntax.class09;

public class ArrayHw4 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.
		
		int[] numbers= {10,20,30,40,10,};

		int largest= numbers[0];
		
		for(int n:numbers) {
			if(n>largest) {
			largest=n;
				
			}
		}System.out.println("The largest number is " + largest);
		
		System.out.println("--------------------------------");
		
		int[] number= {10,20,30,40,10,};
		int largestNum=	number[0];// we assume that the first number is the largest number
		// than we compair the 10 number to the rest of the elements
		for(int i=1; i<number.length; i++) {
		
		if(number[i]>largestNum) {
			
			largestNum=number[i];
		}
		
		}
		System.out.println(largestNum);	
	}
}
