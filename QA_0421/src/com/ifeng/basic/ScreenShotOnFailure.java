package com.ifeng.basic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

public class ScreenShotOnFailure extends TestListenerAdapter {
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat time = new SimpleDateFormat("HH-mm-ss");

	@Override
	public void onTestFailure(ITestResult result) {
//		WebDriver driver = BasicTestCase.getWebDriver();
//		//Taking screenshot to temporary directory
//		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		//Path of new directory of screenshot
//		String destDir = ("/fail-screenshots/");
//		//creating this directory
//		new File(destDir).mkdirs();
//		String destFile = date.format(Calendar.getInstance().getTime())+"/"
//				+result.getTestClass().getName()+"_"+result.getName()
//				+"_"+time.format(Calendar.getInstance().getTime())+".png";
//		try{
//			FileUtils.copyFile(scrFile, new File(destDir+"/"+ destFile));
//		}catch(IOException e){
//			e.printStackTrace();
//		}
//		//setting escape html to string false
//		Reporter.setEscapeHtml(false);
//		System.out.println("FAILED: "+ result.getTestClass().getName()+" Test: "+result.getName());
//		//printing link with image 200x200 to report file
//		Reporter.log("<a href=fail-screenshots/"+destFile+">"
//				+"<image src=fail-screenshots/"+destFile+" height='200' width='200'/></a>");
		
	}
	

}
