package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automationPractice.TestBase.TestBase;

public class DashboardPage extends TestBase {

	public DashboardPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "h2.sec__title.font-size-30.text-white")
	WebElement welcomeMessage;
	

	public String getWelcomeText() {
		String welcomeNote = welcomeMessage.getText();
		return welcomeNote;
	}
}
