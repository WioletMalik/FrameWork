package com.automationPractice.Pages;

import java.util.List;

import org.openqa.selenium.By;
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
	
	@FindBy(id = "loanProviderName")
	WebElement loanProvider;

	@FindBy(id = "loanStatus")
	WebElement loanStatus;

	@FindBy(id = "newAccountId")
	WebElement newAccountNumber;

	public String verifyNewAccount() {

		String newAC = "22224";

		List<WebElement> rows = wd.findElements(By.xpath("//tbody/tr"));
		int rowCount = rows.size();

		String beforeXpath = "//tbody/tr[";
		String afterXpath = "]/td[1]";

		for (int i = 1; i <= rowCount; i++) {
			String actualXpath = beforeXpath + i + afterXpath;
			WebElement newAccountNumber = wd.findElement(By.xpath(actualXpath));
			if (newAccountNumber.getText().equals(newAC)) {
				newAC = newAccountNumber.getText();

			}
		}

		return newAC;
	}

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
