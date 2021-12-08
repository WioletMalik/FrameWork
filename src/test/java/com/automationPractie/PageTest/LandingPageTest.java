package com.automationPractie.PageTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automationPractice.Pages.LandingPage;
import com.automationPractice.TestBase.TestBase;

public class LandingPageTest extends TestBase{

	LandingPage lp;
	
	@BeforeMethod
	public void intialise() {
		
		lp = new LandingPage();
	
	}
	
	@AfterMethod
	public void quit() {
		tearDown();
	}
}
