package com.test.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest1 {
	@DataProvider(name = "test1")
	public Object[][] createData1() {

		return new Object[][] {

		{"itest5", "123456"},

		

		};

	}

	@Test(dataProvider = "test1")
	public void verifyData1(String n1, String n2) throws InterruptedException {

		//System.out.println(n1 + " " + n2);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://blog.ifeng.com");
		driver.findElement(By.id("username")).sendKeys(n1);
		driver.findElement(By.id("password")).sendKeys(n2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='登录']")).click();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
