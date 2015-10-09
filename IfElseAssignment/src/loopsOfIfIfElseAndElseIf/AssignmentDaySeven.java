package loopsOfIfIfElseAndElseIf;

import java.util.Scanner;

public class AssignmentDaySeven {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println ("Please enter your name ");
		String name = scan.nextLine();
		System.out.println ("Please enter your Department ");
		String department = scan.nextLine();
		System.out.println ("Please enter your score");
		String score = scan.nextLine();
		int convertedScore = Integer.parseInt(score);
		
//		int convertedScore1 = 0 - 39;
//		int convertedScore2 = 40 - 69;
//		int convertedScore3 = 70 - 100;
		
		if(convertedScore>=0 && convertedScore<=39){
		System.out.println (name + ": You have failed this term, Please repeate the class.");
		}else if(convertedScore>=40 && convertedScore <=69) {
		System.out.println (name + ": You have passed this term, Please prepare for the next.");
		}else if(convertedScore>=70 && convertedScore <=100){
		System.out.println (name + ": You have made a distinction, Please check with admin. for your scholarship.");
		}else{
		System.out.println (name + ": There is no such score in this school.");
		}
	}
}
