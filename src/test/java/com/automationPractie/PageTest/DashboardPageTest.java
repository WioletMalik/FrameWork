package com.automationPractie.PageTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.Pages.DashboardPage;
import com.automationPractice.Pages.SignInPage;
import com.automationPractice.TestBase.TestBase;

public class DashboardPageTest extends TestBase {

	SignInPage sp;
	DashboardPage dp;

	@BeforeMethod
	public void setup() {
		sp = new SignInPage();
		dp = sp.login();

	}

	@Test
	public void verifyWelcomeNote() {
		String welcomeText = dp.getWelcomeText();
		AssertJUnit.assertTrue(welcomeText.contains("wiolet"));
	}

	@AfterMethod
	public void quit() {
		dp.tearDown();
	}
}
