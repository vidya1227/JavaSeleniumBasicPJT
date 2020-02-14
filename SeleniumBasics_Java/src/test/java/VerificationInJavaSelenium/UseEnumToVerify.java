package VerificationInJavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UseEnumToVerify {
	
	public enum ElementStatus{
        VISIBLE,
        NOTVISIBLE,
        ENABLED,
        NOTENABLED,
        PRESENT,
        NOTPRESENT
    }
    public ElementStatus isElementVisible(WebDriver driver, By by,ElementStatus getStatus){
        try{
            if(getStatus.equals(ElementStatus.ENABLED)){
                if(driver.findElement(by).isEnabled())
                    return ElementStatus.ENABLED;
                return ElementStatus.NOTENABLED; 
            }
            if(getStatus.equals(ElementStatus.VISIBLE)){
                if(driver.findElement(by).isDisplayed())
                    return ElementStatus.VISIBLE;
                return ElementStatus.NOTVISIBLE;
            }
            return ElementStatus.PRESENT;
        }catch(org.openqa.selenium.NoSuchElementException nse){
            return ElementStatus.NOTPRESENT;
        }
    }

}
