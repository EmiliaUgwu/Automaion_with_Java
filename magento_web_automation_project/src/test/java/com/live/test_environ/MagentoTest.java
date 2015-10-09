package com.live.test_environ;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.live.pages.AbstractPage;
import com.live.pages.HomePage;
import com.live.pages.MyAccountPage;
import com.live.pages.WelcomePage;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

@RunWith(DataProviderRunner.class)
public class MagentoTest {

	
	
		private WebDriver driver;
		private AbstractPage abstractPage;
		private HomePage homePage;
		private MyAccountPage myAccountPage;
		private WelcomePage welcomePage;
		
		
		
		@Before
		public void setUp() {
			driver = new FirefoxDriver();
			abstractPage = new AbstractPage(driver);
			homePage = new HomePage(driver);
			myAccountPage = new MyAccountPage(driver);
			welcomePage = new WelcomePage(driver);
			abstractPage.openAndMaximizeBrowser();
		}
		
		@Test @UseDataProvider("dataForMagentoLogin")
		public void loginTest (String username, String password, String name) {
			homePage.openMyAccount();
			myAccountPage.loginWith(username, password);
			welcomePage.verifyLogin(name, username);
			
		}
		
		@DataProvider
		public static Object[][] dataForMagentoLogin(){
			return new Object[][]{
				{"234dotus@gmail.com", "password123", "Donald Jonathan"},
				{"234dorgetus@gmail.com", "password123", "Invalid login or password"},
				{"234dotus@gmail.com", "password17823", "Invalid login or password"},
				{"234doghdztus@gmail.com", "pwnbrd123", "Invalid login or password"}
				
			};
			
			}	
		
		@After
			public void executePostCondition () {
				abstractPage.tearDown();
			}
		
		}


