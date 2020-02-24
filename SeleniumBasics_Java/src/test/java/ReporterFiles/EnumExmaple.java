package ReporterFiles;

   enum ReportSteps1
 {
	 	 StepNumber,
		 ActionsPerformed,
		 ExpectedResult,
		 StepStatus,
		 ActualResults,
		 DeskTopScreenShot,
		 DiffImage,
		 ActualImage,
		 BaselineImage,
		 ExecutedTime
		
 }

public class EnumExmaple {
	
	public static void main(String[] args) {
		
		//System.out.println(ReportSteps.StepNumber);
	}

	
	
	
}

/*TData = Record
Username : String;
UserID : Int ;
RowID : Int;
end;
users : array[1..10] of TData;

for(int i = 1; i < rowCount; i++){
TData.Username[i] = rs.GetString("Name");
TData.UserID[i] = rs.GetInt("UserID");
TData.RowID[i] = row;
*/