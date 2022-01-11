package com.automationPractie.PageTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automationPractice.Pages.SignUpPage;
import com.automationPractice.TestBase.TestBase;
import com.automationPractice.Qa.utils.ExcelUtils;

public class SignUpPageTest extends TestBase {

	SignUpPage sp;

	@BeforeMethod
	public void intialise() {
		setUp();
		sp = new SignUpPage();
	}

	@Test(dataProvider = "signUp")
	public void signUpWithInputs(String enterFirstName, String enterLastName, String enterAddress, String enterCity,
			String enterState, String enterzipCode, String enterPhoneNumber, String enterSsn, String enterUser,
			String enterPassword, String reenterPassword) {
		 sp.signUp(enterFirstName, enterLastName, enterAddress, enterCity, enterState, enterzipCode, enterPhoneNumber, enterSsn, enterUser, enterPassword, reenterPassword);
	}

	public void submit() {
		sp.clickSubmit();
	}

	@AfterMethod
	public void quit() {
		tearDown();
	}

	@DataProvider(name = "signUp")
	public String[][] dataProvidersignUpForm() throws Exception {
		String path = "/Users/wioletginotra/Library/Containers/com.microsoft.Excel/Data/Desktop/DataDriven.xlsx";
		int rowsCount = ExcelUtils.getRowCount(path, "Sheet1");
		int cellCount = ExcelUtils.getCellCount(path, "Sheet1", rowsCount);

		String[][] data = new String[rowsCount][cellCount];
		for (int i = 1; i <= rowsCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				data[i - 1][j] = ExcelUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return data;
	}
}
