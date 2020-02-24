package TablesInJavaSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetAllValuesFromTable {

	@Test
	public static void GetAllValues_FromTable() throws Exception {
		try {

			// Create a new instance of the Firefox driver
			WebDriver driver = new FirefoxDriver();

			// Launch the Online Store Website
			driver.get("https://en.wikipedia.org/wiki/EZTABLE");

			// Print a Log In message to the screen
			System.out.println("Successfully opened the wikipedia EZTABLE website in Firefox browser \n");

			System.out.println(
					"The table values are ------------------------------------------------------------\n");
			// Get all Values or text from table
			List<WebElement> AllValues = driver
					.findElements(By.xpath("//*[@id='mw-content-text']/div/table[4]/tbody/tr/td"));
			for (WebElement element : AllValues) {
				String sAllValues = element.getText();
				System.out.println(sAllValues + "\n");
			}

			// Wait for 5 Sec
			Thread.sleep(2000);

			// Close the driver
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
