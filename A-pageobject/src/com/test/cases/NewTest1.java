package com.test.cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.updatepage.Hpage;

public class NewTest1 {
	WebDriver driver = null;
  @Test
  public void testSearch() {
	  driver = new FirefoxDriver();
	  driver.get("http://so.v.ifeng.com");
	  Hpage homepage = new Hpage(driver);
	  
	  Assert.assertEquals(44, homepage.search().getItems().size());
	  homepage.close();
  }
}
