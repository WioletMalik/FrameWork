package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.TestBase.TestBase;

public class AccountsOverviewPage extends TestBase {

	public AccountsOverviewPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(xpath = "//table[@id='accountTable']//tbody//tr[1]//td[2]")
	WebElement accountBalance;

	@FindBy(css = "#leftPanel>ul>li:nth-child(1)>a")
	WebElement newAccount;

	@FindBy(css = "#leftPanel>ul>li:nth-child(7)>a")
	WebElement requestLoan;

	public String getAccountBalance() {
		String balance = accountBalance.getText();
		return balance;
	}

	public openAccountPage openNewAccount() {
		newAccount.click();
		return new openAccountPage();
	}

	public loanRequestPage applyLoan() {
		requestLoan.click();
		return new loanRequestPage();

	}
}
