package com.syntax.class04;

import java.util.Scanner;

public class InFormKeyboard4 {

	public static void main(String[] args) {
		
		
	Scanner scanner=new Scanner(System.in);	
	System.out.println("Please entere your name");
	// takes a String type input from the keyboard and store
	// name variable
	String name= scanner.nextLine();
	System.out.println("Please entere your age");
	// takes a String type input from the keyboard and store
	// age variable
	int age=scanner.nextInt();
	System.out.println("Hi " +name+ " you are " +age+ " years old ");
	}

}
