package GroupProjectCodiingTask;

public class Task4 {

	public static void main(String[] args) {
//Create a 2D array or integer type where you will 
//store odd and even numbers. Develop a program 
//which will identify/print the even numbers only.
		
		int[][]OddEven= {
				
				{ 2,4,6,8,10},
				{1,3,5,7,9},
				};
		for(int[] even:OddEven) {
			
			for(int e:even) {
				
			if(e%2==0)	{
				
				System.out.print(e+"   ");
			}
				
			}
		}
		
		
		

	}

}
