package com.automationPractice.TestBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver wd;
	public static Properties prop;

	public TestBase() {

		prop = new Properties();

		try {
			FileInputStream fs = new FileInputStream(
					"/Users/wioletginotra/eclipse-workspace/14AugBatch/src/main/java/com/automationPractice/Qa/Properties/config.properties");
			prop.load(fs);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@BeforeMethod
	public void setUp() {

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			wd = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			wd = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			wd = new EdgeDriver();
		} else {
			System.out.println("Browser name is invalid");
		}

		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void tearDown() {
		wd.quit();
	}
}
