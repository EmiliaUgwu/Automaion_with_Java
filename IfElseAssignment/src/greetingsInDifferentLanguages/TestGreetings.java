package greetingsInDifferentLanguages;

import java.util.Scanner;

public class TestGreetings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = sc.nextLine();
		
		System.out.println("What is the name of your country, Nigeria, Britain or China?");
		String country = sc.nextLine();
		
		System.out.println("What language do you speak?");
		String lang = sc.nextLine();
		
		
		CountriesAndLanguages greeting = new CountriesAndLanguages(name, country, lang);
		if(country.equalsIgnoreCase("Nigeria")){
			greeting.greetANigerian();
		}else if (country.equalsIgnoreCase("Britain")){
			greeting.greetABritish();
		}else if (country.equalsIgnoreCase("China")){
			greeting.greetAChinese();
		}else{
			System.out.println("Sorry since you are not a Nigerian, British, or Cinese, you are not welcome here!" );
		}
		}
	
	}
