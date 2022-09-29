package MyOwnPractice;

public class MyOwnPrc33 {

	public static void main(String[] args) {
		 String[][]arr= {
  {"Sonam", "Saira", "Aisha","Humaira"},
 {"A","B","C","D"},
 
   };  
		 // inhance for loop
		 
		 for (String[]singleArray :arr) {
			for(String el:singleArray) {
				
				System.out.print(el+"  ");
			}
			System.out.println(); 
		 }
		 System.out.println("_____________________________________"); 
		 // simple for loop
		 for(int i=0; i<arr.length; i++) {// number of rows
			for(int j=0; j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();  
		 }
	}

}
