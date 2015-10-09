package seoToaster;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSeoToaster {
	WebDriver driver = new FirefoxDriver();
	SolutionSeoToaster logIn = new SolutionSeoToaster(driver);
	
	@Before
	public void setUp(){
	logIn.setUpBrowser();
	}
	@Test
	public void testValidLogin(){
	logIn.enterValidUsernameValidPassword();
	}
	@Test
	public void testInvalidLogin1(){
		logIn.enterValidUsernameInvalidPassword();
	}
	@Test
	public void testInvalidLogin2(){
	logIn.enterInvalidUsernameInvalidPassword();
	}
	@Test
	public void testInvalidLogin3(){
	logIn.enterInvalidUsernameNoPassword();
	}
	@Test
	public void testInvalidLogin4(){
	logIn.enterInvalidUsernameValidPassword();
	}
	@Test
	public void testInvalidLogin5(){
	logIn.enterNoUsernameInvalidPassword();
	}
	@Test
	public void testInvalidLogin6(){
	logIn.enterNoUsernameNoPassword();
	}
	@Test
	public void testInvalidLogin7(){
	logIn.enterNoUsernameValidPassword();
	}
	@Test
	public void testInvalidLogin8(){
	logIn.enterValidUsernameNoPassword();
	}
	@After
	public void shutDown(){
	logIn.tearDownBrowser();	
	}
	}




