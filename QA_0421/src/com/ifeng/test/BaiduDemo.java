package com.ifeng.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ifeng.utils.Utils;

import com.ifeng.basic.BasicTestCase;

public class BaiduDemo extends BasicTestCase{

	@Test
	public void search_1(){
		driver.get("http://www.baidu.com");
		driver.findElement(By.name("wd")).sendKeys("天气");
		driver.findElement(By.id("su1")).click();
		Utils.sleep(1);
		Assert.assertTrue(driver.getTitle().startsWith("天气"));
	}
	


	@Test
	public void search_2() {
		driver.get("http://www.baidu.com");
		driver.findElement(By.name("wd")).sendKeys("iPhone");
		driver.findElement(By.id("su1")).click();
		Utils.sleep(1);
		Assert.assertTrue(driver.getTitle().startsWith("google"));
	}


}
