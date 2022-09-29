package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {
		
		for (int i = 1; i < 3; i++) { // --> outer loop controls inner loop
		System.out.println("Hello");
		
		for (int j = 1; j <= 3; j++) { // --> inner loop depends on outer

		System.out.println("Bye");
		}
		}
	}

}
