package com.automationPractice.Qa.utils;

import static org.testng.Assert.fail;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.automationPractice.TestBase.TestBase;

public class CustomListener extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {

		logger.info("..........Test execution for " + result.getMethod().getMethodName() + " started...........");
	logger.info("Test excution started" + result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		logger.info("Test " + result.getMethod().getMethodName() + " Passed....");

	}

	@Override
	public void onTestFailure(ITestResult result) {

		logger.info(
				"..........Test " + result.getMethod().getMethodName() + " Failed...........Taking Screen Shot!!!!!");

		Utils.failedTestScreenShot(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		logger.info("..........Test " + result.getMethod().getMethodName() + " Execution Skipped!!!!!");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
}
}