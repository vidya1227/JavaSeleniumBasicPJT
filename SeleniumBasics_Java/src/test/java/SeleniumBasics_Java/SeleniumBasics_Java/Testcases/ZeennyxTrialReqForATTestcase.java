package SeleniumBasics_Java.SeleniumBasics_Java.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ZeennyxTrialReqForATTestcase {
	
	@Test
	public static void ZeennyxTrialReqForATTestcase_JavaSele() throws Exception {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// Navigate to naukri website
		driver.get("https://www.zeenyx.com/");

		System.out.println("Zeenyx Website is displayed!");

		// Maximize the window
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		 //Company from menu item
        
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'COMPANY')]"))).perform();

        Thread.sleep(3000);
        
        //News and Interest menu item
        driver.findElement(By.linkText("News and Interest")).click();

        Thread.sleep(3000);
        
        //30 days trial link box
        driver.findElement(By.xpath("//div[@id='apDiv16']//a//img")).click();

       
        //Firstname text field
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Vidya");

        //Lastname text field
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("D");

        //Company name text field
        driver.findElement(By.xpath("//input[@id='CompanyName']")).sendKeys("Matryx");

        //Email text field
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vidyashri@matryxsoft.com");

        //Confirm email text field
        driver.findElement(By.xpath("//input[@id='ConfirmEmail']")).sendKeys("vidyashri@matryxsoft.com");

        //Request Textfield
        driver.findElement(By.xpath("//textarea[@id='Request']")).sendKeys("Hi I want information about ascential automation tool");


        //NewsLetterRegister Check box
        driver.findElement(By.xpath(" //input[@id='NewsLetterRegister']")).click();

        System.out.println("Zeennyx TrialReqForAT Testcase is passed!!!!");
       
		Thread.sleep(3000);

		//driver.quit();

	}

}
