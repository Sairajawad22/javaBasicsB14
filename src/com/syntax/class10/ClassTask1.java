package com.syntax.class10;

public class ClassTask1 {

	public static void main(String[] args) {
// Create a 2D array (longer way)where you will store the following values:
//Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama After storing values 
//print following String:Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		
		String[][] bigArr=new String[2][4];
        //1 row
        bigArr[0][0]="Mr.";
        bigArr[0][1]="Mrs.";
        bigArr[0][2]="Miss.";
        bigArr[0][3]="Ms.";
        //2 row
        bigArr[1][0]="Smith";
        bigArr[1][1]="Jordan";
        bigArr[1][2]="Jackson";
        bigArr[1][3]="Obama";
        System.out.println(bigArr[0][1]+" "+bigArr[1][0]+","+bigArr[0][0]+" "+bigArr[1][3]+","+bigArr[0][3]+" "+bigArr[1][2]+","+bigArr[0][2]+" "+bigArr[1][1]+".");
System.out.println("--------------------------------");

//Create a 2D array(shorter way) in which first array will consist of 4 names and second array 
	//will contain grades. Then your program should print name of the students that has A and B grade
  String[][]arr= {
		  
  {"Sonam", "Saira", "Aisha","Humaira"},
  {"A","B","C","D"},
  };  
  System.out.println(arr[0][0]+"="+arr[1][0]);     
  System.out.println(arr[0][1]+"="+arr[1][1]);
  System.out.println(arr[0][2]+"="+arr[1][2]);
  System.out.println(arr[0][3]+"="+arr[1][3]);
	}

}
