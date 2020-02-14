package ReportsInJavaSelenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class captureScreenshot {
	
	
	
	public static String captureSnap(WebDriver driver, String ScreenshotName)
	{
		
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			String sSnapPath="./Screenshots/"+ScreenshotName+".png";
			
			File destination=new File(sSnapPath);
			
			FileUtils.copyFile(src, destination);
			
			System.out.println("Screenshot taken");
					
			return sSnapPath;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return e.getMessage();
		}		
		
	}

}
