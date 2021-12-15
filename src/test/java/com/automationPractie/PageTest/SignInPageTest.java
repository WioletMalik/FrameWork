package com.automationPractie.PageTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.Pages.SignInPage;
import com.automationPractice.TestBase.TestBase;

public class SignInPageTest extends TestBase {

	SignInPage sp;

	@BeforeMethod
	public void intialise() {
		setUp();
		sp = new SignInPage();
	}

	@Test
	public void enterEmail() {
		sp.loginEmail("jginotra82@gmail.com");
		sp.logoinPassword("abc@123");
		sp.login();
	}

	@AfterMethod
	public void quit() {
		tearDown();
	}
}
