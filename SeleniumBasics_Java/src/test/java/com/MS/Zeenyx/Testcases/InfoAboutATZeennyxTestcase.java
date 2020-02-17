package com.MS.Zeenyx.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.MS.Zeenyx.Pages.BaseClass;
import com.MS.Zeenyx.Pages.InfoAboutATPage;
import com.MS.Zeenyx.Pages.ZeenyxMainPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class InfoAboutATZeennyxTestcase extends BaseClass {
	
	

	@Test
	public void InfoAboutAT_ZeenyxTestcase() throws InterruptedException 
	{
		
		
		// Step1(Navigate to Info about AT page)
		//logger.log(LogStatus.INFO,"Navigating to Info about AT page");	
		ZeenyxMainPage oZeenyxMainPage = PageFactory.initElements(driver, ZeenyxMainPage.class);
				//logger.log(LogStatus.INFO, "Starting Application");
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
}
