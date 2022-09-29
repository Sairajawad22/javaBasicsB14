package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		
		// only when we deal Arrays or collections. we can use for each loop
		// or enhance for loop,advance for loop
		
		String[]iceCream= { "vanilla","chocolate","pistashio","mango","kulfi"};
		for(String flavor:iceCream) {
			System.out.println(flavor);
			
		}
		System.out.println("--------------------------");
		char[] letters= {'A','B','C','D','E','F'};
		for(char letter:letters) {
			System.out.println(letters);
		}
		System.out.println("--------------------------");
		int[] numbers= {12, 56, 345, 1, 0, 9,};
		//get all elements using regular for loop
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]+ " ");
		}
		System.out.println();
		//get all elements using enhance for loop
		// this loop always loop ONLY 1 way: from start till end
		for(int num:numbers) {
			System.out.println(num);	
		}
		}

}
