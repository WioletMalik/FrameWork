package com.automationPractice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automationPractice.TestBase.TestBase;

public class PracticeFormPage extends TestBase {

	public PracticeFormPage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "firstName")
	WebElement firstName;

	@FindBy(id = "lastName")
	WebElement lastName;

	@FindBy(id = "userEmail")
	WebElement email;

	@FindBy(css = "label[for='gender-radio-2']")
	WebElement gender;

	@FindBy(id = "userNumber")
	WebElement phoneNumber;

	@FindBy(id = "dateOfBirthInput")
	WebElement datePicker;

	@FindBy(css = "div.react-datepicker__current-month")
	WebElement currentMonth;

	@FindBy(css = "button[aria-label='Next Month']")
	WebElement nextMonth;

	@FindBy(xpath = "//div[contains(text(),25)]")
	WebElement date;

	@FindBy(id = "subjectsInput")
	WebElement selectSubject;

	@FindBy(css = "label[for='hobbies-checkbox-1']")
	WebElement selectHobbies;

	@FindBy(id = "uploadPicture")
	WebElement pictureUpload;

	@FindBy(id = "currentAddress")
	WebElement address;

	@FindBy(id = "react-select-3-input")
	WebElement selectState;

	@FindBy(id = "react-select-4-input")
	WebElement selectCity;
	
	@FindBy(id = "submit")
	WebElement submitButton;

	@FindBy(id = "modal-sizes-title-lg")
	WebElement message;

	public void filltheForm(String firstname, String lastname, String emailAddress, String userNumber, String subject,
			String currentAddress, String state, String city) {

		String monthYear = "April 2022";

		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		email.sendKeys(emailAddress);
		gender.click();
		phoneNumber.sendKeys(userNumber);
		datePicker.click();

		// WebDriverWait wait = new WebDriverWait(wd, 5);
		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(datePickerContainer)));

		while (!currentMonth.getText().equals(monthYear)) {
			nextMonth.click();
		}

		date.click();

		selectSubject.sendKeys(subject);
		selectSubject.sendKeys(Keys.ENTER);
		selectHobbies.click();
		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("window.scrollBy(0,500)");
		pictureUpload.sendKeys("/Users/wioletginotra/Desktop");
		address.sendKeys(currentAddress);
		selectState.sendKeys(state);
		selectState.sendKeys(Keys.ENTER);
		selectCity.sendKeys(city);
		selectCity.sendKeys(Keys.ENTER);
		submitButton.submit();

	}

	public String verifyMessageOnPage() {
		String welcomeMessage = message.getText();
		return welcomeMessage;
	}
}
