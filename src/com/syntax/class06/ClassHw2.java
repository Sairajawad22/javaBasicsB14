package com.syntax.class06;

import java.util.Scanner;

public class ClassHw2 {

	public static void main(String[] args) {
//Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
//A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
//At the end your program should print which grade was entered by a user with explanation.
		
		Scanner scan=new Scanner(System.in);
    System.out.println("Please entere your grade");
    String grade=scan.nextLine();
     String discription;
    switch(grade){

  case "A":
	 discription="Excellent";
	 break;
	 
  case "B":
		 discription="Good";
		 break;
		 
  case "C":
		 discription="Bad";
		 break; 
		 
		default:
			discription="Not Acceptable";
	
}
	
	System.out.println(grade+ " was entered by a user with " + discription);	
		
	}

}
