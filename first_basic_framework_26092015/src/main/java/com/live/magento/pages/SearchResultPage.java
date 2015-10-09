package com.live.magento.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;



public class SearchResultPage extends AbstractPage{

	public SearchResultPage(WebDriver driver) {
		super(driver);
		
	}

	public void verifyTheProduct(String productName)  {
		try{
			boolean result = driver.getPageSource().contains(productName);
			logger.info("The condition has been determined" + result);
			Assert.assertFalse("The product name does not exist on the application",!result);
			logger.info("The product has been found on the page");
		}catch(Exception e){
			logger.error("The method verifyTheProduct has encountered an error", e);
			camera.takeShot("verifyTheProduct");
		}
	}

}
