package GroupProjectCodiingTask;

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		//Using Scanner create an array of countries. When an array is created,
		//retrieve all values from it and while retrieving those values print capital 
		//for each country. (use 2 different loops).
		Scanner scanner=new Scanner(System.in);

	       System.out.println("What countries would you like to visit?");

	       String[] numCountry= new String [5];

	       String [][] countries= {
	                    {"Afghanistan", "Usa", "Pakistan", "India", "Canada"},
	                    {"Kabul","Washington", "Islamabad", "New Delhi", "Ottawa"},
	            };

	       for(int i=0; i<numCountry.length; i++ ) {
	    	   numCountry[i]=scanner.next();

	        for (String[] country:countries) {
	         for(String c:country) {

	            if (c.equals(numCountry[i]) && c.equals(countries[0][0])) {
	               System.out.println("The capital of "+countries[0][0]+" is "+countries [1][0]);
	           }
	            else if (c.equals(numCountry[i]) && c.equals(countries[0][1])) {
	                     System.out.println("The capital of "+ countries[0][1]+" is "+countries [1][1]);
	           }
	            else if (c.equals(numCountry[i]) && c.equals(countries[0][2])) {
	                     System.out.println("The capital of "+ countries[0][2]+" is "+countries [1][2]);
	           } 
	            else if (c.equals(numCountry[i]) && c.equals(countries[0][3])) {
	                     System.out.println("The capital of "+ countries[0][3]+" is "+countries [1][3]);
	           } 
	            else if (c.equals(numCountry[i]) && c.equals(countries[0][4])) {
	                     System.out.println("The capital "+countries[0][4]+" is "+countries [1][4]);
	           }
	         }
	
	        }
	       }
	}
}

