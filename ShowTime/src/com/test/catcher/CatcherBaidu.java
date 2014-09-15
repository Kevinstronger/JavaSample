package com.test.catcher;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ifeng.catcher.element.CatcherTest;

public class CatcherBaidu {
	private static CatcherTest pageBaidu;

	@BeforeMethod
	public static void beforeClass() {
		pageBaidu = new CatcherTest();
		pageBaidu.loadPageData("./src/com/test/data/百度首页.yaml");
	}


	@Test
	public void testDemo(){
		pageBaidu.openUrl("http://www.baidu.com");
		pageBaidu.input("百度搜索框", "中秋节");
		pageBaidu.sleep(1);
		pageBaidu.click("百度提交按钮");
		pageBaidu.sleep(3);
	}
		
//	@Test
//	public void testDemo1(){
//		pageBaidu.openUrl("http://www.baidu.com");
//		pageBaidu.input("百度搜索框", "国庆节");
//		pageBaidu.sleep(1);
//		pageBaidu.click("百度提交按钮");
//		pageBaidu.sleep(1);
//		
//	
//	
//
//	}

	@AfterMethod(alwaysRun=true)
	public void afterClass() {
		pageBaidu.close();
	}

}
