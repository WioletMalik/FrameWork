package com.automationPractie.PageTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automationPractice.Pages.SignInPage;
import com.automationPractice.TestBase.TestBase;

public class SignInPageTest extends TestBase {

	SignInPage sp;

	@BeforeMethod
	public void intialise() {

		sp = new SignInPage();

	}

	@AfterMethod
	public void quit() {
		tearDown();
	}
}
