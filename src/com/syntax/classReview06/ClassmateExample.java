package com.syntax.classReview06;

import java.util.Scanner;

public class ClassmateExample {

	public static void main(String[] args) {
		
			  Scanner input=new Scanner(System.in);
			    System.out.println("Please enter two words");
			  String word1=input.nextLine();
			  String word2=input.nextLine();

			  System.out.println("Please enter two integers");
			Integer int1=input.nextInt();
			  Integer int2=input.nextInt();

			if ((word1).equals(word2)&&int1==int2)
			{System.out.println("AND");}



			 else if ((word1).equals(word2)|| int1==int2  )
			  {System.out.println("OR");}
			else 

			  System.out.println("NONE");





	}

}
