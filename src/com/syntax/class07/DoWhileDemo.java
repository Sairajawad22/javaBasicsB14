package com.syntax.class07;

import java.util.Scanner;

public class DoWhileDemo {
// when we don;t know in advance how many times to repeat a block of codes
		
		public class DoWhileExamples {

		    public void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        String answer;

		        do {
		            System.out.println("Did you get a job?");
		            answer = sc.nextLine();

		        } while (!answer.equals("yes"));

		        System.out.println("Congrats");
	}
		}
}
