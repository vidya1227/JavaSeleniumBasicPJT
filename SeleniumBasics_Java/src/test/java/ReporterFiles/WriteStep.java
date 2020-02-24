package ReporterFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteStep {

	static String[] ReportSteps = { "StepNumber", "ActionsPerformed", "ExpectedResult", "StepStatus", "ActualResults",
			"DeskTopScreenShot", "DiffImage", "ActualImage", "BaselineImage", "ExecutedTime" };

	static int iErrorCount = 0;
	public static int reportstepCounter = 0;

	public static void Write_Step(String StepsPerformed, String ExpectedOutput) throws IOException {
		if (ReportSteps[0] != "") {
			reportstepCounter++;
		}

		ReportSteps[0] = Integer.toString(reportstepCounter);
		ReportSteps[1] = "";
		ReportSteps[2] = "";
		ReportSteps[3] = "";
		ReportSteps[4] = "";
		ReportSteps[5] = "";
		ReportSteps[6] = "";
		ReportSteps[7] = "";
		ReportSteps[8] = "";
		ReportSteps[9] = "";

		System.out.println("StepsPerformed - " + StepsPerformed);
		System.out.println("ExpectedOutput - " + ExpectedOutput);

		String sFolderPath = "./ReporterFiles/WriteStepReport.txt";

		FileWriter fw = new FileWriter(sFolderPath, true);
		File src = new File(sFolderPath);

		fw.write("----------------------------------------------------------------------"+"\n");
		fw.write(GetCurrentDateTime() + "----> Steps Performed - " + StepsPerformed+"\n");
		fw.write(GetCurrentDateTime() + "----> Expected output - " + ExpectedOutput+"\n");
		
	
		BufferedWriter bufferFileWriter  = new BufferedWriter(fw);
        fw.append("");
        
        fw.close();
	}

	// To get current date and time to the snapshot
	public static String GetCurrentDateTime() {
		DateFormat CustomFormat = new SimpleDateFormat("MM_dd_yyyy_hh_mm_ss");

		Date CurrentDate = new Date();

		return CustomFormat.format(CurrentDate);
	}

}
