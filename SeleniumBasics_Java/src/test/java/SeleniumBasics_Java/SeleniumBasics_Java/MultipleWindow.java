package SeleniumBasics_Java.SeleniumBasics_Java;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWindow {

	/*
	 * @Test public static void MultipleWindowInSel() throws InterruptedException {
	 * 
	 * WebDriver driver = new FirefoxDriver();
	 * driver.get("http://toolsqa.com/automation-practice-switch-windows/"); String
	 * parentWindowHandle = driver.getWindowHandle();
	 * System.out.println("Parent window's handle -> " + parentWindowHandle);
	 * WebElement clickElement = driver.findElement(By.id("button1"));
	 * 
	 * for(int i = 0; i < 4; i++) { clickElement.click(); Thread.sleep(3000); }
	 * 
	 * Set<String> allWindowHandles = driver.getWindowHandles();
	 * 
	 * for(String handle : allWindowHandles) {
	 * System.out.println("Window handle - > " + handle); }
	 * 
	 * }
	 */

	@Test
	public void testMultipleWindows() throws InterruptedException {

		// To open browser
		WebDriver driver = new FirefoxDriver();

		// To maximize browser
		driver.manage().window().maximize();

		// To open Naukri website with multiple windows
		driver.get("http://www.naukri.com/");

		// It will return the parent window name as a String
		String mainWindow = driver.getWindowHandle();

		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> set = driver.getWindowHandles();

		// Using Iterator to iterate with in windows
		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			String childWindow = itr.next();

			// Compare whether the main windows is not equal to child window. If not equal,
			// we will close.
			if (!mainWindow.equals(childWindow)) {

				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				driver.close();

			}
		}
		// This is to switch to the main window
		driver.switchTo().window(mainWindow);
	}

}
