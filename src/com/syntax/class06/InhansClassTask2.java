package com.syntax.class06;

import java.util.Scanner;

public class InhansClassTask2 {

	public static void main(String[] args) {
// Write a program that will read three inputs of 
//scores (quiz, mid term, and final scores) and 
//determine the grade based on the following rules: 
//if the average score >=90 → grade=A
//if the average score >= 70 and <90 → grade=B
//	if the average score>=50 and <70 → grade=C if the average score<50 → grade=F
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter your quiz grade ");
		int quiz = input.nextInt();
		
		System.out.println("please enter your mid term grade");
		int midTerm = input.nextInt();
		
		System.out.println("please enter your final scores");
		int finalScores = input.nextInt();
		
		int avr = (quiz + midTerm + finalScores) / 3;
		String grade;
		if (avr >= 90) {
			grade = "A";

		} else if (avr >= 70 && avr < 90) {
			grade = "B";

		} else if (avr >= 50 && avr < 70) {
			grade = "C";

		} else if (avr < 50) {
			grade = "F";
		} else {
			grade = "error";

		}

		System.out.println("your grade is " + grade);

	}

}
