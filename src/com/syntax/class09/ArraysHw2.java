package com.syntax.class09;

public class ArraysHw2 {

	public static void main(String[] args) {
	//  Create an array of animals and store 5 elements into it. 
	//Using 2 different loops print all elements from the array.
		
		String[]animals=new String[5];
		
		animals[0]="Lion";
		animals[1]="Tiger";
		animals[2]="Elephents";
		animals[3]="Cat";
		animals[4]="Dog";
		
		for(int i=0; i<animals.length; i++) {
			System.out.print(animals[i]+ " ");
			
				}
			
			System.out.println();
			
	// second way
	
		String[]animalFavorite= {"Lion","Tiger","Elephents","Cat","Dog"};
		
		for(String animal:animalFavorite) {
			
		System.out.print(animal+" ");
		}
}	
}	
	