package AutomationHelpers;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;



public class ImageComparision_UsingShutteburg {
 
 WebDriver driver;

 @Test
 public void testImage() throws IOException, Exception {
	
	 driver = new ChromeDriver();

	// driver = new FirefoxDriver();
  driver.get("https://jar-download.com/download-han...");
  
  driver.manage().window().maximize();
  Thread.sleep(2000);
  File image=new File("./Images/Edited.png"); //You have to check dimensions of images and you have resize through paint as per actual image
  BufferedImage expectedImage=ImageIO.read(image);  
  String OldImagePath="./Images/ComparedImages/DifferedImage";
  
 boolean isImagesame=Shutterbug.shootPage(driver,ScrollStrategy.WHOLE_PAGE,500,true).withName("Actual").equalsWithDiff(expectedImage,OldImagePath,0.1);
  System.out.println("Difference found ?   "+isImagesame);
  
  
  driver.quit();
 }
 
 //its Working

}