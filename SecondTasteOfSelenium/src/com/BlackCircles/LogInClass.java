package com.BlackCircles;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInClass {

	private WebDriver driver;
	public String welcomeMessage = "Welcome . Dotcom to your";

	public LogInClass(WebDriver driver) {
		this. driver = driver;
	}
	
	
		public void openMyAccount(){
			driver.findElement(By.partialLinkText ("My Account")).click();
		}
		
		
		public void clickLogInButton(String username, String password ){
			driver.findElement(By.name("Email")).sendKeys(username);
			driver.findElement(By.name ("Password")).sendKeys(password);
			driver.findElement(By.name ("submit")).click();
		}
		
		public void verifyThePresenceOf (String logoutMessage, String titleMessage, String welcomeMassage){
			boolean logoutAnswer = driver.getPageSource().contains(logoutMessage);
			Assert.assertTrue("The page does not contain welcome message: " + welcomeMessage, logoutAnswer);
			boolean titleAnswer = driver.getTitle().contains(titleMessage);
			Assert.assertTrue("This page does not contain titleMessage: " , titleAnswer);
			boolean welcomeAnswer = driver.getPageSource().contains(welcomeMassage);
			Assert.assertTrue("This page does not contain: ", welcomeAnswer);
		}

}
