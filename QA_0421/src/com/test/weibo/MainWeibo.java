package com.test.weibo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class MainWeibo {
	public static void main(String[] args) throws InterruptedException {
		  //System.setProperty("webdriver.chrome.driver", "./lib/driver/chromedriver.exe");
		  //WebDriver driver = new ChromeDriver();
		 HtmlUnitDriver driver = new HtmlUnitDriver(true);
		  driver.get("http://weibo.com/login.php");
		  Thread.sleep(3000);
		  WebElement ln = driver.findElement(By.xpath("//input[@tabindex='1']"));
		  ln.clear();
	      ln.sendKeys("zhangchoay@sina.com");
	      WebElement password = driver.findElement(By.xpath("//input[@tabindex='2']"));
	      Thread.sleep(1000);
	      password.clear();
	      password.sendKeys("43183037");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//a[@class='W_btn_g']/span")).click();
	      Thread.sleep(10000);
	      System.out.println(driver.getTitle());
	      //Thread.sleep(10000);
	      driver.quit();
	}

}
