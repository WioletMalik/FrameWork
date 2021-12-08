package com.automationPractice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automationPractice.TestBase.TestBase;

public class LandingPage extends TestBase {

	public LandingPage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(xpath = "//input[@name='first_name']")
	WebElement firstName;

	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastName;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement phone;

	@FindBy(xpath = "//input[@name='email']")
	WebElement email;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(id = "account_type")
	WebElement account_type;

	@FindBy(css = "button[type='submit']")
	WebElement signUp;

	public void firstName() {

		firstName.sendKeys("Wiolet");
	}

	public void lastName() {

		lastName.sendKeys("Ginotra");
	}

	public void phone() {

		phone.sendKeys("5674563738");
	}

	public void email() {

		email.sendKeys("wiolet@gmail.com");
	}

	public void password() {

		password.sendKeys("abc@123");
	}

	public void dropDown() {

		Select select = new Select(account_type);
		select.selectByIndex(0);
	}

	public void signUp() {

		signUp.submit();

	}
}
