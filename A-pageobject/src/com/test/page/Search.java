package com.test.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	//ËÑË÷¿ò
	@FindBy(id="s_input")
	private WebElement searchBox;
	
	//ËÑË÷°´Å¥
	@FindBy(id="s_button_top")
	private WebElement search_Button;
	
	public Search(){
		PageFactory.initElements(HomePage.driver(), this);
	}
	
	public SearchResults searchResult(String query) {
		searchBox.sendKeys(query);
		search_Button.click();
		return new SearchResults();
	}
	

}
