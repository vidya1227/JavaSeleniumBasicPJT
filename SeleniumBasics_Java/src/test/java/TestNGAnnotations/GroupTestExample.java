package TestNGAnnotations;

import org.testng.annotations.Test;

public class GroupTestExample {

	@Test(groups = { "functest", "checkintest" })
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		}

	@Test(groups = { "checkintest" })
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
	}

	@Test(groups = { "functest" })
	public void testingExitMessage() {
		System.out.println("Inside testExitMessage()");
	}
	
}