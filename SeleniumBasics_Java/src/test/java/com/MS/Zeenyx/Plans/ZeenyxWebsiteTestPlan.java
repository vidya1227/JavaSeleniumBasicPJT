package com.MS.Zeenyx.Plans;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MS.Zeenyx.Pages.BaseClass;

import com.MS.Zeenyx.Pages.InfoAboutATPage;
import com.MS.Zeenyx.Pages.ThirtyDaysTrialRequestPage;
import com.MS.Zeenyx.Pages.WebcastSignupPage;
import com.MS.Zeenyx.Pages.ZeenyxInfoRequestPage;
import com.MS.Zeenyx.Pages.ZeenyxMainPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ZeenyxWebsiteTestPlan extends BaseClass {
			
	@Test
	public void InfoRequest_ZeenyxTestcase() throws InterruptedException 
	{
		//logger=report.createTest("Info Request about AT tool - Testcase");
		
		// Step1(Navigate to Info request page)
		//logger.log(LogStatus.INFO,"navigating to Info request page");	
		ZeenyxMainPage oZeenyxMainPage = PageFactory.initElements(driver, ZeenyxMainPage.class);
		//logger.log(LogStatus.INFO,"Starting Application");
		oZeenyxMainPage.NavigateToInfoRequestPage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//logger.log(LogStatus.INFO,"Info request page opened successfully");
		
		// Step2(Adding details to Info request page)
		ZeenyxInfoRequestPage oZeenyxInfoRequestPage =PageFactory.initElements(driver, ZeenyxInfoRequestPage.class);		
		//logger.log(LogStatus.INFO,"Adding details to info request page");	
		Thread.sleep(5000);
		oZeenyxInfoRequestPage.AddDetailsToInfoRequestPage();		
		//logger.log(LogStatus.INFO,"Details are added to Info request page");
		System.out.println("Details are added to Info request page");
				
		System.out.println("Testcase by vidya");

	}
	
	@Test
	public void InfoAboutAT_ZeenyxTestcase() throws InterruptedException 
	{
		
		
		// Step1(Navigate to Info about AT page)
		//logger.log(LogStatus.INFO,"Navigating to Info about AT page");	
		ZeenyxMainPage oZeenyxMainPage = PageFactory.initElements(driver, ZeenyxMainPage.class);
				//logger.log(LogStatus.INFO, "Starting Application");
		Thread.sleep(5000);
		oZeenyxMainPage.NavigateToInfoAboutATPage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//logger.log(LogStatus.INFO,"Info about AT page opened successfully");
		
		// Step2(Getting details contents about AT)
		InfoAboutATPage oInfoAboutATPage =PageFactory.initElements(driver, InfoAboutATPage.class);		
		//logger.log(LogStatus.INFO,"Getting content of AT info");		
		oInfoAboutATPage.GetInfoContentsOfAT();		
		//logger.log(LogStatus.INFO,"Contents of AT ptinted succesfully");
		System.out.println("Contents of AT ptinted succesfully");
				
		System.out.println("Testcase by vidya");

	}
	
	@Test
	public void TrialReqForAT_ZeennyxTestcase() throws InterruptedException 
	{
		//logger=report.createTest("30 Trial Re qFor AT Zeennyx - Testcase");
		
		// Step1(Navigate to Info request page)
		//logger.log(LogStatus.INFO,"Navigate to Info request page");	
		ZeenyxMainPage oZeenyxMainPage = PageFactory.initElements(driver, ZeenyxMainPage.class);
		//logger.log(LogStatus.INFO,"Starting Application");
		Thread.sleep(5000);
		oZeenyxMainPage.NavigateTo30DaysTrialDataPage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//logger.log(LogStatus.INFO,"30 days trial request page opened successfully");
		
		// Step2(Adding details to 30 days trial request page)
		ThirtyDaysTrialRequestPage oThirtyDaysTrialRequestPage =PageFactory.initElements(driver, ThirtyDaysTrialRequestPage.class);		
		//logger.log(LogStatus.INFO,"Adding details to 30 days trial request page");		
		oThirtyDaysTrialRequestPage.AddDetailsTo30DaysTrialRequestPage();		
		//logger.log(LogStatus.INFO,"Details are added to  30 days trial request page");
		System.out.println("Details are added to  30 days trial request page");
				
		System.out.println("Testcase by vidya");

	}
	
	@Test
	public void  WebcastRegister_ZeenyxTestcase() throws InterruptedException {
		//logger = report.createTest("Register for Webcast page Zeennyx - Testcase");

		// Step1(Navigate to Register for Webcast page)
		//logger.log(LogStatus.INFO,"Navigate to Register for Webcast page");
		ZeenyxMainPage oZeenyxMainPage = PageFactory.initElements(driver, ZeenyxMainPage.class);
		//logger.log(LogStatus.INFO,"Starting Application");
		Thread.sleep(5000);
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
