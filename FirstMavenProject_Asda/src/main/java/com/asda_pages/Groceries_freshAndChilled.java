package com.asda_pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Groceries_freshAndChilled extends AbstractPage{

	private WebDriver driver;

	public Groceries_freshAndChilled(WebDriver driver) {
		super (driver);
	
	}
	
	public void openFreshAndChilled(){
		boolean fresh = driver.findElement(By.xpath("//*[@id='primary-nav-items']/li[1]/a/span[1]")).isEnabled();
		System.out.println(fresh);
	}

	public void openFruitsVegAndFlowers(){
		driver.findElement(By.partialLinkText("Fruit, Vegetables & Flowers")).click();
	
		
	}
	public void openFruits(){
		driver.findElement(By.xpath("//*[@id='910000975210']/li[1]/a/span")).click();
	}
	
	
	public void openGrapesBerriesAndCherries(){
		driver.findElement(By.xpath("//*[@id='910000976066']/a/span")).click();
	}

	public void selectFruitOfYourChoice(){
		String email = "redbulltesters@gmail.com";
		String password = "tester123";
		
		driver.findElement(By.xpath("//*[@id='cartBground']/div[1]/a[1]")).click();
		driver.findElement(By.id("username")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("btn-signIn-accessible")).click();
	}
	
	public void clickOnCheckoutBotton(){
		driver.findElement(By.id("miniTrolley-Checkout")).click();
		
	}
	public void veryfyThePresenceOf(){
		boolean answer = driver.getPageSource().contains("Message");
		Assert.assertFalse(answer);
	}

}

