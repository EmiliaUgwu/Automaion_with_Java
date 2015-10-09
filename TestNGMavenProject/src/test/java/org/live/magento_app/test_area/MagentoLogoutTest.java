package org.live.magento_app.test_area;

import org.live.magento_app.pages.AbstractPage;
import org.live.magento_app.pages.HomePage;
import org.live.magento_app.pages.MyAccountPage;
import org.live.magento_app.pages.WelcomePage;
import org.live.magento_app.testData.LoginTestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MagentoLogoutTest {

	private WebDriver driver;
	private AbstractPage abstractPage;
	private HomePage homePage;
	private MyAccountPage myAccountPage;
	private WelcomePage welcomePage;
	   
	   
	   @BeforeMethod
	   public void setUp() {
	    driver = new FirefoxDriver();
	    abstractPage = new AbstractPage(driver);
	    homePage = new HomePage(driver);
	    myAccountPage = new MyAccountPage(driver);
	    welcomePage = new WelcomePage(driver);
	    abstractPage.openAndMaximizeBrowser();
	   }
	   
	   @Test(dataProvider = "loginData",dataProviderClass = LoginTestData.class)
	   public void loginTest (String username, String password, String name) {
	    homePage.openMyAccount();
	    myAccountPage.loginWith(username, password);
	    welcomePage.verifyLogin(name, username);
	    
	   }
	   
	   @AfterMethod
	    public void executePostCondition () {
	     abstractPage.tearDown();
	    }
	   
}
