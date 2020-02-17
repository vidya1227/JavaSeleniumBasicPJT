package com.MS.Zeenyx.Testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.MS.Zeenyx.Pages.BaseClass;
import com.MS.Zeenyx.Pages.WebcastSignupPage;
import com.MS.Zeenyx.Pages.ZeenyxMainPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class WebcastRegisterZeennyxTestcase extends BaseClass {

	
	
	@Test
	public void  WebcastRegister_ZeenyxTestcase() throws InterruptedException {
		//logger = report.createTest("Register for Webcast page Zeennyx - Testcase");

		// Step1(Navigate to Register for Webcast page)
		//logger.log(LogStatus.INFO,"Navigate to Register for Webcast page");
		ZeenyxMainPage oZeenyxMainPage = PageFactory.initElements(driver, ZeenyxMainPage.class);
		//logger.log(LogStatus.INFO,"Starting Application");
		oZeenyxMainPage.NavigateToRegisterForWebcast();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//logger.log(LogStatus.INFO,"Register for Webcast page opened successfully");

		// Step2(Adding details to Webcast page)
		WebcastSignupPage oWebcastSignupPage = PageFactory.initElements(driver, WebcastSignupPage.class);
		//logger.log(LogStatus.INFO,"Adding details to Webcast page");
		oWebcastSignupPage.AddDetailsToWebcastSignupPage();
		//logger.log(LogStatus.INFO,"Details are added to Webcast page");
		System.out.println("Details are added to Webcast page");

		System.out.println("Testcase by vidya");

	}

}
