package VerificationInJavaSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.Urls;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class Verify_LoginOfLinkedIn {
 
 
    public WebDriver driver = null;
    public String url = "https://www.lambdatest.com/";
    public static final String  username= "sadhvisingh24";
    public static final String auth_key = "auth key generated";
    public static final String URL = "@hub.lambdatest.com/wd/hub";
    boolean status = false;
 
 
    @Test
    public void login () {
        // TODO Auto-generated method stub
        try {
        	driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.linkedin.com/login");
 
            WebElement username = driver.findElement(By.id("username"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement login = driver.findElement(By.xpath("//button[text()='Sign in']"));
 
            username.sendKeys("linkedin username");
            password.sendKeys("fake password");
            login.click();
 
            String actualUrl = "https://www.linkedin.com/feed/";
            String expectedUrl = driver.getCurrentUrl();
 
            if (actualUrl.equalsIgnoreCase(expectedUrl)) {
                System.out.println("Test passed");
                status = true; //Lambda status will be reflected as passed
              } else {
                System.out.println("Test failed"); //Lambda status will be reflected as passed
 
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            tearDown();
        }
 
 
    }
 
 
 
    @BeforeClass
    public void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "72.0");
        capabilities.setCapability("platform", "win8"); // If this cap isn't specified, it will just get the any available one
        capabilities.setCapability("build", "TestNG_login_1");
        capabilities.setCapability("name", "TestNG_login_1");
        capabilities.setCapability("network", true); // To enable network logs
        capabilities.setCapability("visual", true); // To enable step by step screenshot
        capabilities.setCapability("video", true); // To enable video recording
        capabilities.setCapability("console", true); // To capture console logs
        try {
 
        	  driver.get("https://www.linkedin.com/login");
 
        } catch (Exception e) {
 
            System.out.println("Invalid grid URL" + e.getMessage());
        }
 
    }
    private void tearDown () {
        if (driver != null) {
            ((JavascriptExecutor) driver).executeScript("Status=" + status); //Lambda status will be reflected as either passed/ failed
 
            driver.quit();
 
            System.out.println("The setup process is completed");
 
        }
    }
}