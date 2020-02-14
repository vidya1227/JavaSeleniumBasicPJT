package SeleniumBasics_Java.SeleniumBasics_Java.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ZeennyxWebCastReqTestcase {

	@Test
	public static void ZeennyxWebCastReqTestcase_JavaSele() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver.exe");

		
		// Create a new instance of the Firefox driver
		WebDriver driver = new ChromeDriver();

		// Navigate to naukri website
		driver.get("https://www.zeenyx.com/");

		System.out.println("Zeenyx Website is displayed!");

		// Maximize the window
		driver.manage().window().maximize();

		Thread.sleep(5000);

		// Company from menu item
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'COMPANY')]"))).perform();

		Thread.sleep(5000);

		// Webcast menu item
		//driver.findElement(By.linkText("Webcast")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Webcast')]")).click();
		
		Thread.sleep(3000);
		
		// Register for the next webcast
		driver.findElement(By.xpath("//div[@id='apDiv12']//a//img")).click();

		// Firstname text field
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Vidya");

		// Lastname text field
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("D");

		// Company name text field
		driver.findElement(By.xpath("//input[@id='CompanyName']")).sendKeys("Matryx");

		// Email text field
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vidyashri@matryxsoft.com");

		// Confirm email text field
		driver.findElement(By.xpath("//input[@id='ConfirmEmail']")).sendKeys("vidyashri@matryxsoft.com");

		// Request Textfield
		driver.findElement(By.xpath("//textarea[@id='Request']")).sendKeys("Hi I want information about ascential automation tool");

		// NewsLetterRegister Check box
		driver.findElement(By.xpath(" //input[@id='NewsLetterRegister']")).click();

		Thread.sleep(3000);
		
		System.out.println("Zeennyx WebCastReq Testcase is passed!!!!");
		
		// driver.quit();

	}

}
