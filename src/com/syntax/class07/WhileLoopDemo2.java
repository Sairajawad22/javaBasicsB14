package com.syntax.class07;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		// print all number from 1 to 10
		
		int num=1;
		while(num<=10) {
			
			System.out.print(num+ " ");
			num++;
			
		}
		System.out.println(num+ " -------------------------");
		//print all numbers from 10 to 25
		int a=10;
		while(a<=25) {
			System.out.print(a+ " ");
			a++;
		}
				
		System.out.println(num+ " -------------------------");
		//print all numbers from 10 to 1
		int b=10;
		while(b>=1) {
			System.out.print(b+ " ");
			b--;
		}
		
	}

}
