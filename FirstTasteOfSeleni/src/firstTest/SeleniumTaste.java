package firstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTaste {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
//		driver.navigate().to("http://www.facebook.com");
		driver.get("http://www.facebook.com");
		
	}
}
