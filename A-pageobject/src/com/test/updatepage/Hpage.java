package com.test.updatepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.common.Action;
import com.test.page.Search;

public class Hpage extends Action {

	public Hpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// ������
	@FindBy(id = "s_input")
	private WebElement searchBox;

	// ������ť
	@FindBy(id = "s_button_top")
	private WebElement search_Button;
	
	public SRpage search(){
		type(searchBox, "ɽ���ٳ�");
		click(search_Button);
		return new SRpage(driver);
	}

	

}
