package com.test.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class Action {
	
	protected WebDriver driver;
	
	public Action(WebDriver driver) {
		this.driver = driver;
	}
	
	public void close(){
		driver.quit();
	}
	
	public void type(WebElement elemnet,String str) {
		elemnet.sendKeys(str);
	}
	
	public void click(WebElement elemnet) {
		elemnet.click();
	}

}
