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
import com.automationPractice.Pages.openAccountPage;
import com.automationPractice.TestBase.TestBase;

public class AccountsOverviewPageTest extends TestBase {

	WelcomeOnlineBankingPage wc;
	AccountsOverviewPage ap;
	openAccountPage op;

	@BeforeMethod
	public void initilise() {
		setUp();
		wc = new WelcomeOnlineBankingPage();
		ap = wc.submit("Next", "abc@123");

	}

	@Test
	public void verifyAccountBalance() {

		String actualBalance = ap.getAccountBalance();
		AssertJUnit.assertTrue(actualBalance.contains("$4900.00"));

		String verifyNewAccount = ap.verifyNewAccount();
		Assert.assertEquals(verifyNewAccount, "22224");
		
		String loanApprovedBy = ap.getLoanProviderInfo();
		AssertJUnit.assertTrue(loanApprovedBy.contains("Wealth"));

		String statusOfLoan = ap.getloanStatus();
		AssertJUnit.assertEquals(statusOfLoan, "Approved");

		String newAccountNumber = ap.getNewAccountNumber();
		AssertJUnit.assertEquals(newAccountNumber, "25221");

	}

	@AfterMethod
	public void quitDriver() {
		// tearDown();
	}
}
