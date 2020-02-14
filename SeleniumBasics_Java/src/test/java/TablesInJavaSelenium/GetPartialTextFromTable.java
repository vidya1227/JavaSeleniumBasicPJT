package TablesInJavaSelenium;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetPartialTextFromTable {
	
	@Test
	public static void GetPartialText_FromTable() throws Exception {
		try {
			
			System.out.println("Enter required Partial value to get the Partial matches values from the table : ");
			Scanner scan1 = new Scanner(System.in);
			String sReqPertialValue = scan1.nextLine();
			System.out.println(sReqPertialValue);
			
			// Create a new instance of the Firefox driver
			WebDriver driver = new FirefoxDriver();

			// Launch the Online Store Website
			driver.get("https://en.wikipedia.org/wiki/EZTABLE");

			// Print a Log In message to the screen
			System.out.println("Successfully opened the wikipedia EZTABLE website in Firefox browser \n");

			System.out.println("The Partial matched table values are ------------------------------------------------------------------------\n");
			
			
			 //Get all partial matches Values or text from table
			List<WebElement> FetchPartialMatch = driver.findElements(By.partialLinkText(sReqPertialValue));
			for (WebElement element : FetchPartialMatch) {
				String sFetchPartialMatch= element.getText();
				System.out.println(sFetchPartialMatch +"\n");
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

//Input value sReqPertialValue=EZTABLE
