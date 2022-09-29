package reviewClass2;

public class IfElseIfDemo {

	public static void main(String[] args) {
		/* if we need one outcome based on if conditions we use
		 * if if the outcomes are two we use if else if outcome are more 
		 * than that we can use if else if
		 * whenever you have to check more than two condition always use if elseif condition 
		 */
		int number = 0;

        if (number > 0) {
            System.out.println("number is positive");
        }
        if (number < 0) {
            System.out.println("number is negative");

        }
        if (number == 0) {
            System.out.println("number is 0");

        }
//**********************************second line

        if (number > 0) 
        {
            System.out.println("number is positive");
        } 
        else if (number < 0) 
        {
            System.out.println("number is negative");

        }
        else  {
            System.out.println("number is 0");
        }

	}

}

