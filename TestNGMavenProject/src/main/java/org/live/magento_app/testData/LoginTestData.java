package org.live.magento_app.testData;

import org.testng.annotations.DataProvider;

public class LoginTestData {
	
	
	@DataProvider(name = "loginData")
	   public static Object[][] dataForMagentoLogin(){
	    return new Object[][]{
	     {"234dotus@gmail.com", "password123", "Donald Jonathan"},
	     {"234dotusfdg@gmail.com", "password123", "Invalid login or password"},
	     {"234dotusfdg@gmail.com", "password123", "Invalid login or password"},
	     {"234dotusfdg@gmail.com", "password123", "Invalid login or password"}
	     
	    };
	    
	    } 

}
