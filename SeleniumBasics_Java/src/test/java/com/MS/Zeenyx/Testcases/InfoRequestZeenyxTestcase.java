package com.MS.Zeenyx.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.MS.Zeenyx.Pages.BaseClass;
import com.MS.Zeenyx.Pages.ZeenyxInfoRequestPage;
import com.MS.Zeenyx.Pages.ZeenyxMainPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class InfoRequestZeenyxTestcase extends BaseClass {
	
	
	
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
		oZeenyxInfoRequestPage.AddDetailsToInfoRequestPage();		
		//logger.log(LogStatus.INFO,"Details are added to Info request page");
		System.out.println("Details are added to Info request page");
				
		System.out.println("Testcase by vidya");

	}

}
