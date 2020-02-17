package com.MS.Zeenyx.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {
	
	
	public WebDriver driver;

	@BeforeMethod
	public void SetUp() {

		driver = new FirefoxDriver();
		driver.get("https://www.zeenyx.com/");
		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();

	}

	@AfterMethod
	public void TearDown() {
		driver.quit();

	}

}
