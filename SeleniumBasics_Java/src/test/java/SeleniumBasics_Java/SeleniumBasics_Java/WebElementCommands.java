package SeleniumBasics_Java.SeleniumBasics_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebElementCommands {

	@Test
	public static void ElementsCommands() throws Exception {
		try
		{
			// Create a new instance of the Firefox driver
			WebDriver driver = new FirefoxDriver();

			// Launch the Online Store Website
			driver.get("https://www.facebook.com/");

			//Maximize the window
			driver.manage().window().maximize();

			// Print a Log In message to the screen
			System.out.println("Successfully opened the facebook website in Firefox browser");

			WebElement wElement_Txt_FirstName = driver.findElement(By.id("u_0_m"));
			//Clear Command
			wElement_Txt_FirstName.clear();
			//getAttribute Command
			String sAttributeValue = wElement_Txt_FirstName.getAttribute("id");
			System.out.println("The Attribute Value is "+ sAttributeValue);
			//Or can be written as
			//driver.findElement(By.id("u_0_m")).clear();

			//IsDisplayed Command
			boolean bStatus = wElement_Txt_FirstName.isDisplayed();
			//Or can be written as
			//boolean bStaus = driver.findElement(By.id("UserName")).isDisplayed();
			System.out.println(bStatus);
			//SendKeys Command			
			wElement_Txt_FirstName.sendKeys("Matryxsoft");
			//Or can be written as
			//driver.findElement(By.id("UserName")).sendKeys("Matryxsoft");


			//**********************************************************************************
			/*WebElement wElement_Txt_SurName = driver.findElement(By.xpath("//input[@id='u_0_o']"));
			boolean bwElement_Txt_SurName = wElement_Txt_SurName.isEnabled();
			//Or can be written as
			//boolean bwElement_Txt_SurName = driver.findElement(By.xpath("//input[@id='u_0_o']")).isEnabled();
			System.out.println(bwElement_Txt_SurName);*/

			//Or can be used as
			WebElement wElement_Txt_SurName = driver.findElement(By.xpath("//input[@id='u_0_o']"));
			//IsEnabled Command
			boolean bwElement_Txt_SurName = wElement_Txt_SurName.isEnabled();
			// Check that if the Text field is enabled, if yes enter value
			if(bwElement_Txt_SurName){
				wElement_Txt_SurName.sendKeys("Tech LLP");
			}
			//**********************************************************************************

			WebElement wElement_Rbn_Gender = driver.findElement(By.id("u_0_7"));
			//Click Command
			wElement_Rbn_Gender.click();
			//IsSelected Command
			boolean bwElement_Rbn_Gender = wElement_Rbn_Gender.isSelected();
			System.out.println(bwElement_Rbn_Gender);
			//Or can be written as
			//boolean bbwElement_Rbn_Gender = driver.findElement(By.xpath("//input[@id='u_0_7' and @class='_8esa']")).isSelected();




			WebElement wElement_Lnk_DataPolicy = driver.findElement(By.xpath("//a[@id='privacy-link']"));
			//GetText Command
			String sLinkText = wElement_Lnk_DataPolicy.getText();
			System.out.println("The link text is "+ sLinkText);








			WebElement wElement_SignUpButton = driver.findElement(By.xpath("//button[@id='u_0_13']"));
			wElement_SignUpButton.click();
			//getTagName Command
			String sTagName = wElement_SignUpButton.getTagName();
			System.out.println("The TagName is "+sTagName);
			//Or can be written as
			//driver.findElement(By.xpath("//button[@id='u_0_13']")).click();
			//String tagName = ddriver.findElement(By.xpath("//button[@id='u_0_13']")).getTagName();

			//getSize Command
			Dimension dimensions = wElement_SignUpButton.getSize();
			System.out.println("Height :" + dimensions.height + " Width : "+ dimensions.width);

			//Get location of elements
			Point point = wElement_SignUpButton.getLocation();
			System.out.println("X cordinate : " + point.x + " Y cordinate: " + point.y);


			WebElement wElement_Btn_Login = driver.findElement(By.xpath("//input[@id='u_0_b']"));
			//Submit Command
			wElement_Btn_Login.submit();
			//Or can be written as
			driver.findElement(By.xpath("//input[@id='u_0_b']")).submit();

			// Wait for 5 Sec
			Thread.sleep(2000);

			// Close the driver
			//driver.quit();

		}

		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}


	}

}
