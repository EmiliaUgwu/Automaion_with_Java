package com.live.magento.test_area;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.live.magento.pages.AbstractPage;
import com.live.magento.pages.HomePage;
import com.live.magento.pages.MyAccountPage;
import com.live.magento.pages.SearchResultPage;
import com.live.magento.pages.WebAddressPage;
import com.live.magento.pages.WelcomePage;

public class MagentoSearchFeatureTest {

	
	private WebDriver driver;
	private AbstractPage abstractPage;
	private HomePage homePage;
	private MyAccountPage myAccountPage;
	private WelcomePage welcomePage;
	private SearchResultPage searchResultPage;
	private WebAddressPage webAddressPage;
	private String recievedUrlAddress;
	
	
//	String recievedUrlAddress = "http://www.live.guru99.com";
//	String processedAddress = webAddressPage.recievedUrlAddress(recievedUrlAddress );	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		abstractPage = new AbstractPage(driver);
		homePage = new HomePage(driver);
		myAccountPage = new MyAccountPage(driver);
		welcomePage = new WelcomePage(driver);
		searchResultPage = new SearchResultPage (driver) ;
		webAddressPage = new WebAddressPage (driver);
		webAddressPage.getUrlFormatter(recievedUrlAddress);
		
		
	}
	
}
