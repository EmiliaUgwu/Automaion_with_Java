package com.asda_test;


import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.asda_pages.Groceries_freshAndChilled;
import com.asda_pages.HomePage;
import com.asda_pages.LogInPage;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

@RunWith(DataProviderRunner.class)
public class asdaTest {

	
	public WebDriver driver;
	private String baseUrl = "http://www.asda.com";
	private HomePage homePage;
	private Groceries_freshAndChilled groceries;
	private LogInPage logInPage;
	
	
	
	
	@Before
	public void setUp(){
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.navigate().to(baseUrl);
			homePage = new HomePage(driver);
			logInPage = new LogInPage(driver);
			groceries = new Groceries_freshAndChilled(driver);
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}

	@Test
	public void testShopNow(){
		homePage.clickShopNowButton();
	}
	
	
	@Test@Ignore
	public void testHowToBuyThings(){
		groceries.openFreshAndChilled();
		groceries.openFruitsVegAndFlowers();
		groceries.openFruits();
		groceries.openGrapesBerriesAndCherries();
		groceries.selectFruitOfYourChoice();
		groceries.veryfyThePresenceOf();
		groceries.clickOnCheckoutBotton();
		
	}
	
	@Ignore
	@Test @UseDataProvider("dataForLoginTest")
	public void testSignInButton(String username, String password, String titleMessage, String message){
		logInPage.clickSignInButton(username, password);
		logInPage.verifyThePresenceOf(titleMessage, message);
	}
	
	@DataProvider
	public static Object[][] dataForLoginTest(){
		return new Object[][]{
			{"redbulltesters@gmail.com", "tester123", "Welcome to Asda Groceries", "Your eVoucher"},
			{"redbulltesters@gmail.com", "tester89123", "Welcome to Asda Groceries", "Sorry, we didn't recognise your details, "},
			{"redbues6754hfds@gmail.com", "tester123", "Welcome to Asda Groceries", "Sorry, we didn't recognise your details, "},
			{"redbulltgrdhers@gmail.com", "testgfdh123", "Welcome to Asda Groceries", "Sorry, we didn't recognise your details, "},
			{"											", "tester123", "Welcome to Asda Groceries", "Sorry, we didn't recognise your details, "},
			{"											", "testgder123", "Welcome to Asda Groceries", "Sorry, we didn't recognise your details, "},
			{"redbulltesters@gmail.com", "					", "Welcome to Asda Groceries", "Sorry, we didn't recognise your details, "},
			{"redltestersgrefes@gmail.com", "					", "Welcome to Asda Groceries", "Sorry, we didn't recognise your details, "},
			{"											", "				", "Welcome to Asda Groceries", "Sorry, we didn't recognise your details, "},
		};
	}

}



