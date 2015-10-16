package com.live.magento.test_area;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.live.magento.pages.AbstractPage;
import com.live.magento.pages.HomePage;
import com.live.magento.pages.MyAccountPage;
import com.live.magento.pages.SearchResultPage;
import com.live.magento.pages.WebAddressPage;
import com.live.magento.pages.WelcomePage;
import com.live.magento.spreadsheet.util.Constant;
import com.live.magento.spreadsheet.util.ExcelReader;

public class MagentoLoginFeatureTest {

	
	private WebDriver driver;
	private AbstractPage abstractPage;
	private HomePage homePage;
	private MyAccountPage myAccountPage;
	private WelcomePage welcomePage;
	private SearchResultPage searchResultPage;
	WebAddressPage webAddressPage;
	
	String recievedUrlAddress = "live.guru99";
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		abstractPage = new AbstractPage(driver);
		homePage = new HomePage(driver);
		myAccountPage = new MyAccountPage(driver);
		welcomePage = new WelcomePage(driver);
		searchResultPage = new SearchResultPage (driver) ;
		webAddressPage = new WebAddressPage (driver);
		webAddressPage.getUrlFormatter(recievedUrlAddress);
		ExcelReader.setExcelFile(Constant.Path_TestData + Constant.file_TestData, "login_data");
		
	}
	
	
	@Test
	public void loginTest () {
		try{
		String username = ExcelReader.getCellData(1, 1);
		String password = ExcelReader.getCellData(1, 2);
		
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		welcomePage.verifyLogin();
		
		ExcelReader.setCellData("Passed", 1, 3);
		}catch (Exception e) {
			try {
				ExcelReader.setCellData("Failed", 1, 3);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
	}
	
	@Test
	public void loginTestWithValidUsernameAndInvalidPassword () {
		try{
		String username = ExcelReader.getCellData(2, 1);
		String password = ExcelReader.getCellData(2, 2);
		
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		welcomePage.verifyLogin();
		
		ExcelReader.setCellData("Passed", 2, 3);
		}catch (Exception e) {
			try {
				ExcelReader.setCellData("Failed", 2, 3);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
	}
	
	@Test
	public void loginTestWithInvalidUsernameAndValidPassword () {
		try{
		String username = ExcelReader.getCellData(3, 1);
		String password = ExcelReader.getCellData(3, 2);
		
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		welcomePage.verifyLogin();
		
		ExcelReader.setCellData("Passed", 3, 3);
		}catch (Exception e) {
			try {
				ExcelReader.setCellData("Failed", 3, 3);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
	}
	@After
		public void executePostCondition () {
			abstractPage.tearDown();
		}
}
