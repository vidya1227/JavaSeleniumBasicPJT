package SeleniumBasics_Java.SeleniumBasics_Java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckBoxesInJavaSelenium {

	@Test
	public static void CheckBoxes_InJavaSelenium() throws Exception {
		try {
			// Create a new instance of the Firefox driver
			WebDriver driver = new FirefoxDriver();

			// Launch the Online Store Website
			driver.get("http://www.ironspider.ca/forms/checkradio.htm");

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			// Maximize the window
			driver.manage().window().maximize();

			// Print a Log In message to the screen
			System.out.println("Successfully opened the seleniumeasy website in Firefox browser");

			
			
			List<WebElement> ListOfCheckBoxes = driver.findElements(By.name("color"));
			System.out.println("Number of check boxes present are: " + ListOfCheckBoxes);
			System.out.println("Number of check boxes present are: " + ListOfCheckBoxes.size());

			for (int i = 0; i < ListOfCheckBoxes.size(); i++) {
				if (ListOfCheckBoxes.get(i).getAttribute("value").equalsIgnoreCase("Yellow")) {
					ListOfCheckBoxes.get(i).click();
				}
			}

			// Wait for a Secs
			Thread.sleep(10000);

			// Close the driver
			driver.quit();
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
