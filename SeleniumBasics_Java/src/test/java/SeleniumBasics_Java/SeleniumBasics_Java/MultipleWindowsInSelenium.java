package SeleniumBasics_Java.SeleniumBasics_Java;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWindowsInSelenium {
	
	@Test
	public static void Launch_FirefoxBrowser() throws Exception {
		try
		{
			// Create a new instance of the Firefox driver
			WebDriver driver = new FirefoxDriver();

			// Launch the Online Store Website
			driver.get("https://www.naukri.com/");
			
			driver.manage().window().maximize();	

			// Print a Log In message to the screen
			System.out.println("Successfully opened the Naukri website in Firefox browser");

			// Wait for 5 Sec
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//*[contains(@href,'naukri.com')]")).click();			
    		
	        String MainWindow=driver.getWindowHandle();		
	        		
	        // To handle all new opened window.				
	            Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);	                                                                                                           
	                    
				// Closing the Child Window.
	                        driver.close();		
	            }		
	        }		
	        // Switching to Parent window i.e Main Window.
	            driver.switchTo().window(MainWindow);		
			
			

			// Close the driver
			//driver.quit();
		}

		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}


	}

}
