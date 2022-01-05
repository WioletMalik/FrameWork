package com.automationPractie.PageTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.Pages.PracticeFormPage;
import com.automationPractice.TestBase.TestBase;

public class PracticeFormPageTest extends TestBase {

	PracticeFormPage pf;

	@BeforeMethod
	public void initilise() {
		setUp();
		pf = new PracticeFormPage();
	}

	@Test
	public void formFillUp() {
		pf.filltheForm("Wiolet", "Malik", "wiolet@gmail.com", "2342344545", "Maths", "Brampton", "NCR", "Delhi");
	}

	@Test
	public void validateWelcomeMessage() {
		String welcomeNote = pf.verifyMessageOnPage();
		Assert.assertEquals(welcomeNote, "Thanks for submitting the form");
	}

	public void quitDriver() {
		tearDown();
	}
}
