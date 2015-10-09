package com.live.magento.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	
	public void openMyAccount () {
		try{
			logger.info("My Account button is about to be clicked");
			driver.findElement(By.xpath("//*[@id='top']/body/div[1]/div/div[3]/div/div[4]/ul/li[1]/a")).click();
			logger.info("Account has opened successfully");
		}catch(Throwable t){
			logger.error("The method openMyAccount has encountered an error: " +t);
			camera.takeShot("openMyAccount");
			
			
		}
	}
}
