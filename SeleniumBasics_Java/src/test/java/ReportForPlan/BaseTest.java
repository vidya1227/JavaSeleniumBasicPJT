package ReportForPlan;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest {
	
	
	//Global variables
		public ExtentHtmlReporter htmlReporter;
		public ExtentReports extent;
		public ExtentTest test;
	
	//**************Fetching data from config file and excel**********************************
		@BeforeSuite
		public void SetUpSuite()
		{
			
			Reporter.log("Setting up reports and test is getting ready", true);
						
			//**********To get report**********************************************************************************************
			htmlReporter=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/SuiteReport.html"));
			extent=new ExtentReports();
			extent.attachReporter(htmlReporter);
			
			Reporter.log("Setting done- Test can be started", true);
			
		}
		
		@AfterMethod
		public void getResult(ITestResult result)
		{
			if (result.getStatus()==ITestResult.FAILURE)
			{
				test.fail(MarkupHelper.createLabel(result.getName()+ " Test case FAILED ", ExtentColor.RED));
				test.fail(result.getThrowable());
			}
			else if(result.getStatus()==ITestResult.SUCCESS)
			{
				test.pass(MarkupHelper.createLabel(result.getName()+ " Test case PASSED ", ExtentColor.GREEN));
			}
			else
			{
				test.skip(MarkupHelper.createLabel(result.getName()+ " Test case SKIPPED ", ExtentColor.YELLOW));
				test.skip(result.getThrowable());
			}
			
		}
		
		@AfterSuite
		public void tearDown()
		{
			extent.flush();
		}
		
		

}
