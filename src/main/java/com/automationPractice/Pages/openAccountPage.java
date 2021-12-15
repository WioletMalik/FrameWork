package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automationPractice.TestBase.TestBase;

public class openAccountPage extends TestBase {

	public openAccountPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "type")
	WebElement selectAccountType;

	@FindBy(id = "fromAccountId")
	WebElement existingAccount;

	@FindBy(css = "input[type='submit']")
	WebElement openNewAccount;

	@FindBy(css = "#leftPanel>ul>li:nth-child(2)")
	WebElement accountOverview;

	@FindBy(xpath = "//table[@id='accountTable']//tbody//tr[2]//td[2]")
	WebElement newAccountBalance;
	
	

	public void selectAccount() {
		Select select = new Select(selectAccountType);
		select.selectByIndex(1);
	}

	public void selectExistingAccount() {
		Select select = new Select(existingAccount);
		select.selectByIndex(0);
	}

	public void openNewAccount() {
		openNewAccount.submit();
	}

	public void accountOverview() {
		accountOverview.click();
	}

	public String balanceInNewAccount() {
		String balanceInNewAccount = newAccountBalance.getText();
		return balanceInNewAccount;
	}
	
}
