package com.live.magento.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties; 

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.live.magento.utilities.Screenshot;

public class AbstractPage {
	
		protected static WebDriver driver;
		protected static Properties config = new Properties ();
		protected static FileInputStream fis;
		protected static Screenshot camera;
		protected static Logger logger = LogManager.getLogger("TestLogger");

		public AbstractPage (WebDriver driver) {
			this.driver = driver;
			camera = new Screenshot(driver);
			try {
				fis = new FileInputStream("//Users//emiliaugwu//Documents//Automation//workspace//eclipseWorkspace//Selenium//first_basic_framework_26092015//src//main//resources//testDataRepo.properties");
			}catch (FileNotFoundException e) {
				e.printStackTrace();
				}
				try {
					config.load(fis);
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

//		public void openAndMaximizeBrowser (){
//			try{
//				driver.manage().window().maximize();
//				logger.info("Browser has been opened and maximized successfully");
//				driver.navigate().to(config.getProperty("base_url"));
//				logger.info("The web address has been loaded successfully");
//			}catch(Exception e) {
//				logger.error("The openAndMaximizeBrowser method has encounterd an error: " +e);
//				camera.takeShot("openAndMaximizeBrowser");
//			}
//		}
//		public void getProcessedWebAddressUsingPropertiesClass(){
//			String webName = "http://live.guru99.com";
//			String webName2 = "live.guru99";
//			String prefix = "www.live";
//			String suffix = "guru99.com";
//		
//			try{
//				if(webName.equalsIgnoreCase("webName")){
//						config.getProperty("webName");
//						driver.manage().window().maximize();
//						logger.info("The web address has been entered correctly");
//				}else if(webName.contains(webName2)){
//						config.getProperty("webName");
//						driver.manage().window().maximize();
//						logger.info("The web address has been entered correctly");
//				}else if(webName.endsWith(suffix)){
//						config.getProperty("webName");
//						driver.manage().window().maximize();
//						logger.info("The web address has been entered correctly");
//				}else if(webName.startsWith(prefix) && webName.endsWith(suffix)){
//						config.getProperty("webName");
//						driver.manage().window().maximize();
//						logger.info("The web address has been entered correctly");
//				}else{
//						logger.error("The web Address is incorrect");
//						camera.takeShot("getProcessedWebAddress");
//				}
//			}catch(Exception e){
//					logger.error("The getProcessedWebAddress method has encounterd an error: " +e);
//					camera.takeShot("getProcessedWebAddress");
//			}
//		
//		}

	//	get argument of web address to return processed web address
//		public void getProcessedWebAddress(){
//			String webName = "http://live.guru99.com";
//			String webName2 ="www.live.guru";
//			String prefix = "www.live";
//			String suffix ="guru99.com";
//			try{
//				if(webName.equalsIgnoreCase(webName)){
//					driver.get(webName);
//					driver.manage().window().maximize();
//					logger.info("The web address has been entered correctly");
//				}else if(webName.contains(webName2)){
//					driver.navigate().to(webName);
//					driver.manage().window().maximize();
//					logger.info("The web address has been entered correctly");
//				}else if(webName.endsWith(suffix)){
//					driver.get(webName);
//					driver.manage().window().maximize();
//					logger.info("The web address has been entered correctly");
//				}else if(webName.startsWith(prefix) && webName.endsWith(suffix)){
//					driver.navigate().to(webName);	
//					driver.manage().window().maximize();
//					logger.info("The web address has been entered correctly");
//				}else if(webName.startsWith(prefix)){
//					driver.navigate().to(webName);	
//					driver.manage().window().maximize();
//					logger.info("The web address has been entered correctly");
//				}else{
//					logger.error("The web Address is incorrect");
//					camera.takeShot("getProcessedWebAddress");
//				}
//			}catch(Exception e) {
//				logger.error("The getProcessedWebAddress method has encounterd an error: " +e);
//				camera.takeShot("getProcessedWebAddress");
//				}
//		
//		}
		
		public void searchForProduct (String productName) {
			try{
				driver.findElement(By.id("search")).sendKeys(productName);
				logger.info("The product" +productName+  "has been populated successfully");
				driver .findElement(By.cssSelector(".button.search-button")).click();
				logger.info("The search button has been clicked");
			}catch(Throwable t){
				logger.error("The method searchForProduct has encountered an error", t);
				camera.takeShot("searchForProduct");
			}
		}

		public void tearDown (){
			try{
				driver.quit();
				logger.info("The browser has now closed");
				driver = null;
				logger.info("The browser has no value");
			}catch(Throwable t){
				logger.error("The method tearDown has encountered an error", t);
				camera.takeShot("tearDown");
			}
		}

		}	
	

