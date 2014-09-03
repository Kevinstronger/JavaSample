package com.ifeng.basic;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Log extends TestListenerAdapter {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("------------------------------------");
		//System.out.println(result.getMethod().getDescription());
		System.out.println("STARTED: CLASS = "+result.getTestClass().getRealClass().getSimpleName()+"METHOD = "+result.getName());
	}
	

}
