package SeleniumBasics_Java.SeleniumBasics_Java.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ZeennyxInfoRequestTestcase {

	@Test
	public static void ZeennyxInfoRequestTestcase_JavaSele() throws Exception {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// Navigate to naukri website
		driver.get("https://www.zeenyx.com/");

		System.out.println("Zeenyx Website is displayed!");

		// Maximize the window
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
//Contact from menu item

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='MenuBar1']/li[5]/a"))).perform();

		Thread.sleep(3000);
		
//Info request menu item
			driver.findElement(By.linkText("Info Request")).click();
			
//Firstname text field
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Vidya");

//Lastname text field
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("D");

//Company name text field
		driver.findElement(By.xpath("//input[@id='CompanyName']")).sendKeys("Matryx");

//Addrees1 text field
		driver.findElement(By.xpath("//input[@id='Address1']")).sendKeys("Chk");

//Addrees2 text field
		driver.findElement(By.xpath("//input[@id='Address2']")).sendKeys("lgl");

//City text field
		driver.findElement(By.xpath("//input[@id='City']")).sendKeys("Banglore");

//Drop down select State
		Select DropdownSelect = new Select(driver.findElement(By.xpath("//select[@id='State']")));

		DropdownSelect.selectByVisibleText("MA");

//Zipcode text field
		driver.findElement(By.xpath("//input[@id='ZipCode']")).sendKeys("560094");

//Phonenumber text field
		driver.findElement(By.xpath("//input[@id='PhoneNumber']")).sendKeys("(213) 215-4515");

//Email text field
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vidyashri@matryxsoft.com");

//Confirm email text field
		driver.findElement(By.xpath("//input[@id='ConfirmEmail']")).sendKeys("vidyashri@matryxsoft.com");

//First time contact check box
		driver.findElement(By.xpath("//input[@id='FirstTimeContact']")).click();

//Request type radio button
		driver.findElement(By.xpath("//label[text()='Information']")).click();

//Request Textfield
		driver.findElement(By.xpath("//textarea[@id='Request']"))
				.sendKeys("Hi I want information about ascential automation tool");

//NewsLetterRegister Check box
		driver.findElement(By.xpath(" //input[@id='NewsLetterRegister']")).click();

		Thread.sleep(3000);
		
		System.out.println("Zeennyx InfoRequest Testcase is passed!!!!");

		//driver.quit();

	}
}
