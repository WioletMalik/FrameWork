package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automationPractice.TestBase.TestBase;

public class loanRequestPage extends TestBase {

	public loanRequestPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "amount")
	WebElement loanAmount;

	@FindBy(id = "downPayment")
	WebElement downPayment;

	@FindBy(id = "fromAccountId")
	WebElement selectaccount;

	@FindBy(css = "input[type='submit']")
	WebElement apply;

	@FindBy(id = "loanProviderName")
	WebElement loanProvider;

	@FindBy(id = "loanStatus")
	WebElement loanStatus;

	@FindBy(id = "newAccountId")
	WebElement newAccountNumber;

	public void loanAmount(String amount, String downpayment) {
		loanAmount.sendKeys(amount);
		downPayment.sendKeys(downpayment);
	}

	public void selectAccount() {
		Select select = new Select(selectaccount);
		select.selectByIndex(1);
		apply.submit();
	}

	public String getLoanProviderInfo() {
		String loanProviderName = loanProvider.getText();
		return loanProviderName;
	}

	public String getloanStatus() {
		String getloanStatus = loanStatus.getText();
		return getloanStatus;
	}

	public String getNewAccountNumber() {
		String NewloanAccount = newAccountNumber.getText();
		return NewloanAccount;
	}
}
