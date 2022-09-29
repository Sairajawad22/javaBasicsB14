package repils;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		double price = 2.85;
		double user;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please pay for the coffee");
		
     do {
		user = in.nextDouble();
		
		if (user > price) {
		System.out.println("Please give lesser price");
		
		   } else if (user < price) {
		System.out.println("Please give more price");
		
		}
		} while (user != price);
		System.out.println("Enjoy your coffee");


	}

}
