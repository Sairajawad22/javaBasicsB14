package com.syntax.class05;

// cmd+shift+o
import java.util.Scanner;

public class ScannerRecap {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please entere your name?");
		/*
		 * To capture different value we need to use different options
		 */// .nextInt(); capturing int

		String name = input.next();// capturing string

		System.out.println(" Nice to meet you " + name);

		System.out.println(" How old are you " + name);
		int age = input.nextInt();
		System.out.println(name + " is " + age + " years old ");

		System.out.println(" How much money you have " + name);
		double money = input.nextDouble();

		System.out.println(name + " has $ " + money);

		System.out.println(name + "What is your grade?");
		char grade = input.next().charAt(0);

		System.out.println(name + "Your grade is " + grade);
		System.out.println("Please entere another name");
	     name=input.next();
	     System.out.println(" new name is "+ name);
	     name=input.next();
		
		System.out.println("End");

	}

}
