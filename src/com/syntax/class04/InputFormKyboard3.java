package com.syntax.class04;

import java.util.Scanner;

public class InputFormKyboard3 {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);//1
   
   // we use nextInt() if we want an int types of data from the keyboard
		System.out.println("Please enter your age");//2
   int age= scanner.nextInt();//3
   
   if (age<18) {//4
	   System.out.println("You should study");//5
		   
	   }else { System.out.println("You should start working");//6
		   
	   
   }
   
   
	}

}
