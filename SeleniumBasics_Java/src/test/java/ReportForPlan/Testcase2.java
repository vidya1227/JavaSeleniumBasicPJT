package ReportForPlan;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Testcase2 extends BaseTest {
	
	@Test
	public void Functionality2Test1()
	{
		test = extent.createTest("Functionality2Test1");
		Assert.assertTrue(1 > 0);
	}

	@Test
	public void Functionality2Test2()
	{
		test = extent.createTest("Functionality2Test2");
		Assert.assertEquals("Vidya", "Vidya");
	}

	@Test
	public void Functionality2Test3()
	{
		test = extent.createTest("Functionality2Test3");
		Assert.assertNotSame("Vi", "Vidya");
	}
	

}
