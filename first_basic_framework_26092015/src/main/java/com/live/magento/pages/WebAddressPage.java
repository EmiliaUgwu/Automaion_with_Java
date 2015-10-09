package com.live.magento.pages;

import org.openqa.selenium.WebDriver;

public class WebAddressPage extends AbstractPage{
	

	public WebAddressPage(WebDriver driver) {
		super(driver);
		
	}

	public String getUrlFormatter(String recievedUrlAddress){
		String processedAddress = null;
		String urlAddress = recievedUrlAddress.toLowerCase();
		
		try {
			
			if(urlAddress.startsWith("http://") && urlAddress.endsWith(".com")){
				processedAddress = urlAddress;
				driver.navigate().to(processedAddress);	
				driver.manage().window().maximize();
				logger.info("The web address has been entered correctly");
				return processedAddress;
				
			}else if(urlAddress.startsWith("http://") && !urlAddress.endsWith(".com")){
				processedAddress = urlAddress + ".com";
				driver.navigate().to(processedAddress);	
				driver.manage().window().maximize();
				logger.info("The web address has been entered correctly");
				return processedAddress;
				
			}else if(urlAddress.startsWith("www") && !urlAddress.endsWith(".com")){
				processedAddress = "http://" + urlAddress + ".com";
				driver.navigate().to(processedAddress);	
				driver.manage().window().maximize();
				logger.info("The web address has been entered correctly");
				return processedAddress;
				
			}else if(!urlAddress.startsWith("http://") && urlAddress.startsWith("www") && !urlAddress.endsWith(".com")){
				processedAddress = "http://" + urlAddress + ".com";
				driver.navigate().to(processedAddress);	
				driver.manage().window().maximize();
				logger.info("The web address has been entered correctly");
				return processedAddress;
				
			}else if(!urlAddress.startsWith("http://") && !urlAddress.startsWith("www") && urlAddress.endsWith(".com")){
				processedAddress = "http://" + "www" + urlAddress;
				driver.navigate().to(processedAddress);	
				driver.manage().window().maximize();
				logger.info("The web address has been entered correctly");
				return processedAddress;
				
			}else if(!urlAddress.startsWith("http://") && !urlAddress.startsWith("www") && !urlAddress.endsWith(".com")){
				processedAddress = "http://" + "www" + urlAddress + ".com";
				driver.navigate().to(processedAddress);	
				driver.manage().window().maximize();
				logger.info("The web address has been entered correctly");
				return processedAddress;
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return processedAddress;
	}
}
