package ReporterFiles;

import java.io.IOException;

import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void DemoTest1() throws IOException
	{
		
		WriteStep oWriteStep = new WriteStep();
		WriteStep.Write_Step("Print the Hello world text.", "Hello world Text shall be print.");
		System.out.println("Hello world");
		
	}

}
