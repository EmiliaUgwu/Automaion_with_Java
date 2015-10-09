package schoolThings;

import java.util.Scanner;

public class SmartScoreProgram {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your Surname");	
		String surname = scan.nextLine();
		System.out.println("Please enter your Firstname");
		String firstname = scan.nextLine();
		System.out.println("Please enter your depertment");
		String depertment = scan.nextLine();
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		System.out.println("Please enter your score");
		int score = scan.nextInt();
		
		
			if(score >=0 && score <=39 && age >=18 && age <=60){
			System.out.println("you have failed, Repeate the class!");
				}else if(score >=40 && score <=69 && age >=18 && age <=60){
					System.out.println("You passed with a narrow escape!");
				}else if(score >=70 && score <=80 && age >=18 && age <=60){
					System.out.println("You passed, you are in the top 30 best students!");
				}else if(score >=81 && score <=90 && age >=18 && age <=60){
					System.out.println("You are an excellent student, you are in the top 20 best students!");
				}else if(score >=91 && score <=100 && age >=18 && age <=60){
					System.out.println("You are a genius, you are in the top 10 best students!");
				}else{
					System.out.println("You are not a student in this school, Please check with the Admin. Office.Thank You!!!");}
				}
			
		}
