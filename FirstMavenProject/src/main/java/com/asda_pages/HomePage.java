package com.asda_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver  = driver;
		
		
	}
	public void clickShopNowButton(){
	driver.findElement(By.partialLinkText("Shop now")).click();
		
		
	}
	
}
	
	