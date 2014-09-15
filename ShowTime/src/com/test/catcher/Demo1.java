package com.test.catcher;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ifeng.catcher.datadriver.LoadConfig;
import com.ifeng.catcher.datadriver.LoadProperty;
import com.ifeng.catcher.datadriver.Loadtxt;
import com.ifeng.catcher.element.CatcherTest;

public class Demo1 {
	private static CatcherTest pageDemo;

	@BeforeMethod
	public static void beforeTest() {
		pageDemo = new CatcherTest();
		pageDemo.loadPageData("./src/com/test/data/testPage.yaml");
	}
	
//	//输入框
//	@Test
//	public void inputBox() {
//		pageDemo.openUrl("file:///D:/demo.html");
//		pageDemo.input("输入框", "这里写输入框中的内容");
//		pageDemo.sleep(3);
//		
//	}
//	//下拉列表框
//	@Test
//	public void dropDownList(){
//		pageDemo.openUrl("file:///D:/demo.html");
//		pageDemo.selectDropDownByIndex("DropDownList", 4);
//		pageDemo.sleep(3);
//		pageDemo.selectDropDownByRandom("DropDownList");
//		pageDemo.sleep(3);		
//	}
//	
//	//延迟加载按钮
//	@Test
//	public void waitBtn(){
//		pageDemo.openUrl("file:///D:/demo.html");
//		pageDemo.click("延迟加载按钮");
//		pageDemo.sleep(6);
//		boolean b = pageDemo.isContentAppeared("wait for display");
//		Assert.assertTrue(b);
//	}
//	
//	//Alert窗口
//	
	@Test
	public void alertBtn(){
		pageDemo.openUrl("file:///D:/demo.html");
		pageDemo.getElement("警告按钮").click();
		pageDemo.sleep(1);
		String textInAlert = pageDemo.getTextInAlert();
		System.out.println(textInAlert);
		Assert.assertEquals(textInAlert, "aa");
		pageDemo.acceptAlert();
		pageDemo.sleep(3);
		
	}
//	
//	//文件链接
//	@Test
//	public void linkedText(){
//		pageDemo.openUrl("file:///D:/demo.html");
//		pageDemo.click("文字链接");
//		pageDemo.sleep(3);
//		System.out.println(pageDemo.getAttribute("文字链接", "href"));
//	}
//	
//	@Test
//	public void soIfeng(){
//		pageDemo.openUrl("http://so.v.ifeng.com");
//		pageDemo.input("搜凤输入框", "山西官场");
//		pageDemo.click("搜索按钮");
//		pageDemo.sleep(3);
//	}
//	
//	//多窗口切换
//	@Test
//	public void multiWindow(){
//		pageDemo.openUrl("file:///D:/demo.html");
//		String currentHandle = pageDemo.getCurrentHandle();
//		System.out.println(currentHandle);
//		pageDemo.click("openNewWindow");
//		//关闭原来的窗口
//		//pageDemo.closePriAndSwithchToNew();
//		//保留原来的窗口
//		pageDemo.switchToNewWindow();
//		pageDemo.input("搜索框", "JavaDoc");
//		pageDemo.sleep(3);		
//	}
//	
//	//不同iframe之间的切换
	@Test
	public void multiFrame(){
		//pageDemo.openUrl("file:///D:/frame_sample/demo.html");
		pageDemo.openUrl();
		WebElement frame2 = pageDemo.getElement("frameSecond");
		pageDemo.selectFrame(frame2);
		//pageDemo.selectFrame("frameSecond");
		//Alert按钮的click()方式
		pageDemo.getElement("提示按钮").click();

		pageDemo.sleep(1);
		System.out.println(pageDemo.getTextInAlert());
		pageDemo.acceptAlert();
		pageDemo.selectDefaultWindow();
		
		String value = Loadtxt.getValueByKey("key");
		//String value = LoadConfig.getValueByKey("searchKey");
		//String value = LoadProperty.getValueByKey("keyword");
		
		System.out.println(value);
		pageDemo.input("主页面搜索框", value);
		pageDemo.sleep(2);
	}
//	
//	//获取对象集合
//	@Test
//	public void objList(){
//		pageDemo.openUrl("file:///D:/demo.html");
//		List<WebElement> list = pageDemo.getElements("页面链接");
//		System.out.println(list.size());
//		
//	}
	
	//富文本框
//	@Test
//	public void richText(){
//		pageDemo.openUrl("http://blog.ifeng.com");
//		pageDemo.input("博客用户名", "itest20");
//		pageDemo.input("博客密码", "123456");
//		pageDemo.getElement("登录按钮").click();
//		pageDemo.click("发表博文");
//		pageDemo.switchToNewWindow();
//		pageDemo.inputToRichTextBox("博客正文框架", "正文内容测试", "正文内容框");
//		pageDemo.sleep(2);
//	}
	

	@AfterMethod(alwaysRun=true)
	public void afterTest() {
		pageDemo.close();
	}

}
