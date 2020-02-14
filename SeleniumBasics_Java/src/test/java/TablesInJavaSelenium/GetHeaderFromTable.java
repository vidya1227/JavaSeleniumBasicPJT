package TablesInJavaSelenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetHeaderFromTable {
	
	@Test
	public static void GetHeader_FromTable() throws Exception {
		try {
			
			// Create a new instance of the Firefox driver
			WebDriver driver = new FirefoxDriver();

			// Launch the Online Store Website
			driver.get("https://en.wikipedia.org/wiki/EZTABLE");

			// Print a Log In message to the screen
			System.out.println("Successfully opened the wikipedia EZTABLE website in Firefox browser");

			 //Get all header text from table
			List<WebElement> GetHeader = driver.findElements(By.xpath("//*[@id='mw-content-text']/div/table[4]/thead/tr/th"));
			for (WebElement element : GetHeader) {
				String sHeader= element.getText();
				System.out.println(sHeader);
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
