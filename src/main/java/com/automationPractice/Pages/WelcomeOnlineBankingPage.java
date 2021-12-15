package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.TestBase.TestBase;

public class WelcomeOnlineBankingPage extends TestBase {

	public WelcomeOnlineBankingPage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "input[type='text']")
	WebElement userName;

	@FindBy(css = "input[type='password']")
	WebElement password;

	@FindBy(css = "input[type='submit']")
	WebElement login;

	public AccountsOverviewPage submit(String username, String Password) {
		userName.sendKeys(username);
		password.sendKeys(Password);
		login.submit();
		return new AccountsOverviewPage();
	}

}
