package ReporterFiles;



import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void DemoTest1() throws Exception
	{
		
		WriteStep oWriteStep = new WriteStep();
		VerifyOutput oVerifyOutput=new VerifyOutput();
		
		WriteStep.Write_Step("Print the Hello world text.", "Hello world Text shall be print.");
		WriteStep.Write_Step("Print the Hello world text *.", "Hello world Text shall be print *.");
		System.out.println("Hello world");
		oVerifyOutput.Verify_Output(true, 2==2, "test is passed", "test is failed",true);
		oVerifyOutput.Verify_Output(true, 2==4, "test is passed", "test is failed",true);
		oVerifyOutput.Verify_Output(true, 2==2, "test is passed", "test is failed",true);
	}
	
	@Test
	public void DemoTest2() throws Exception
	{
		
		WriteStep oWriteStep = new WriteStep();
		VerifyOutput oVerifyOutput=new VerifyOutput();
		
		WriteStep.Write_Step("Print the Hello world text.", "Hello world Text shall be print.");
		WriteStep.Write_Step("Print the Hello world text *.", "Hello world Text shall be print *.");
		System.out.println("Hello world");
		oVerifyOutput.Verify_Output(true, 2==2, "test is passed", "test is failed",true);
		oVerifyOutput.Verify_Output(true, 2==4, "test is passed", "test is failed",true);
		oVerifyOutput.Verify_Output(true, 2==2, "test is passed", "test is failed",true);
	}

}
