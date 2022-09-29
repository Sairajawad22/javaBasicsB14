package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		/*
		 * scanner is a class that help us take input from the keyboard 
		 * it contain many different smaller modules called methods that can help 
		 * us take Strings boolean basically all types of data from the keyboard
		 * 
		 */
		Scanner input =new Scanner(System.in);
		// A massage will be displayed to the user on the console to enter his/her name
		 System.out.println("Please enter your name");
		 //Acivates the java program to take input from the keyboard and store inside 
		 // the name variable
        String name= input.next();
       // prints whatever name user enters on the keyboard on the console
        System.out.println("Hello " +name+ " don't be scared");
	}

}
