package CrossBrowserTestingInJavaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTest {
	WebDriver driver = null;
	String sProjectPath = System.getProperty("user.dir");

	@Parameters("sbrowserName")
	@BeforeTest
	public void setUp(String sbrowserName) {
		System.out.println("Browser name is : " + sbrowserName);
		System.out.println("Thread Id is : " + Thread.currentThread().getId());
		if (sbrowserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (sbrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webDriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (sbrowserName.equalsIgnoreCase("ie")) {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
			caps.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "");
			System.setProperty("webDriver.ie.driver", "./Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	}

	@Test
	public void Test1() throws Exception {
		driver.get("https://www.google.com/");
		System.out.println("Successfully opened the google website ");
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("Test Completed Successfully");
	}
}
