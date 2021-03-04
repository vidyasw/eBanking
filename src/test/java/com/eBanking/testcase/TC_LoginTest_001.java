package com.eBanking.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.Reporter;
import com.eBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException 
	{
	//driver.get(baseURL);
	//logger.info("URL is opened");
    Reporter.log("Hi i am from TC_LoginTest_001");
	LoginPage lp = new LoginPage(driver);
	lp.setUserName(username);
	logger.info("Entered username");
		
	lp.setPassword(password);
	logger.info("Entered password");
		
	lp.clickSubmit();
		
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
		logger.info("Login test passed");
	}
	else
	{
		captureScreen(driver,"loginTest");
		Assert.assertTrue(false);
		logger.info("Login test failed");
	}
}


}
