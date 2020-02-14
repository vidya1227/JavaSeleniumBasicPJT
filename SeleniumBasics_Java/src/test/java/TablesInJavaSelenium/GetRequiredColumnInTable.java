package TablesInJavaSelenium;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetRequiredColumnInTable {

	@Test
	public static void GetRequiredColumn_InTable() throws Exception {
		try {
			System.out.println("Enter required Column number to get that Column values : ");
			Scanner scan1 = new Scanner(System.in);
			String sReqColumnInTbl = scan1.nextLine();
			System.out.println(sReqColumnInTbl);

			// Create a new instance of the Firefox driver
			WebDriver driver = new FirefoxDriver();

			// Launch the Online Store Website
			driver.get("https://en.wikipedia.org/wiki/EZTABLE");

			// Print a Log In message to the screen
			System.out.println("Successfully opened the wikipedia EZTABLE website in Firefox browser");

			// WebElement Tbl_EZTABLE
			// =driver.findElement(By.xpath("//table[@class='wikitable sortable
			// jquery-tablesorter']"));

			// Get Column count
			List<WebElement> Table_AllColumns = driver.findElements(By.xpath("//*[@id='mw-content-text']/div/table[4]/tbody/tr[1]/td"));
			System.out.println("Total Column count are " + Table_AllColumns.size());

			// Get only required Column values
			List<WebElement> RequiredsColumn = driver.findElements(
					By.xpath("//*[@id='mw-content-text']/div/table[4]/tbody/tr/td[" + sReqColumnInTbl + "]"));
			for (WebElement element : RequiredsColumn) {
				String sColumn = element.getText();
				System.out.println(sColumn);
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
//Give column number which you want fetch from web table

