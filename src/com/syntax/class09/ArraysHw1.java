package com.syntax.class09;

public class ArraysHw1 {

	public static void main(String[] args) {
		// 1. Create an array of cars and store 6 elements into it.
		//Using 2 different loops print all values from the array.
		
		// first way
		String[]car= new String[6];
		car[0]="Toyota";
		car[1]="Tasla";
		car[2]="Rang Rover";
		car[3]="Ford";
		car[4]="BMW";
		car[5]="Mercedes";
		
		for(int i=0; i<car.length; i++) {
		System.out.print(car[i]+ " ");
		
			}
		
		System.out.println();
		// second way
				String[]carBrand= {"Toyota","Tasla","Rang Rover","Ford","BMW","Mercedes"};
				for(String model:carBrand) {
				
				System.out.print(model+ " ");
		}
	}
	}
