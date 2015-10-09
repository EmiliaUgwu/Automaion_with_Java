package org.live.magento_app.pages;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
		protected WebDriver driver;
		private String base_url = "http://live.guru99.com"; 

		public AbstractPage (WebDriver driver) {
			this.driver = driver;
		}
	
		public void openAndMaximizeBrowser (){
			driver.navigate().to(base_url);
			driver.manage().window().maximize();
		}
		
		public void tearDown (){
			driver.quit();
		}
}
