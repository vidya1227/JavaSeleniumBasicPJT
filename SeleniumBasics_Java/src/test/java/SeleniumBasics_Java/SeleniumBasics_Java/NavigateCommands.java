package SeleniumBasics_Java.SeleniumBasics_Java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NavigateCommands {

	@Test
	public static void NavigateCommnadsInJava() {

		try {


			// Create a new instance of the FireFox driver
			WebDriver driver = new FirefoxDriver();

			// Open ToolsQA web site
			String appUrl = "http://zeenyx.com/";
			driver.get(appUrl);

			// Click on FEATURES Menu item
			driver.findElement(By.xpath("//a[contains(text(),'FEATURES')]")).click();

			// Wait for 5 Sec
			Thread.sleep(2000);


			// Go back to Home Page
			driver.navigate().back();

			// Wait for 5 Sec
			Thread.sleep(2000);

			// Go forward to Registration page
			driver.navigate().forward();

			// Wait for 5 Sec
			Thread.sleep(2000);

			// Go back to Home page
			driver.navigate().to(appUrl);

			// Wait for 5 Sec
			Thread.sleep(2000);

			// Refresh browser
			driver.navigate().refresh();

			// Wait for 5 Sec
			Thread.sleep(2000);

			// Close browser
			driver.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
