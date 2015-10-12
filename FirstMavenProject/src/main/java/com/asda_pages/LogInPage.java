package com.asda_pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LogInPage extends AbstractPage{

	public LogInPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void clickSignInButton(String username, String password){
		driver.findElement(By.id("sign-in-button-accessible")).click();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("btn-signIn-accessible")).click();
	}
	
	public void verifyThePresenceOf(String titleMessage, String message){
		boolean answer1 = driver.getTitle().contains(titleMessage);
		Assert.assertTrue("This message does not contain: " , answer1);
		boolean answer2 = driver.getPageSource().contains(message);
		Assert.assertTrue("This message does not contain: " , answer2);
	}
}
