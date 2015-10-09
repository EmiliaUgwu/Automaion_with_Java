import java.util.Scanner;

public class myDad {

	public static void main(String[] args) {
		
		
	
		//Describing my Dad
		
	//String name = "His name is Steve Okwor";
	//int age = 75;
	//String colour = "His favourite colour is Blue";
	//String wife = "He was married to Late Mrs Okwor";
	//String children  = "He has five children";
	//String whereAreYouFrom = "He is from Ikem - Nigeria";
	//Boolean areYouAMale = true;
	

	//System.out.println(name+75+colour+wife+children+"Ikem-Nigeria"+true);
	
	
	
	//int age1 = 75;
	//Boolean areYouAMale1 = true;
	//Double hisSalaryPerAnnum = 1000000.00
		
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please tell me about my Dad:");
		String myDad = scan.nextLine();
String name1 = "His name is Steve Okwor";
String colour1 = "His favourite colour is Blue";
String wife1 = "He was married to Late Mrs Okwor";
String children1  = "He has five children";
String whereAreYouFrom1 = "He is from Ikem - Nigeria";
System.out.println("Ok, here is the story:" + myDad);


	System.out.println(name1+ colour1+ wife1+ children1+ whereAreYouFrom1);
	}

}
