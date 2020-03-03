package ReporterFiles;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class VerifyOutput {
	WebDriver driver;
	static String[] ReportSteps1 = { "StepNumber", "ActionsPerformed", "ExpectedResult", "StepStatus", "ActualResults",
			"DeskTopScreenShot", "DiffImage", "ActualImage", "BaselineImage", "ExecutedTime" };

	// To get current date and time to the snapshot
	public static String GetCurrentDateTime() {
		DateFormat CustomFormat = new SimpleDateFormat("MM_dd_yyyy_hh_mm_ss");

		Date CurrentDate = new Date();

		return CustomFormat.format(CurrentDate);
	}
	
	public static String CaptureScrrenshot() throws IOException
	{
		String ScreenshotPath=System.getProperty("user.dir")+"/Screenshots/Report"+ GetCurrentDateTime() + ".png";
	 try {
         Robot robot = new Robot();
     	
         Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
         BufferedImage bufferedImage = robot.createScreenCapture(rectangle);
         File file = new File(ScreenshotPath);
         boolean status = ImageIO.write(bufferedImage, "png", file);
         System.out.println("Screen Captured ? " + status + " File Path:- " + file.getAbsolutePath());

     } catch (AWTException ex) {
         System.err.println(ex);
     }
	 return ScreenshotPath;
	}
	
	/*//*************************Capture Snapshot Start**********************************************************
		public static String CaptureScrrenshot(WebDriver driver)
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String ScreenshotPath=System.getProperty("user.dir")+"/Screenshots/LoginPage_"+ GetCurrentDateTime() + ".png";
			
			try {
				
				FileHandler.copy(src,new File(ScreenshotPath));
				
				System.out.println("Screenshot captured");
				
			} catch (IOException e) {
				
				System.out.println("Unable to capture screenshot"+e.getMessage());
				
			}
			return ScreenshotPath;
		}*/
			
	public void Verify_Output(Object ExpectedOutput, Object ActualOutput, String SuccessMessage, String FailureMessage,
			Boolean bNotcontinue) throws Exception {
		bNotcontinue = true;
		char snewLineChar = 10;
		int castAscii = (int) snewLineChar;
		// snewLineChar = Char (10)// ascii value of new line character

		String sFolderPath1 = "./ReporterFiles/VerifyOutputReport.txt";

		FileWriter fw1 = new FileWriter(sFolderPath1);

		ReportSteps1[9] = GetCurrentDateTime();

		// Success Block
		if (ExpectedOutput == ActualOutput) {
			if (!SuccessMessage.isEmpty()) {
				System.out.println("SuccessMessage - " + SuccessMessage);
				fw1.write(GetCurrentDateTime() + "----> Pass - " + SuccessMessage + "\n");
				BufferedWriter bufferFileWriter  = new BufferedWriter(fw1);
		        fw1.append("");
		        fw1.close();

				ReportSteps1[3] = "Pass";
				if (ReportSteps1[4] != "") {
					ReportSteps1[4] = ReportSteps1[4] + castAscii + SuccessMessage;
				} else {
					ReportSteps1[4] = SuccessMessage;
				}
			}
		}
		// Failure Block
		else {
			fw1.write(GetCurrentDateTime() + "----> Fail - " + FailureMessage + "\n");
			BufferedWriter bufferFileWriter  = new BufferedWriter(fw1);
	        fw1.append("");
			fw1.close();
			
			ReportSteps1[5] = CaptureScrrenshot();
			ReportSteps1[3] = "Fail";
			if(ReportSteps1[4] != "")
			{
				ReportSteps1[4] = ReportSteps1[4] + castAscii + FailureMessage;
				
			}else {
				
				ReportSteps1[4] = FailureMessage;			
			}
			if (bNotcontinue)
			{
				System.out.println(FailureMessage);
				
			}
			
		}

		
		
		
	}
}
