package GroupProjectCodiingTask;

public class Task3 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.
		
		 int a[][] = { 
		 
		     {1, 3, 4},
		      {2, 3},
		      {10,10},
		 
		 };
	        int sum = 0;
	        for(int i = 0; i < a.length; i++) {
	        
	            for(int j = 0; j < a[i].length; j++) {
	            
	                sum += a[i][j];
	            }    
	        }
	        System.out.println("sum = " + sum);
	       
	        
	       
	        	
	        }
	}
	
	
	

	
