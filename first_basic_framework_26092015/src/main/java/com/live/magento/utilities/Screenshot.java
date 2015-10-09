package com.live.magento.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	private WebDriver driver;
	public Screenshot (WebDriver driver) {
		this.driver = driver;
	}
	
	public void takeShot (String methodName) {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String path1 = "//Users//emiliaugwu//Documents//Automation//workspace//";
//		String path2 = "eclipseWorkspace//Selenium//first_basic_framework_26092015//";
		String path = System.getProperty("user.dir");//path = path1 + path2
		String path3 = "src//main//resources//com//screenshots//";
		try{
			FileUtils.copyFile(screenshot, new File(path+ path3 +methodName+ ".jpeg"));//if u decide to use path1 and path2 the u remember to replace "path" with them 
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
	}
