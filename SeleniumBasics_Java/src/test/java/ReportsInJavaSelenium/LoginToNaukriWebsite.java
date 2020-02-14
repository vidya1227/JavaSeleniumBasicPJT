/*package ReportsInJavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginToNaukriWebsite {
	
	WebDriver driver;
	
	ExtentReports report = null;
	ExtentTest logger=null;
	
	@BeforeMethod
	public void OnStart() {
		
		report = new ExtentReports("C:\\Users\\vidya\\Desktop\\Reports\\Naukri.html");
		
		logger.log(LogStatus.INFO, "Browser started");
		
			
		}
	
	
	
		
	@Test
	public void LoginToNaukri() throws Exception
	{
		
		//report = new ExtentReports("C:\\Users\\vidya\\Desktop\\Reports\\Naukri.html");
		
		//logger.log(LogStatus.INFO, "Browser started");
		
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();

		// Navigate to naukri website
		driver.get("https://www.naukri.com/");

		System.out.println("Naukri Website is displayed!");
		
		logger.log(LogStatus.INFO, "Application is up and running");
		
		// Maximize the window
		driver.manage().window().maximize();
		
		logger=report.startTest("LoginToNaukriWebsite");
		
		
		  driver.findElement(By.id("login_Layer")).click();
		  
		  System.out.println("Login Page shall be display");

		  logger.log(LogStatus.INFO, "Login page is displayed");
		  
          //Login to naukri website
          driver.findElement(By.name("email")).sendKeys("vidyaclk12@gmail.com");

          driver.findElement(By.name("PASSWORD")).sendKeys("vidya123");

          driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
          
          logger.log(LogStatus.INFO, "Login to naukri website is succes ");
          System.out.println("Naukri User home page is displayed");

          Thread.sleep(6000);		
	}
	
	
	@AfterMethod
	public void tearDown(ITestResult result) 
	{
		if (result.getStatus()==ITestResult.FAILURE)
		{
			String sScreenShot_Path = captureScreenshot.captureSnap(driver, "Snap");
			  logger.log(LogStatus.FAIL, "Login to naukri ", sScreenShot_Path);
		}
		
		
		report.endTest(logger);
		report.flush();
			
			
	}
}
*/