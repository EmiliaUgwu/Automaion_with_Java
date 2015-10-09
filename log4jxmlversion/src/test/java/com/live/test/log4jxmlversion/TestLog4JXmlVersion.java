package com.live.test.log4jxmlversion;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLog4JXmlVersion {
	
	public static Logger logger = LogManager.getLogger("fileAppender");
	protected static WebDriver driver;
	
	

	
	

	public static void main(String[] args) {
		DOMConfigurator.configure("//Users//emiliaugwu//Documents//Automation//workspace//eclipseWorkspace//Selenium//log4jxmlversion//src//main//resources//log4j.xml");
		
//		String name  = System.getProperty("user.dir"); This is another way to get the path of .properties files or .log files
//		System.out.println(name); 
		
		driver = new FirefoxDriver();
//		logger.info("Browser has been instantiated and lunched successfully");
		driver.get("http://www.facebook.com");
//		logger.info("Web address has been loaded successfully");
		driver.manage().window().maximize();
//		
//		logger.error("Error occured");
//		logger.warn("This is warning message");
//		logger.fatal("This is fatal example");
//		logger.debug("This is debug example");
//		
//	
//		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		System.out.println(FileUtils.getTempDirectoryPath());//you don't really need to do this, just a demo of things you can do with FileUtils 
//		try {
//			FileUtils.copyFile(screenshot, new File("//Users//emiliaugwu//Documents//Automation//workspace//eclipseWorkspace//Selenium//log4jxmlversion//LoggerReport//learningScreenshots.png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		WebElement selectDayOption = driver.findElement(By.id("day"));
		Select selectDay = new Select (selectDayOption);
		selectDay.selectByIndex(3); //we can select by value, by visible text, and by index 
		
		WebElement selectMonthOption = driver.findElement(By.id("month"));
		Select selectMonth = new Select (selectMonthOption);
		selectMonth.selectByValue("sept");
		
		WebElement selectYearOption = driver.findElement(By.id("year"));
		Select selectYear = new Select (selectYearOption);
		selectYear.selectByVisibleText("1990");
		
	// selecting the female word	
		driver.findElement(By.id("u_0_d")).click();
		
		driver.quit();
	}
	}

