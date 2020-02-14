package TestNGAnnotations;

import org.testng.annotations.*;

public class TestNgExample {

	public class test {

		@BeforeMethod
		public void beforeMethod() {

			System.out.println("Before Method will execute before every test method\n");

		}

		@AfterMethod
		public void afterMethod() {

			System.out.println("After Method will execute after every test method\n ");

		}

		@BeforeClass
		public void beforeClass() {

			System.out.println("Before Class will always execute prior to Before Method and Test Method\n ");

		}

		@AfterClass
		public void afterClass() {

			System.out.println("After Class will always execute later to After Method and Test method\n");

		}

		@BeforeTest
		public void beforeTest() {

			System.out
					.println("Before Test will always execute prior to Before Class, ,Before Method and Test Method\n ");

		}

		@AfterTest
		public void afterTest() {

			System.out.println("After Test will always execute later to After Method, After Class\n ");

		}

		@BeforeSuite		
		public void beforeSuite() {

			System.out.println("Before Suite will always execute prior to all annotations or tests in the suite\n");
	
		}

		@AfterSuite
		public void afterSuite() {

			System.out.println("After suite will always execute at last when all the annotations or test in the suite have run\n.");

		}

		@Test
		public void testCase1() {

			System.out.println("This is my First Test Case 1\n");

		}

		@Test
		public void testCase2() {

			System.out.println("This is my Second Test Case 2\n");

		}

	}

}
