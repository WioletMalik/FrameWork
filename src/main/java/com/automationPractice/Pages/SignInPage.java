package com.automationPractice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.TestBase.TestBase;

public class SignInPage extends TestBase {

	public SignInPage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(xpath = "//input[@class='form-control' and @placeholder='Email']")
	WebElement loginEmail;

	@FindBy(xpath = "//input[@type='password' and @placeholder='Password']")
	WebElement logoinPassword;

	@FindBy(css = "button[type='submit']")
	WebElement login;

	public void loginEmail() {
		loginEmail.sendKeys("wiolet@gmail.com");
	}

	public void logoinPassword() {
		logoinPassword.sendKeys("abc@123");
	}

	public void login() {
		login.submit();
	}

}
