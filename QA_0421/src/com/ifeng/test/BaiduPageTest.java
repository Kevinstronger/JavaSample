package com.ifeng.test;

import org.testng.annotations.Test;

import com.ifeng.basic.BasicTestCase;
import com.ifeng.browser.BrowserProperties;
import com.ifeng.page.HomePage;

public class BaiduPageTest extends BasicTestCase {
	
  @Test
  public void getResult() {
	 openURL(BrowserProperties.getInstance().getURL("URL"));
	 new HomePage(driver).input("Webdriver");
  }
}
