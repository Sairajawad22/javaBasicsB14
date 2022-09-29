package reviewClass2;

import java.util.Scanner;

public class Myrepil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan= new Scanner(System.in);
		  System.out.println("Enter the age of the Child");
		   int age=scan.nextInt();
		   String child;
		   switch(age){
		     case 1:
		       child="You can Crawl";
		       break;
		       
		case 2:
		       child="You can Talk";
		       break;

		  case 3:
		       child="You can Dance";
		       break;
		       
		  case 4:
		       child="You can get Trouble";
		       break;
		       
		     default:
		       child="I don't know how old you are";
		      
		         }    

	}

}
