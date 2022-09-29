package com.syntax.class09;

public class ArrayHw5 {

	public static void main(String[] args) {
		// Create an array to store char values and then print those in reverse order
  
		char[]values= {'J','A','W','A','D'};
		int size=values.length;
		
		for(int i=size-1; i>=0; i--) {
			
			System.out.print(values[i]+" ");
		}
	}
}
