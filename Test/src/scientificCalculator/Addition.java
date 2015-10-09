package scientificCalculator;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		String firstNumber = scan.nextLine();
		
		System.out.println("Enter second number");
		String secondNumber = scan.nextLine();
		
		int convertedNumberOne = Integer.parseInt(firstNumber);
		int convertedNumberTwo = Integer.parseInt(secondNumber);
		
		int result = convertedNumberOne + convertedNumberTwo;
		
		System.out.println(result);
	}

		

}
