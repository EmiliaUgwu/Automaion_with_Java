package examResult;

import java.util.Scanner;

/*Program to calculate student results
 * Created by Emilia
 */

public class Grade {

	public static void main(String[] args) { 
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter number one: ");
		int num1 = scan.nextInt();
		System.out.println("please enter number two: ");
		int num2 = scan.nextInt();
		
		int addition = num1 + num2;
		
		int subtraction = num1 - num2;
		
		int multiplication = num1 * num2;
		
		int division = num1 / num2;
		
		int modulus = num1%num2;
		
		System.out.println("modulus:");
		System.out.println(modulus);
		System.out.println("addition");
		System.out.println(addition);
		System.out.println("subtraction");
		System.out.println(subtraction);
		System.out.println("division");
		System.out.println(division);
		System.out.println("multiplication");
		System.out.println(multiplication);
		
	System.out.println("This is the answer for modulus: "+ modulus);
	System.out.println("This is the answer for modulus: "+ addition);
	System.out.println("This is the answer for modulus: "+ subtraction);
	System.out.println("This is the answer for modulus: "+ division);
	System.out.println("This is the answer for modulus: "+ multiplication);
	
	
	}

}
