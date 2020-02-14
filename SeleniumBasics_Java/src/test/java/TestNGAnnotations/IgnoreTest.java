package TestNGAnnotations;

import org.testng.annotations.Test;

public class IgnoreTest {
	
	 @Test(enabled = false)
	 public void testPrintMessage() {
	      System.out.println("Hi");
	   }

	 
	 @Test(enabled = true)
	 public void testPrintMessage1() {
	      System.out.println("Hello");
	   }
}
