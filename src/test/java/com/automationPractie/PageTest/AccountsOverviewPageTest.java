package com.automationPractie.PageTest;

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
		ap = wc.submit("Jitin", "abc@123");
		
	}

	@Test
	public void verifyAccountBalance() {
		String actualBalance = ap.getAccountBalance();
		AssertJUnit.assertTrue(actualBalance.contains("$515.50"));

	}

	@Test
	public void openNewAccount() {
		op = ap.openNewAccount();
		op.selectAccount();
		op.selectExistingAccount();
		op.openNewAccount();
		op.accountOverview();
		String newBalanceinNewAccount = op.balanceInNewAccount();
		AssertJUnit.assertEquals(newBalanceinNewAccount, "$100.00");
		
	}

	@AfterMethod
	public void quitDriver() {
		// tearDown();
	}
}
