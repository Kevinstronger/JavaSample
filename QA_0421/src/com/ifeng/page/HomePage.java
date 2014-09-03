package com.ifeng.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "kw1")
	private WebElement searchBox;
	
	@FindBy(id = "su1")
	private WebElement searchBtn;
	
	public void input(String key){
		searchBox.clear();
		searchBox.sendKeys(key);
		searchBtn.click();
	}	

}
