package com.syntax.class05;

public class Recap2 {

	public static void main(String[] args) {
		// Nested if condition means one if statement inside another
		// if statement
		// to format code use
		// cmd+shift+F

		boolean allergy = true;

		String alletgyType = "pollen";

		if (allergy) {
			System.out.println("Lets check what allergy you have");

			if (alletgyType.equalsIgnoreCase("Pollen")) {
				System.out.println("Try to stay inside when trees are bloaming");
			} else if (alletgyType.equals("Peanuts")) {
				System.out.println("Please stay away from penuts");
			} else if (alletgyType.equals("Diary")) {
				System.out.println("Please stay away from dairy products");
			} else {
				System.out.println("We need to do some test");
			}

		} else {
			System.out.println("You are lucky");
		}
	}
}
