package com.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private static WebDriver driver;
	
	public static WebDriver driver(){
		return driver;
	}
	
	public HomePage() {
		driver = new FirefoxDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void load(){
		driver.get("http://so.v.ifeng.com");
	}
	
	public void close(){
		driver.quit();
	}
	
	public Search search(){
		Search search = new Search();
		return search;
	}

}
