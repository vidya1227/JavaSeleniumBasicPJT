package ReportForPlan;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Testcase1 extends BaseTest {
	
	@Test
	public void FunctionalityTest1()
	{
		test = extent.createTest("FunctionalityTest1");
		Assert.assertTrue(1 > 0);
	}

	@Test
	public void FunctionalityTest2()
	{
		test = extent.createTest("FunctionalityTest2");
		Assert.assertEquals("Vidya", "Vidya");
	}

	@Test
	public void FunctionalityTest3()
	{
		test = extent.createTest("FunctionalityTest3");
		Assert.assertNotSame("Vidya", "Vidya");
	}
	
	
}
