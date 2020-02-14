package DataDrivenTestingInJavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataDrivenTestingInJavaSelenium.ExcelDataProviderForDDT;

public class ExcelDDT_InfoReqZeenyxTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();

		// Navigate to naukri website
		driver.get("https://www.zeenyx.com/");

		System.out.println("Zeenyx Website is displayed!");

		// Maximize the window
		driver.manage().window().maximize();
		
		Thread.sleep(4000);


	}

	@DataProvider(name = "ReadData")
	public Object[][] GetDetails() {
		Object data[][] = null;
		try {
			data = ExcelDataProviderForDDT.ReadData("Sheet1");
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	@Test(dataProvider = "ReadData")
	public void InfoRequest_ZeenyxTestcase(String sTxt_FirstName, String sTxt_LastName, String sTxt_CompanyName,
			String sTxt_Address1, String sTxt_Address2, String sTxt_City, String sPop_State, String Txt_Zipcode,
			String Txt_PhoneNumber, String sTxt_Email, String sTxt_ConfirmEmail, String sTxt_Request)
			throws InterruptedException {

		Thread.sleep(4000);

//Contact from menu item

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='MenuBar1']/li[5]/a"))).perform();

		Thread.sleep(3000);

//Info request menu item
		driver.findElement(By.linkText("Info Request")).click();

//Firstname text field
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(sTxt_FirstName);

//Lastname text field
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(sTxt_LastName);

//Company name text field
		driver.findElement(By.xpath("//input[@id='CompanyName']")).sendKeys(sTxt_CompanyName);

//Addrees1 text field
		driver.findElement(By.xpath("//input[@id='Address1']")).sendKeys(sTxt_Address1);

//Addrees2 text field
		driver.findElement(By.xpath("//input[@id='Address2']")).sendKeys(sTxt_Address2);

//City text field
		driver.findElement(By.xpath("//input[@id='City']")).sendKeys(sTxt_City);

//Drop down select State
		Select DropdownSelect = new Select(driver.findElement(By.xpath("//select[@id='State']")));
		DropdownSelect.selectByVisibleText(sPop_State);

//Zipcode text field
		driver.findElement(By.xpath("//input[@id='ZipCode']")).sendKeys(Txt_Zipcode);

//Phonenumber text field
		driver.findElement(By.xpath("//input[@id='PhoneNumber']")).sendKeys(Txt_PhoneNumber);

//Email text field
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(sTxt_Email);

//Confirm email text field
		driver.findElement(By.xpath("//input[@id='ConfirmEmail']")).sendKeys(sTxt_ConfirmEmail);

//First time contact check box
		driver.findElement(By.xpath("//input[@id='FirstTimeContact']")).click();

//Request type radio button
		driver.findElement(By.xpath("//label[text()='Information']")).click();

//Request Textfield
		driver.findElement(By.xpath("//textarea[@id='Request']")).sendKeys(sTxt_Request);

//NewsLetterRegister Check box
		driver.findElement(By.xpath(" //input[@id='NewsLetterRegister']")).click();

		Thread.sleep(3000);

		System.out.println("Zeennyx InfoRequest Testcase is passed!!!!");

		
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();

	}

}
