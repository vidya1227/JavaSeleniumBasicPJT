package AutomationHelpers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
//import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class ImageCompareUsingAShotDependency {
    @Test
    public void ImageComparison() throws IOException, InterruptedException{
          //System.setProperty("webdriver.chrome.driver","write here path of chromedriver exe file");
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("marionette", false);
        //FirefoxProfile fp = new FirefoxProfile();
        WebDriver driver=new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS);

        driver.get("URL");
        driver.findElement(By.id("j_username")).sendKeys("userName");
        driver.findElement(By.id("j_password")).sendKeys("password");
        driver.findElement(By.name("Submit")).click();
        driver.navigate().to("URL2");

        WebElement webElement = driver.findElement(By.xpath(".//*[@id='OL_Icon_618_innerImage']"));

        System.out.println("value= "+webElement);


        BufferedImage expectedImage = ImageIO.read(new File("/home/neha/neha/screenshotsByCode/mm_20_red.png"));

        System.out.println("\n expectedImage= "+expectedImage );
        Thread.sleep(5000);

        Screenshot scrnshot = new AShot().takeScreenshot(driver, webElement);

        ImageIO.write(scrnshot.getImage(),"PNG", new File("/home/neha/neha/screenshotsByCode/image.png"));

        BufferedImage actualImage = scrnshot.getImage();

        ImageDiffer imgDiff = new ImageDiffer();

        ImageDiff diff = imgDiff.makeDiff(expectedImage,actualImage);

        System.out.println("finally");
        Assert.assertTrue(diff.equals(diff), "Images are Same");
    }

}
