package SeleniumBasics_Java.SeleniumBasics_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class LaunchBrowser_FF_Chrome_IE {

	@Test
	public static void Launch_FirefoxBrowser() throws Exception {
		try
		{
			// Create a new instance of the Firefox driver
			WebDriver driver = new FirefoxDriver();

			// Launch the Online Store Website
			driver.get("http://www.zeenyx.com");

			// Print a Log In message to the screen
			System.out.println("Successfully opened the Zeenyx website in Firefox browser");

			// Wait for 5 Sec
			Thread.sleep(2000);

			// Close the driver
			driver.quit();
		}

		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}


	}

	@Test
	public static void Launch_ChromeBrowser() throws Exception {

		try
		{
			// Create a new instance of the Firefox driver
			WebDriver driver = new ChromeDriver();

			// Launch the Online Store Website
			driver.get("http://www.zeenyx.com");

			// Print a Log In message to the screen
			System.out.println("Successfully opened the Zeenyx website in Chrome browser");

			// Wait for 5 Sec
			Thread.sleep(2000);

			// Close the driver
			driver.quit();
		}

		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}


	}

	@Test
	public static void Launch_IEBrowser() throws Exception {

		/*// Create a new instance of the Firefox driver
		WebDriver driver = new InternetExplorerDriver();

		// Launch the Online Store Website
		driver.get("http://www.zeenyx.com");

		// Print a Log In message to the screen
		System.out.println("Successfully opened the Zeenyx website in IE browser");

		// Wait for 5 Sec
		Thread.sleep(2000);

		// Close the driver
		driver.quit();*/

		try
		{
			// Path to the folder where you have extracted the IEDriverServer executable
			//String service = "D:\\IEDriverServer.exe";

			//System.setProperty("webdriver.ie.driver", service);

			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");

			InternetExplorerDriver driver = new InternetExplorerDriver();

			driver.get("http://Zeenyx.com");

			driver.quit();
		}

		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
