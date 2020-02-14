package SeleniumBasics_Java.SeleniumBasics_Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LocatorsInSelenium {
	@Test
	public static void LocatorsInSelenium_java() throws Exception {
		try {
			// Create a new instance of the Firefox driver
			WebDriver driver = new FirefoxDriver();

			// Launch the Online Store Website
			driver.get("http://www.Facebook.com/");

			// Maximize the window
			driver.manage().window().maximize();

			// Print a Log In message to the screen
			System.out.println("Successfully opened the Facebook website in Firefox browser");

			// By ID
			WebElement wElement_Txt_FirstName = driver.findElement(By.id("u_0_m"));
			wElement_Txt_FirstName.sendKeys("FirstName");

			// By Name
			WebElement wElement_Txt_SurName = driver.findElement(By.name("lastname"));
			wElement_Txt_SurName.sendKeys("SurName");

			// By Xpath
			WebElement wElement_Txt_EmailOrPhnNmbr = driver.findElement(By.xpath("//input[@id='u_0_r']"));
			wElement_Txt_EmailOrPhnNmbr.sendKeys("Email@gmail.com");

			// By Xpath
			WebElement wElement_Txt_ReEnterEmailOrPhnNmbr = driver.findElement(By.xpath("//input[@id='u_0_u']"));
			wElement_Txt_ReEnterEmailOrPhnNmbr.sendKeys("Email@gmail.com");

			// By Xpath
			WebElement wElement_Txt_Password = driver.findElement(By.xpath("//input[@id='u_0_w']"));
			wElement_Txt_Password.sendKeys("***********");

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

				lsRadioButtons.get(2).click();

			} else {

				// If the first radio button is not selected by default, the first will be
				// selected

				lsRadioButtons.get(0).click();

			}
			
			/*
			 * WebElement wElement_SignUpButton =
			 * driver.findElement(By.xpath("//button[@id='u_0_13']"));
			 * wElement_SignUpButton.click();
			 */

			// Wait for a Secs
			Thread.sleep(2000);

			// Close the driver
			driver.quit();
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
