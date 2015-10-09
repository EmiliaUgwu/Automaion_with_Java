package fourLeggedAnimals;

import java.util.Scanner;

public class TestActiveAnimals {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Which animal do you want to inspect and buy? cattle, pig, goat or sheep");
		String typeOfanimal = scan.nextLine();
		
		System.out.println("How many legs does the animal have");
		String animalLegs = scan.nextLine();
		int numOfanimalLegs = Integer.parseInt(animalLegs);
		
		System.out.println("Is the animal's legs strong? enter true or false");
		String strongLegs = scan.nextLine();
		boolean hasStronglegs = Boolean.parseBoolean(strongLegs);
		
		
		System.out.println("Does animal have sore mouth? enter true or false");
		String soreMouth = scan.nextLine();
		boolean hasSoremouth = Boolean.parseBoolean(soreMouth);
		
		ActiveAnimals cattle = new ActiveAnimals(numOfanimalLegs, hasStronglegs, hasSoremouth);
		ActiveAnimals pig = new ActiveAnimals(numOfanimalLegs, hasStronglegs, hasSoremouth);
		ActiveAnimals goat = new ActiveAnimals(numOfanimalLegs, hasStronglegs, hasSoremouth);
		ActiveAnimals sheep = new ActiveAnimals(numOfanimalLegs, hasStronglegs, hasSoremouth);

		if(typeOfanimal.equalsIgnoreCase("cattle")){
			System.out.println("Which action do you want the animal to perform? eat, run, walk or jump");
			String action = scan.nextLine();
			
			if(action.equalsIgnoreCase("eat")){
				cattle.eat();
			}
			else if(action.equalsIgnoreCase("run")){
				cattle.run();
			}
			else if(action.equalsIgnoreCase("walk")){
				cattle.walk();
			}
			else if(action.equalsIgnoreCase("jump")){
				cattle.jump();
			}
			else {
				System.err.println("Invalid action, please try again");
				}
			
		}
		
		else if(typeOfanimal.equalsIgnoreCase("pig")){
			System.out.println("Which action do you want the animal to perform? eat, run, walk or jump");
			String action = scan.nextLine();
			
			if(action.equalsIgnoreCase("eat")){
				pig.eat();
			}
			else if(action.equalsIgnoreCase("run")){
				pig.run();
			}
			else if(action.equalsIgnoreCase("walk")){
				pig.walk();
			}
			else if(action.equalsIgnoreCase("jump")){
				pig.jump();
			}
			else {
				System.err.println("Invalid action, please try again");
				}	
		}
		
		else if(typeOfanimal.equalsIgnoreCase("goat")){
			System.out.println("Which action do you want the animal to perform? eat, run, walk or jump");
			String action = scan.nextLine();
			
			if(action.equalsIgnoreCase("eat")){
				goat.eat();
			}
			else if(action.equalsIgnoreCase("run")){
				goat.run();
			}
			else if(action.equalsIgnoreCase("walk")){
				goat.walk();
			}
			else if(action.equalsIgnoreCase("jump")){
				goat.jump();
			}
			else {
				System.err.println("Invalid action, please try again");
				}	
		}
		
		else if(typeOfanimal.equalsIgnoreCase("sheep")){
			System.out.println("Which action do you want the animal to perform? eat, run, walk or jump");
			String action = scan.nextLine();
			
			if(action.equalsIgnoreCase("eat")){
				sheep.eat();
			}
			else if(action.equalsIgnoreCase("run")){
				sheep.run();
			}
			else if(action.equalsIgnoreCase("walk")){
				sheep.walk();
			}
			else if(action.equalsIgnoreCase("jump")){
				sheep.jump();
			}
			else {
				System.err.println("Invalid action, please try again");
				}	
		}
		
		else {
			System.out.println("Wrong animal type, please try again");
		}
	
	}
}
