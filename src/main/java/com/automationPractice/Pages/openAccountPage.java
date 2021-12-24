package com.automationPractice.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automationPractice.TestBase.TestBase;

public class openAccountPage extends TestBase {

	public openAccountPage() {
		PageFactory.initElements(wd, this);
	}

	static int newAccount = 13677;
	static String newAC;

	@FindBy(id = "type")
	WebElement selectAccountType;

	@FindBy(id = "fromAccountId")
	WebElement existingAccount;

	@FindBy(css = "input[type='submit']")
	WebElement openNewAccount;

	@FindBy(css = "#leftPanel>ul>li:nth-child(2)")
	WebElement accountOverview;

	@FindBy(xpath = "//table[@id='accountTable']//tbody//tr[2]//td[1]")
	WebElement newAccountNumber;

	 @FindBy(xpath = "//table[@id='accountTable']//tbody//tr[1]//td[1]")
     WebElement existingAccountNumber;

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

	public void getNewAccountNumber() {
		openNewAccount.submit();
	}

	public void accountOverview() {
		accountOverview.click();
	}

	public String verifyNewAccount() {

		List<WebElement> noOfRows = wd.findElements(By.xpath("//table[@id='accountTable']//tbody//tr"));
		List<WebElement> secondRow = wd.findElements(By.xpath("//table[@id='accountTable']//tbody//tr[2]"));
				

		String beforeXpath = "//table[@id='accountTable']/tbody/tr[";
		String afterXpath = "]/td[1]/a";

		for (int i = 1; i <= noOfRows.size(); i++) {
			for(int j =1; j<=secondRow.size();i++) {
			String actualXpath = beforeXpath + i + afterXpath +j;
			WebElement newAccountNumber = wd.findElement(By.xpath(actualXpath));
			if (newAccountNumber.getText().equals("22224")) {
				newAC = newAccountNumber.getText();
			}
		} 
		}
		return newAC;

	}

	public String balanceInNewAccount() {
		String balanceInNewAccount = newAccountBalance.getText();
		return balanceInNewAccount;
	}

}
