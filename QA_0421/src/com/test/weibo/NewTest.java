package com.test.weibo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./lib/driver/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://weibo.com/login.php");
	  Thread.sleep(3000);
	  WebElement ln = driver.findElement(By.xpath("//input[@tabindex='1']"));
      System.out.println(ln.toString());
      System.out.println("--------------");
      ln.sendKeys("zhangchoay@sina.com");
      Thread.sleep(10000);
      driver.close();
      driver.quit();
	  
  }
}
