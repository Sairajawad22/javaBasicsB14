package com.syntax.class06;

public class SwichDemo1 {

	public static void main(String[] args) {
		// matching cases must be of the same data type as a variable in switch
        // no duplicated case in switch

        char choice='Y';
        String answer;

        switch(choice) {
        case 'Y':
            answer="Yes";
            break;
        case 'N':
            answer="No";
            break;
        case 'M':
            answer="Maybe";
            break;
        default:
            answer="Unkown";
            break;
        }
    System.out.println(answer);
/*
 * Limitation of switch case
 * switch case can not use logical operators
 * switch case can not use relational operators
 * 
 * switch case can not work boolean value b/c it has only two condition true/false
 * CE: cannot switch on a value of type boolean
 * boolean boo=true;
 * SW case cannot work with float/double and long
 * 
 */

	}

}
