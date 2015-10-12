package com.live.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends AbstractPage{

	
	public WelcomePage(WebDriver driver) {
		super(driver);
		
	}

		public void verifyLogin (String name, String username) {
			boolean test1 = driver.getPageSource().contains(name);
			Assert.assertTrue("The test could not find the name:  "+ name, test1);
			boolean test2 = driver.getPageSource().contains(username);
			Assert.assertTrue("The test could not find the username:  "+ username, test2);
		}
}
