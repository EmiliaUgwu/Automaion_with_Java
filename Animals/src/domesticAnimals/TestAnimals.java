package domesticAnimals;

import java.util.Scanner;

public class TestAnimals {

	public static void main(String[] args) {
	
		String ani1 = "cattle";
		String ani2 = "pig";
		String ani3 = "goat";
		String ani4 = "sheep";
		
Scanner scan = new Scanner(System.in);
System.out.println ("Pls enter your animal of choice");
String answer = scan.nextLine();
System.out.println ("How many legs does the animal have?");
int answe  = scan.nextInt();
System.out.println ("Does animal have sore mouth? Please enter True or False");
boolean doseAnimalHaveSoreMouth  = scan.nextBoolean();
System.out.println ("Does animal have sore leg? Please enter True or False");
boolean doesAnimalHaveSoreLeg  = scan.nextBoolean();

if(answer.equalsIgnoreCase("cattle")){
	System.out.println("Yes we have:" + ani1);
	String answer1 = scan.nextLine();
}	//if(doesAnimalHaveSoreLeg.equalsIgnoreCase("false")){
	//System.out.println("Yes it Walks");
	//String walk = scan.nextLine(); }
else if(answer.equalsIgnoreCase("pig")){
	System.out.println("Yes we have:" + ani2);
	String answer2 = scan.nextLine();
}else if(answer.equalsIgnoreCase("goat")){
	System.out.println("Yes we have:" + ani3);
	String answer3 = scan.nextLine();
}else if(answer.equalsIgnoreCase("sheep")){
	System.out.println("Yes we have:" + ani4);
	String answer4 = scan.nextLine();
}else{
	System.out.println("Please we have no:" + answer);
		
	}

//Cattle ca = new Cattle(4);
Pig p = new Pig();
Goat gt = new Goat();
Sheep shp = new Sheep();


	}}

	

