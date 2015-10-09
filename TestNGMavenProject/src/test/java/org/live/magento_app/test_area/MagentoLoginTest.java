package org.live.magento_app.test_area;


import org.live.magento_app.pages.AbstractPage;
import org.live.magento_app.pages.HomePage;
import org.live.magento_app.pages.MyAccountPage;
import org.live.magento_app.pages.WelcomePage;
import org.live.magento_app.testData.LoginTestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class MagentoLoginTest {
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
   
   //this is just to demo @Ignore in testNG because there is no @Ignore in testNG
   @Test(enabled = false)//(enabled = true) will run the test
   public void loginTest2 (String username, String password, String name) {
    homePage.openMyAccount();
    myAccountPage.loginWith(username, password);
    welcomePage.verifyLogin(name, username);
    
   }
//   this is to demo that u want the class to run all the time
//   @Test(alwaysRun = true)
//   public void loginTest3 (String username, String password, String name) {
//    homePage.openMyAccount();
//    myAccountPage.loginWith(username, password);
//    welcomePage.verifyLogin(name, username);
//    
//   }
   
//   this is to demo how long you want a test to time out if it dosen't run
// @Test(timeout = 6000)
// public void loginTest3 (String username, String password, String name) {
//  homePage.openMyAccount();
//  myAccountPage.loginWith(username, password);
//  welcomePage.verifyLogin(name, username);
//  
// }
   @AfterMethod
    public void executePostCondition () {
     abstractPage.tearDown();
    }
   
   @AfterClass
   public void stopDatabase(){
	   System.out.println("Stoping database connection....");
   }
   
   
   @BeforeClass
   public void startDatabase(){
	   System.out.println("Starting database connection....");
   }
   }