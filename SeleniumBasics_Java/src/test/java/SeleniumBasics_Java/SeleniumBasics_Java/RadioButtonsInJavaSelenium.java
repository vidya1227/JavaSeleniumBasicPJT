package SeleniumBasics_Java.SeleniumBasics_Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RadioButtonsInJavaSelenium {

	@Test
	public static void RadioButtons_InJavaSelenium() throws Exception {
		try {
			// Create a new instance of the Firefox driver
			WebDriver driver = new FirefoxDriver();

			// Launch the Online Store Website
			driver.get("http://www.Facebook.com/");

			// Maximize the window
			driver.manage().window().maximize();

			// Print a Log In message to the screen
			System.out.println("Successfully opened the Facebook website in Firefox browser");

			/*
			 * WebElement wElement_Rbn_MaleGender = driver.findElement(By.id("u_0_7"));
			 * wElement_Rbn_MaleGender.click();
			 */

			// Find the checkbox or radio button element by Name
			List<WebElement> lsRadioButtons = driver.findElements(By.xpath("//*[@class='_5k_2 _5dba']"));

			// Create a boolean variable which will hold the value (True/False)
			boolean bValue = false;

			// This statement will return True, in case of first Radio button is selected
			bValue = lsRadioButtons.get(0).isSelected();

			// This will check that if the bValue is True means if the first radio button is
			// selected
			if (bValue = true) {

				// This will select Second radio button, if the first radio button is selected
				// by default
				lsRadioButtons.get(1).click();

			} else {

				// If the first radio button is not selected by default, the first will be
				// selected
				lsRadioButtons.get(0).click();

			}

			// Wait for a Secs
			Thread.sleep(2000);

			// Close the driver
			// driver.quit();
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
