package com.automationPractie.PageTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.Pages.AccountsOverviewPage;
import com.automationPractice.Pages.WelcomeOnlineBankingPage;
import com.automationPractice.Pages.openAccountPage;
import com.automationPractice.TestBase.TestBase;

public class openAccountPageTest extends TestBase {

	WelcomeOnlineBankingPage wc;
	AccountsOverviewPage ap;
	openAccountPage op;

	@BeforeMethod
	public void initilise() {
		setUp();
		wc = new WelcomeOnlineBankingPage();
		ap = wc.submit("Next", "abc@123");
		// op = ap.openNewAccount();
	}

	@Test
	public void openNewAccount() {

		// op = ap.openNewAccount();
		// op.selectAccount();
		// op.selectExistingAccount();
		// op.getNewAccountNumber();
		// op.accountOverview();
		String verifyNewAccount = op.verifyNewAccount();
		Assert.assertEquals(verifyNewAccount, "22224");
		// String newBalanceinNewAccount = op.balanceInNewAccount();
		// Assert.assertTrue(newBalanceinNewAccount.contains("100.00"));

	}

}
