package com.test.updatepage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.test.common.Action;
import com.test.page.HomePage;

public class SRpage extends Action {

	public SRpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	

	public List<String> getItems() {
		List<String> items = new ArrayList<String>();
		List<WebElement> itemList = driver.findElements(By.cssSelector("div.s_r_txt > h3"));
		System.out.println("itemList.size="+itemList.size());
		
		for(WebElement i : itemList) {
			String title = i.findElement(By.cssSelector("a")).getText();
			System.out.println(title);
			items.add(title);
		}
		System.out.println(items.size());
		return items;
	}
	

}
