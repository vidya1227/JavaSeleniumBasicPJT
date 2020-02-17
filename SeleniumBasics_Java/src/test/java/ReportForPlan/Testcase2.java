package ReportForPlan;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import junit.framework.Assert;

public class Testcase2 { //extends BaseTest {
	public ExtentReports extent;
	public ExtentTest test;
	
	@Test
	public void Functionality2Test1()
	{
		extent.assignProject("Functionality2Test1");
		
		Assert.assertTrue(1 > 0);
	}

	@Test
	public void Functionality2Test2()
	{
		
		Assert.assertEquals("Vidya", "Vidya");
	}

	@Test
	public void Functionality2Test3()
	{
		
		Assert.assertNotSame("Vi", "Vidya");
	}
	

}
