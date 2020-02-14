package SeleniumBasics_Java.SeleniumBasics_Java;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UserInputInjava {

	
	
	
	@Test
	public static void UserInput() throws Exception {
		try {
			System.out.println("Txt_FirstName: ");
			System.out.println("Txt_SurName: ");
			Scanner scan1 = new Scanner(System.in);
			String Txt_FirstName = scan1.nextLine();
			String Txt_SurName = scan1.nextLine();
			System.out.println(Txt_FirstName);
			System.out.println(Txt_SurName);

			// Create a new instance of the Firefox driver
			WebDriver driver = new FirefoxDriver();

			// Launch the Online Store Website
			driver.get("https://www.facebook.com/");

			// Maximize the window
			driver.manage().window().maximize();

			// Print a Log In message to the screen
			System.out.println("Successfully opened the facebook website in Firefox browser");

			WebElement wElement_Txt_FirstName = driver.findElement(By.id("u_0_m"));

			WebElement wElement_Txt_SurName = driver.findElement(By.name("lastname"));

			wElement_Txt_FirstName.sendKeys(Txt_FirstName);
			wElement_Txt_SurName.sendKeys(Txt_SurName);

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
