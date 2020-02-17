package ReportForPlan;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import junit.framework.Assert;

public class Testcase1 {//extends BaseTest {
	public ExtentReports extent;
	public ExtentTest test;
	
	
	@Test
	public void FunctionalityTest1()
	{
		//test = extent.createTest("FunctionalityTest1");
		Assert.assertTrue(1 > 0);
	}

	@Test
	public void FunctionalityTest2()
	{
		//test = extent.createTest("FunctionalityTest2");
		Assert.assertEquals("Vidya", "Vidya");
	}

	@Test
	public void FunctionalityTest3()
	{
		//test = extent.createTest("FunctionalityTest3");
		Assert.assertNotSame("Vidya", "Vidya");
	}
	
	
}
