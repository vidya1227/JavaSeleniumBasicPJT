package TestNGAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClassByTestNG {

	WebDriver driver;

	/*@BeforeTest
	public void beforetest() {
		driver = new FirefoxDriver();
	}

	@AfterTest
	public void aftertest() {
		driver.quit();

	}
*/

	@BeforeMethod
	public void beforemethod() {
		driver = new FirefoxDriver();
	}

	@AfterMethod
	public void aftermethod() {
		driver.quit();

	}
	
	/*@BeforeClass
	public void beforeclass() {
		driver = new FirefoxDriver();
	}

	@AfterClass
	public void afterclass() {
		driver.quit();

	}*/
	
	/*@BeforeSuite
	public void beforesuite() {
		driver = new FirefoxDriver();
	}

	@AfterSuite
	public void aftersuite() {
		driver.quit();

	}
	*/
}
