package com.syntax.class10;

public class TwoDArrayExample {

	public static void main(String[] args) {
	String[][]countries= {
			{"Usa", "Canada"},// 1 arrays with index0
			{"Peru", "Brazil", "Colombia", "Ecuador" },// 2 arrays with index1
			{"Ethopia", "Egypt", "Kenya"},
			{"Germany", "Turkiya", "Moldova","Ukrain"},
			{"Kazakhstan", "Afghanistan", "Koria"},
	};
System.out.println(countries.length);// total number of arrays or rows =5 

 int elOf1arr  =countries[0].length;
 System.out.println("# of elements from 1 array="+ elOf1arr);
 
 int elOf2arr  =countries[1].length;
 System.out.println("# of elements from 1 array="+ elOf2arr);
 
 System.out.println("-----------getting all values from 2D array----------");
 // for loop
 for(int r=0; r<countries.length; r++) {// loops over rows
	 for(int c=0; c<countries[r].length; c++) {
		 
		 System.out.println(countries[r][c]);
	 }
 }
 
 
 
	}

}
