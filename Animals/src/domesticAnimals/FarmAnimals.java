package domesticAnimals;

import java.util.Scanner;

public class FarmAnimals {

	public static void main(String[] args) {

Scanner farmAnimals = new Scanner (System.in);
System.out.println("Please enter your animal of choice");
String animal = farmAnimals.nextLine();
String animalOne = "cattle";
String animalTwo = "pig";
String animalThree = "goat";
String animalFour = "sheep";
System.out.println("You have entered:" + animal);
Scanner thingsAnimalsCanDo = new Scanner (System.in);
System.out.println("Please enter your preferred animal's activity");
String action = thingsAnimalsCanDo.nextLine();
String activityOne = "eat";
String activityTwo = "run";
String activityThree = "walk";
String activityFour = "jump";
System.out.println("Yes I can:" + action);


	}

}
