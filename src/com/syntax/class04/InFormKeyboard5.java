package com.syntax.class04;

import java.util.Scanner;

public class InFormKeyboard5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Did you solve Reple Assignment");
	
     boolean solveAnyRepl= scanner .nextBoolean();

if(solveAnyRepl) 
{
	System.out.println("How momey reples you solved");
	int noOfReplsSolved=scanner.nextInt();
	
	
	if(noOfReplsSolved>=17) 
	{
	System.out.println("You are doing great");	



	}else if(noOfReplsSolved>10){
	
System.out.println("you are doing ok please comleate themas soon as possible");
	
	

	}else {	
	System.out.println("you should solve some more repils");	
}

}
else
{
	
System.out.println("they are very important to learn jave please solve them");
}
	
}
}