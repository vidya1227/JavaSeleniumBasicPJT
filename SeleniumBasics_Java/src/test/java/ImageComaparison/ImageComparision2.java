package ImageComaparison;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ImageComparision2 {

     public WebDriver driver;
     private String baseUrl;
     
   //To get current date and time to the snapshot
 	public static String GetCurrentDateTime()
 	{
 		DateFormat CustomFormat=new SimpleDateFormat("MM_dd_yyyy_hh_mm_ss");//////
 		
 		Date CurrentDate=new Date();
 		
 		return CustomFormat.format(CurrentDate);
 	}

     @BeforeSuite
     public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.co.in/";
        driver.navigate().to(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);      
     }

     @AfterSuite
     public void tearDown() throws Exception {
        driver.quit();    
     }

     @Test
     public void testImageComparison() throws IOException, InterruptedException {         
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Thread.sleep(3000);
        FileUtils.copyFile(screenshot, new File("./Screenshots/GoogleOutput.jpg"));

        File fileInput = new File("./Images/GoogleInput.jpg");
        File fileOutPut = new File("./Screenshots/GoogleOutput.jpg");

        BufferedImage bufferfileInput = ImageIO.read(fileInput);
        DataBuffer bufferfileInput1 = bufferfileInput.getData().getDataBuffer();
        int sizefileInput = bufferfileInput1.getSize();                     
        BufferedImage bufferfileOutPut = ImageIO.read(fileOutPut);
        DataBuffer datafileOutPut = bufferfileOutPut.getData().getDataBuffer();
        int sizefileOutPut = datafileOutPut.getSize();
        Boolean matchFlag = true;
        if(sizefileInput == sizefileOutPut) {                         
           for(int i=0; i<sizefileInput; i++) {
                 if(bufferfileInput1.getElem(i) != datafileOutPut.getElem(i)) {
                       matchFlag = false;
                       break;
                 }
            }
        }
        else {                           
           matchFlag = false;
        Assert.assertTrue(matchFlag, "Images are not same");    
     }
}
}
