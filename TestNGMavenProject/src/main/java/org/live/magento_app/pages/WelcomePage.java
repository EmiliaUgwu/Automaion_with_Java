package org.live.magento_app.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WelcomePage extends AbstractPage{

	public WelcomePage(WebDriver driver) {
		super(driver);

	}

	public void verifyLogin(String name, String username) {
		boolean test1 = driver.getPageSource().contains(name);
		Assert.assertTrue(test1);
		boolean test2 = driver.getPageSource().contains(username);
		Assert.assertTrue(test2);

	}
}
