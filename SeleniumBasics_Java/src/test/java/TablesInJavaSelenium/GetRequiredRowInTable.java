package TablesInJavaSelenium;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetRequiredRowInTable {

	@Test
	public static void GetRowInTable() throws Exception {
		try {
			System.out.println("Enter required row number to get that row values : ");
			Scanner scan1 = new Scanner(System.in);
			String sReqRowInTbl = scan1.nextLine();
			System.out.println(sReqRowInTbl);

			// Create a new instance of the Firefox driver
			WebDriver driver = new FirefoxDriver();

			// Launch the Online Store Website
			driver.get("https://en.wikipedia.org/wiki/EZTABLE");

			// Print a Log In message to the screen
			System.out.println("Successfully opened the wikipedia EZTABLE website in Firefox browser");

			// WebElement Tbl_EZTABLE
			// =driver.findElement(By.xpath("//table[@class='wikitable sortable
			// jquery-tablesorter']"));

			// Get Rows count
			List<WebElement> Table_AllRows = driver
					.findElements(By.xpath("//*[@id='mw-content-text']/div/table[4]/tbody/tr"));
			System.out.println("Total Rows count are " + Table_AllRows.size());

			// Get only required Rows values
			List<WebElement> RequiredRows = driver.findElements(
					By.xpath("//*[@id='mw-content-text']/div/table[4]/tbody/tr[" + sReqRowInTbl + "]/td"));
			for (WebElement element : RequiredRows) {
				String sRow = element.getText();
				System.out.print(sRow + " | ");
			}
			// Wait for 5 Sec
			Thread.sleep(2000);
			
			// Close the driver
			driver.quit();
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

//Give Row number which you want fetch from web table
