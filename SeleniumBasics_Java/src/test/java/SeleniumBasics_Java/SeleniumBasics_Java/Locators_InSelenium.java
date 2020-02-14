package SeleniumBasics_Java.SeleniumBasics_Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Locators_InSelenium {

	@Test
	public static void ID_Locators() {
		// Open browser
		WebDriver driver = new FirefoxDriver();
		// Open Application
		driver.get(
				"https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		// Locate the element using ID locator and enters test value "Software Testing
		// Material"
		driver.findElement(By.id("identifierId")).sendKeys("IdLocator");

		// Close the driver
		driver.quit();

	}

	@Test
	public static void Name_Locators() {
		// Open browser
		WebDriver driver = new FirefoxDriver();
		// Open Application
		driver.get(
				"https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		// Locate the element using ID locator and enters test value "Software Testing
		// Material"
		driver.findElement(By.name("identifier")).sendKeys("NameLocator");
		// Close the driver
		driver.quit();
	}

	@Test
	public static void ClassName_Locators() {
		// Open browser
		WebDriver driver = new FirefoxDriver();
		// Open Application
		driver.get("https://www.facebook.com/");
		driver.findElement(By.className("inputtext")).sendKeys("ClassNameLocator");
		// Locate the element using ID locator and enters test value "Software Testing
		// Material"
		// Close the driver
		driver.quit();
	}

	@Test
	public static void TagName_Locators() {
		// Open browser
		WebDriver driver = new FirefoxDriver();

		// Open Application
		driver.get("http://www.google.com");

		List<WebElement> list = driver.findElements(By.tagName("a"));

		System.out.println("Number of links: " + list.size());

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i).getText());
		}

		// Close the driver
		driver.quit();
	}

	@Test
	public static void LinkText_Locators() {
		// Open browser
		WebDriver driver = new FirefoxDriver();
		// Open Application
		driver.get("https://www.facebook.com/");

		// Locate the element using ID locator and enters test value "Software Testing
		// Material"
		driver.findElement(By.linkText("Create a Page")).click();
		System.out.println("LinkText_Locators is Success");
		// Close the driver
		driver.quit();
	}

	@Test
	public static void PartialLinkText_Locators() {
		// Open browser
		WebDriver driver = new FirefoxDriver();
		// Open Application
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Create")).click();
		System.out.println("PartialLinkText_Locators is Success");
		// Close the driver
		driver.quit();
	}

	@Test
	public static void CSSSelector_Locators() {
		// Open browser
		WebDriver driver = new FirefoxDriver();
		// Open Application
		driver.get("https://www.facebook.com/");
		// Here Tag = input and Id = u_r_b if (class meand use input.classvalue) 
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("CSSSelectorLocators");
		System.out.println("CSSSelector_Locators is Success");
		// Close the driver
		//driver.quit();
	}

	@Test
	public static void Xpath_Locators() {
		// Open browser
		WebDriver driver = new FirefoxDriver();
		// Open Application
		driver.get(
				"https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("XpathLocators");
		System.out.println("Xpath_Locators is Success");
		// Close the driver
		driver.quit();
	}

}
