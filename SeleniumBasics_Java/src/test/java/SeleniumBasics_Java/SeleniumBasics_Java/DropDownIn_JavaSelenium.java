package SeleniumBasics_Java.SeleniumBasics_Java;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownIn_JavaSelenium {

	@Test
	public static void DropDownHandle() throws Exception {
		try {
			
			System.out.println("Pop_Day: ");
			
			Scanner scan1 = new Scanner(System.in);
			String Pop_Day = scan1.nextLine();
			
			// Create a new instance of the Firefox driver
			WebDriver driver = new FirefoxDriver();

			// Launch the Online Store Website
			driver.get("https://www.facebook.com/");

			// Print a Log In message to the screen
			System.out.println("Successfully opened the facebook website in Firefox browser");

			// Find the DropDown of Day
			List<WebElement> lsDayDropdown = driver.findElements(By.xpath("//select[@id='day']//option"));

			System.out.println(lsDayDropdown.size());
			for(WebElement item:lsDayDropdown) 
	        { 
	        
	             System.out.println("Dropdown values are "+ item.getText());
	             System.out.println(item.getSize());
	             
	             if (item.getText()==Pop_Day)
	             {
	            	 Select dropdown = new Select(item);
	            	 dropdown.selectByVisibleText(item.getText());
	            	 
	             }
	             
	             
	           }		
			
			//Select dropdown = new Select(lsDayDropdown);
			
			 /*List<WebElement> Options = dropdown.getOptions(); 
			 for(WebElement item:Options) 
		        { 
		        
		             System.out.println("Dropdown values are "+ item.getText());
		             
		           }
					 
			dropdown.selectByVisibleText("12");*/

			/*// Find the DropDown of Day
			WebElement lsMonthDropdown = driver.findElement(By.xpath("//select[@id='month']"));

			System.out.println(lsDayDropdown);

			dropdown = new Select(lsMonthDropdown);
			dropdown.selectByVisibleText("Sept");

			// Find the DropDown of Day
			WebElement lsYearDropdown = driver.findElement(By.xpath("//select[@id='year']"));

			System.out.println(lsDayDropdown);

			dropdown = new Select(lsYearDropdown);
			dropdown.selectByVisibleText("1993");*/

			// Wait for 5 Sec
			Thread.sleep(2000);

			// Close the driver
			// driver.quit();
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
