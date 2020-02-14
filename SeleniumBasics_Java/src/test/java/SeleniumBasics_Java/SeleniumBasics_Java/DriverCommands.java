package SeleniumBasics_Java.SeleniumBasics_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DriverCommands {
	@Test
	public static void Launch_FirefoxBrowser() throws Exception {
		try
		{
			// Create a new instance of the Firefox driver
			WebDriver driver = new FirefoxDriver();


			// Launch the Online Store Website
			//driver.get("http://www.zeenyx.com");
			//Or can be written as 

			String sURL = "http://www.zeenyx.com/";
			driver.get(sURL);

			//Maximize the window
			driver.manage().window().maximize();

			//driver.getTitle();
			//Or can be used as
			String sTitle = driver.getTitle();
			
			// Storing Title length in the Int variable 
			 int iTitleLength = sTitle.length(); 
			System.out.println(" The title of the Website is "+ sTitle ); 
			System.out.println("Length of the title is : "+ iTitleLength); 


			//driver.getCurrentUrl();
			//Or can be written as
			String sCurrentUrl = driver.getCurrentUrl();
			System.out.println(" The Current Url is "+ sCurrentUrl ); 


			driver.getPageSource();
			//Or can be written as 
			String sPageSource = driver.getPageSource(); 
			//System.out.println(" The Page Source is "+ sPageSource );
			
			// Storing Page Source length in Int variable 
			 int iPageSourceLength = sPageSource.length(); 
			 
			 // Printing length of the Page Source on console 
			 System.out.println("Total length of the Pgae Source is : " + iPageSourceLength); 


			// Print a Log In message to the screen
			System.out.println("Successfully opened the Zeenyx website in Firefox browser");

			// Storing URL in String variable 
			String sActualUrl = sCurrentUrl;

			if (sActualUrl.equals(sURL)){ 
				System.out.println("Verification Successful - The correct Url is opened.");
			}
			else {
				System.out.println("Verification Failed - An incorrect Url is opened."); 

				//In case of Fail, you like to print the actual and expected URL for the record purpose 
				System.out.println("Actual URL is : " + sActualUrl); 
				System.out.println("Expected URL is : " + sURL);
			}



			// Wait for 5 Sec
			Thread.sleep(2000);

			//This method Close only the current window the WebDriver is currently controlling.
			driver.close();

			// Close the driver -This method Closes all windows opened by the WebDriver
			driver.quit();
		}

		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}


	}

}
