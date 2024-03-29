package DataDrivenTestingInJavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InfoReqInZeenyxWebsite_DDTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();

		// Navigate to naukri website
		driver.get("https://www.zeenyx.com/");

		System.out.println("Zeenyx Website is displayed!");

		// Maximize the window
		driver.manage().window().maximize();

	}

	@Test(dataProvider = "InfoReqData")
	public void ZeennyxInfoRequestTestcase(String FirstName, String LastName) throws Exception {
		
		Thread.sleep(5000);

//Contact from menu item

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='MenuBar1']/li[5]/a"))).perform();

		Thread.sleep(3000);

//Info request menu item
		driver.findElement(By.linkText("Info Request")).click();

//Firstname text field
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(FirstName);

//Lastname text field
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(LastName);
	
		Thread.sleep(3000);
		System.out.println("Zeennyx InfoRequest Testcase is passed!!!!");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

	@DataProvider(name = "InfoReqData")
	public Object[][] passData() {
		Object[][] data = new Object[3][2];

		data[0][0] = "Vidya";
		data[0][1] = "D";

		data[1][0] = "Pavani";
		data[1][1] = "GK";

		data[2][0] = "Krutika";
		data[2][1] = "PS";

		return data;

	}
}
