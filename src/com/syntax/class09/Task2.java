package com.syntax.class09;

public class Task2 {

	public static void main(String[] args) {
		//Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		// First way
				String[] names=new String[10];
				names[0]="Hina";
				names[1]="Mina";
				names[2]="Bilal";
				names[3]="Ahmad";
				names[4]="Saira";
				names[5]="Hina";
				names[6]="Jon";
				names[7]="Mike";
				names[8]="Bob";
				names[9]="Sam";
				System.out.println(names[4]);
			
			// second way
			String[]group= {"Hina","Mina","Bilal","Ahmad","Saira","Hina","Jon","Mike","Bob","Sam"};
			System.out.println(names[4]);
			int size=names.length;
			System.out.println("size of arrays= "+ size);

}
}