package greetingsInDifferentLanguages;

public class CountriesAndLanguages {
	
	
	String name;
	String whatIsTheNameOfYourCountry;
	String whatLanguageDoYouSpeak;
	

	public CountriesAndLanguages (String name, String whatIsTheNameOfYourCountry, String whatLanguageDoYouSpeak){
		this.name = name;
		this.whatIsTheNameOfYourCountry = whatIsTheNameOfYourCountry;
		this.whatLanguageDoYouSpeak = whatLanguageDoYouSpeak;
	}
	public void greetANigerian(){
		if (whatIsTheNameOfYourCountry.equalsIgnoreCase("Nigeria")){
		System.out.println ("Hello " + name + " How you Dey?");
	}else{
	System.out.println("Sorry since you are not a Nigerian, you are not welcome here!" );
	}
	}
	public void greetABritish(){
		if (whatIsTheNameOfYourCountry.equalsIgnoreCase("Britain")){
		System.out.println ("Hello " + name + " How do you do?");
	}else{
		System.out.println("Sorry since you are not British, you are not welcome here!" );
	}
	}
	public void greetAChinese(){
		if (whatIsTheNameOfYourCountry.equalsIgnoreCase("China")){
			System.out.println ("Hello " + name + " Nee Hou?");			
	}else{
		System.out.println ("Sorry since you are not a Chinese, you are not welcome here!" );	
	}
	}
	}
	
