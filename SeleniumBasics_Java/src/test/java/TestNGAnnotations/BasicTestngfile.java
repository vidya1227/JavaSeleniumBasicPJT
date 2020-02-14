package TestNGAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class BasicTestngfile {
	
	 public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath = "D:\\geckodriver.exe";
	    public WebDriver driver ; 
	     
	    
	    @BeforeSuite
	     //@BeforeTest
	      public void launchBrowser() {
	          System.out.println("launching firefox browser"); 
	          System.setProperty("webdriver.gecko.driver", driverPath);
	          driver = new FirefoxDriver();
	          driver.get(baseUrl);
	      }
	      @Test
	      public void verifyHomepageTitle1() {
	          String expectedTitle = "Welcome: Mercury Tours";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	          System.out.println("Success test1");
	     }
	      
	      @Test
	      public void verifyHomepageTitle() {
	          String expectedTitle = "Welcome: Mercury Tours";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	          System.out.println("Success test");
	     }
	      
	      @AfterSuite
	      //@AfterTest
	      public void terminateBrowser(){
	          driver.close();
	      }

}
