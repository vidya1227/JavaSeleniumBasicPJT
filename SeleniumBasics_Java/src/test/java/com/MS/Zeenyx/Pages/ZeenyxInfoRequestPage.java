package com.MS.Zeenyx.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ZeenyxInfoRequestPage {

	WebDriver driver;

	public ZeenyxInfoRequestPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	// Firstname text field
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement Txt_FirstName;

	// Lastname text field
	@FindBy(xpath = "//input[@id='LastName']")
	WebElement Txt_LastName;

	// Company name text field
	@FindBy(xpath = "//input[@id='CompanyName']")
	WebElement Txt_CompanyName;

	// Addrees1 text field
	@FindBy(xpath = "//input[@id='Address1']")
	WebElement Txt_Address1;

	// Addrees2 text field
	@FindBy(xpath = "//input[@id='Address2']")
	WebElement Txt_Address2;

	// City text field
	@FindBy(xpath = "//input[@id='City']")
	WebElement Txt_City;

	// Drop down select State
	@FindBy(xpath = "//select[@id='State']")
	WebElement Pop_State;

	// Zipcode text field
	@FindBy(xpath = "//input[@id='ZipCode']")
	WebElement Txt_ZipCode;

	// Phonenumber text field
	@FindBy(xpath = "//input[@id='PhoneNumber']")
	WebElement Txt_PhoneNumber;

	// Email text field
	@FindBy(xpath = "//input[@id='Email']")
	WebElement Txt_Email;

	// Confirm email text field
	@FindBy(xpath = "//input[@id='ConfirmEmail']")
	WebElement Txt_ConfirmEmail;

	// First time contact check box
	@FindBy(xpath = "//input[@id='FirstTimeContact']")
	WebElement Chk_FirstTimeContact;

	// Request type radio button
	@FindBy(xpath = "//label[text()='Information']")
	WebElement Rbn_RequestType;

	// Request Textfield
	@FindBy(xpath = "//textarea[@id='Request']")
	WebElement Txt_Request;

	// NewsLetterRegister Check box
	@FindBy(xpath = "//*[@id='MenuBar1']/li[5]/a")
	WebElement Chk_NewsLetterRegister;

	public void AddDetailsToInfoRequestPage() throws InterruptedException {
		// Firstname text field
		Txt_FirstName.sendKeys("First");

		// Lastname text field
		Txt_LastName.sendKeys("Second");

		// Company name text field
		Txt_CompanyName.sendKeys("company");

		// Addrees1 text field
		Txt_Address1.sendKeys("Kar");

		// Addrees2 text field
		Txt_Address2.sendKeys("Bng");

		// City text field
		Txt_City.sendKeys("DNgr");

		// Drop down select State
		Select DropdownSelect = new Select(Pop_State);

		DropdownSelect.selectByVisibleText("MA");

		// Zipcode text field
		Txt_ZipCode.sendKeys("56094");

		// Phonenumber text field
		Txt_PhoneNumber.sendKeys("(565) 463-5464");

		// Email text field
		Txt_Email.sendKeys("me@gmail.com");

		// Confirm email text field
		Txt_ConfirmEmail.sendKeys("me@gmail.com");

		// First time contact check box
		Chk_FirstTimeContact.click();

		// Request type radio button
		Rbn_RequestType.click();

		// Request Textfield
		Txt_Request.sendKeys("");

		// NewsLetterRegister Check box
		Chk_NewsLetterRegister.click();

		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		 //String sTxt_ZipCode, String sTxt_PhoneNumber, 
	}

}
