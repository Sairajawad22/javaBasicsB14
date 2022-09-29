package GroupProjectCodiingTask;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		//Using Scanner create an array of integer values. 
		//After the array is created, calculate the sum of all stored elements in that array.
				

		Scanner scanner=new Scanner(System.in);
        int sum=0;
        int[] num=new int[4];
        System.out.println("Please enter your 4 numbers");

        for(int n:num) {
            int a=scanner.nextInt();

            sum+=a;

        }
        System.out.println("The sum of the numbers is "+sum);
    
	   }
				
	}


