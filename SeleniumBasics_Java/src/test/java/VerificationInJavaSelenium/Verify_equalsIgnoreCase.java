package VerificationInJavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_equalsIgnoreCase {
	
	@Test
    public void login() {
        // TODO Auto-generated method stub
        
        //System.setProperty("webdriver.chrome.driver", "path of driver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login");
        
        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));
       WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));
        
        username.sendKeys("example@gmail.com");
        password.sendKeys("password");
        login.click();
        
        String expectedUrl="https://www.linkedin.com/login";
        
        String actualUrl= driver.getCurrentUrl();
        
        if(actualUrl.equalsIgnoreCase(actualUrl))
        {
        System.out.println("Test passed");
        }
        else
        {
        System.out.println("Test failed");
        }
       
        //driver.quit();
        
    }


}
