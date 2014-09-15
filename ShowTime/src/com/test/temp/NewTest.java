package com.test.temp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver = null;
 
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
  }
//  @Test
//  public void f() throws InterruptedException {
//	  driver.get("file:///D:/demo.html");
//	  driver.findElement(By.xpath("//input[@value='Alert']")).click();
//	  Thread.sleep(2000);
//	  Alert alert = driver.switchTo().alert();
//	  System.out.println(alert.getText());
//	  alert.accept();
//	  Thread.sleep(2000);
//  }
  
  @Test
  public void mutilIframe() throws InterruptedException{
	  driver.get("file:///D:/frame_sample/demo.html");
	
	  WebElement frame2 = driver.findElement(By.name("second"));
	  driver.switchTo().frame(frame2);
	  Thread.sleep(2000);
	  driver.findElement(By.id("button1")).click();
	  String text = driver.switchTo().alert().getText();
	  System.out.println(text);
	  Thread.sleep(2000);
	  	  
  }

  @AfterTest(alwaysRun=true)
  public void afterTest() {
	  driver.quit();
  }

}
