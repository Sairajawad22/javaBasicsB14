package GroupProjectCodiingTask;

public class Task7 {

	public static void main(String[] args) {
		// Write a java program to check whether 
		//a given number is prime or not?
		
		int num=5;
        boolean number=false;
        for(int i=2;i<=num/2;i++) {
            if(num%i==0) {
                number=true;
                break;
            }

        }
        if(!number)
            System.out.println(num+ " is a prime number");
        else
            System.out.println(num+" is not a prime number");


	}

}
