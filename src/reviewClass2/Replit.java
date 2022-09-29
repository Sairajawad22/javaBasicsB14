package reviewClass2;

import java.util.Scanner;

public class Replit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		  String result;
		System.out.println("Please intere word1 ");
		String word1 =scan.nextLine();
		System.out.println("Please intere word2 ");
		String word2= scan.nextLine();
		  System.out.println("Please intere int1 ");
		int int1=scan.nextInt();
		   System.out.println("Please intere int2");
		  int int2=scan.nextInt();
		  
		if(int1==int2 && word1.equals("word2")){
		System.out.println("AND");
		  
		  }else if (int1==int2 || word1.equals("word2")){
		      System.out.println("OR");
		  
		   }else if (int1 != int2 && !word2.equals("word1") ){
		      System.out.println("NONE");
		  }
	}

}
