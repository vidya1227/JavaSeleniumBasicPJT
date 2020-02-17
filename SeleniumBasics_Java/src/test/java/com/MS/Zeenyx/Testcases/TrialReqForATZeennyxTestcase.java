package com.MS.Zeenyx.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MS.Zeenyx.Pages.BaseClass;
import com.MS.Zeenyx.Pages.ThirtyDaysTrialRequestPage;
import com.MS.Zeenyx.Pages.ZeenyxMainPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class TrialReqForATZeennyxTestcase extends BaseClass {
	
	
	

	@Test
	public void TrialReqForAT_ZeennyxTestcase() throws InterruptedException 
	{
		//logger=report.createTest("30 Trial Re qFor AT Zeennyx - Testcase");
		
		// Step1(Navigate to Info request page)
		//logger.log(LogStatus.INFO,"Navigate to Info request page");	
		ZeenyxMainPage oZeenyxMainPage = PageFactory.initElements(driver, ZeenyxMainPage.class);
		//logger.log(LogStatus.INFO,"Starting Application");
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

}
