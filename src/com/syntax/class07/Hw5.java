package com.syntax.class07;

import java.util.Scanner;

public class Hw5 {

	public static void main(String[] args) {
		// Prompt the user to ask the name 3 times and print "Good afternoon +name
Scanner scan=new Scanner(System.in);
//we can keep the scanner outside the loop becase we want to creat the scanner only one and reuse it
	
for (int i=1; i<=3; i++) {	
System.out.println("What is your name?");
String name = scan.nextLine();

	System.out.println("Good afternoon " + name);
}
System.out.println("---------------------- ");
	}

}
