package com.automationPractie.PageTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.Pages.AccountsOverviewPage;
import com.automationPractice.Pages.WelcomeOnlineBankingPage;
import com.automationPractice.Pages.loanRequestPage;
import com.automationPractice.TestBase.TestBase;

public class loanRequestPageTest extends TestBase {

	WelcomeOnlineBankingPage wc;
	AccountsOverviewPage ap;
	loanRequestPage lr;

	@BeforeMethod
	public void intialise() {
		setUp();
		wc = new WelcomeOnlineBankingPage();
		ap = wc.submit("Next", "abc@123");
		lr = ap.applyLoan();
	}

	@Test
	public void verifyInfo() {

		//lr.loanAmount("400", "100");
		//lr.selectAccount();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String loanApprovedBy = lr.getLoanProviderInfo();
		AssertJUnit.assertTrue(loanApprovedBy.contains("Wealth"));

		String statusOfLoan = lr.getloanStatus();
		AssertJUnit.assertEquals(statusOfLoan, "Approved");

		String newAccountNumber = lr.getNewAccountNumber();
		AssertJUnit.assertEquals(newAccountNumber, "25554");
	}

	@AfterMethod
	public void quitDriver() {
		//tearDown();
	}
}