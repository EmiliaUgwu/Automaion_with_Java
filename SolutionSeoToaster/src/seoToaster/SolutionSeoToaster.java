package seoToaster;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SolutionSeoToaster {
	
private WebDriver driver;
private String webname = "http://free-ecommerce-solution.seotoaster.com";
private String xpathForSignIn = "//*[@id='container']/footer/div[1]/ul/li[1]/a/span";
private String validUsername = "demo@seotoaster.com";
private String invalidUsername = "demo1@seotoaster.com";
private String validPassword = "demo";
private String invalidPassword = "demo1";

public SolutionSeoToaster (WebDriver driver){
this.driver = driver;
}
public void setUpBrowser(){
	driver.manage().window().maximize();
	driver.navigate().to(webname);	
}
public void enterValidUsernameValidPassword(){
	driver.findElement(By.xpath(xpathForSignIn)).click();
	driver.findElement(By.id("email")).sendKeys(validUsername);
	driver.findElement(By.id("password")).sendKeys(validPassword);
	driver.findElement(By.id("submit")).click();
}
public void enterValidUsernameInvalidPassword(){
	driver.findElement(By.xpath(xpathForSignIn)).click();
	driver.findElement(By.id("email")).sendKeys(validUsername);
	driver.findElement(By.id("password")).sendKeys(invalidPassword);
	driver.findElement(By.id("submit")).click();
}
public void enterInvalidUsernameValidPassword(){
	driver.findElement(By.xpath(xpathForSignIn)).click();
	driver.findElement(By.id("email")).sendKeys(invalidUsername);
	driver.findElement(By.id("password")).sendKeys(validPassword);
	driver.findElement(By.id("submit")).click();
}
public void enterInvalidUsernameInvalidPassword(){
	driver.findElement(By.xpath(xpathForSignIn)).click();
	driver.findElement(By.id("email")).sendKeys(invalidUsername);
	driver.findElement(By.id("password")).sendKeys(invalidPassword);
	driver.findElement(By.id("submit")).click();
}
public void enterNoUsernameInvalidPassword(){
	driver.findElement(By.xpath(xpathForSignIn)).click();
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("password")).sendKeys(invalidPassword);
	driver.findElement(By.id("submit")).click();
}
public void enterNoUsernameNoPassword(){
	driver.findElement(By.xpath(xpathForSignIn)).click();
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("submit")).click();	
}
public void enterInvalidUsernameNoPassword(){
	driver.findElement(By.xpath(xpathForSignIn)).click();
	driver.findElement(By.id("email")).sendKeys(invalidUsername);
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("submit")).click();	
}
public void enterValidUsernameNoPassword (){
	driver.findElement(By.xpath(xpathForSignIn)).click();
	driver.findElement(By.id("email")).sendKeys(validUsername);
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("submit")).click();	
}
public void enterNoUsernameValidPassword (){
	driver.findElement(By.xpath(xpathForSignIn)).click();
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("password")).sendKeys("demo");
	driver.findElement(By.id("submit")).click();
}
public void tearDownBrowser(){
	driver.quit();
	driver = null;
}
}
