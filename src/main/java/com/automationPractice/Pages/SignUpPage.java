package com.automationPractice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.TestBase.TestBase;

public class SignUpPage extends TestBase {

	public SignUpPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "customer.firstName")
	WebElement firstName;

	@FindBy(id = "customer.lastName")
	WebElement lastName;

	@FindBy(id = "customer.address.street")
	WebElement streetAddress;

	@FindBy(id = "customer.address.city")
	WebElement city;

	@FindBy(id = "customer.address.state")
	WebElement state;

	@FindBy(id = "customer.address.zipCode")
	WebElement zipcode;

	@FindBy(id = "customer.phoneNumber")
	WebElement phoneNumber;

	@FindBy(id = "customer.ssn")
	WebElement socialSecurity;

	@FindBy(id = "customer.username")
	WebElement username;

	@FindBy(id = "customer.password")
	WebElement password;

	@FindBy(id = "repeatedPassword")
	WebElement passwordAgain;

	@FindBy(id = "submit")
	WebElement register;

	public void signUp(String enterFirstName, String enterLastName, String enterAddress, String enterCity,
			String enterState, String enterzipCode, String enterPhoneNumber, String enterSsn, String enterUser,
			String enterPassword, String reenterPassword) {

		/*firstName.sendKeys(enterFirstName);
		lastName.sendKeys(enterLastName);
		streetAddress.sendKeys(enterAddress);
		city.sendKeys(enterCity);
		state.sendKeys(enterState);
		zipcode.sendKeys(enterzipCode);
		phoneNumber.sendKeys(enterPhoneNumber);
		socialSecurity.sendKeys(enterSsn);
		username.sendKeys(enterUser);
		password.sendKeys(enterPassword);
		passwordAgain.sendKeys(reenterPassword);*/

	}

	public void clickSubmit() {
		register.submit();
	}
}