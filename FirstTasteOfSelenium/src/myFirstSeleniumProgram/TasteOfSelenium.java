package myFirstSeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TasteOfSelenium {
	
	static String webName = "http://www.facebook.com";
	static String name = "Emilia";
	static String surname = "Okwor";
	static String myEmail = "emiliaokwor@yahoo.com";
	static String myPassword = "xxxxxx";
	
	public static void main(String[] args) throws InterruptedException {
	/*	open the browser
	 * 	maximize
	 * 	enter the facebook url
	 * 	input name and surname
	 * 	input our email address twice
	 * 
	 * JavaScript+CSS (Cascade Style Sheet)+HTML
	 */
		
		WebDriver driver = new FirefoxDriver();
//		driver.navigate().to(webName);
		driver.get(webName);
		driver.manage().window().maximize();
				
//driver.findElement(By.id("u_0_1")).sendKeys(name);
//driver.findElement(By.id("u_0_3")).sendKeys(surname);
//river.findElement(By.id("u_0_5")).sendKeys(myEmail);
//driver.findElement(By.id("u_0_8")).sendKeys(myEmail);
		
		driver.findElement(By.id("email")).sendKeys(myEmail);
		driver.findElement(By.id("pass")).sendKeys(myPassword);
		driver.findElement(By.id("u_0_x")).click();	
		Thread.sleep(10000);
		driver.quit();
		
	}
}
