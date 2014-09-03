package com.test.dataprovider;

import java.lang.reflect.Method;

import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@DataProvider
	public Object[][] providerMethod(Method method) {
		Object[][] result = null;
		if(method.getName().equals("testmethod1")) {
			result = new Object[][]{new Object[]{1}};
		}else if(method.getName().equals("testmethod2")) {
			result = new Object[][]{new Object[]{"Hello, method2"}};
		}else {
			result = new Object[][]{new Object[]{new Person("Amy", 20)}};
		}
		return result;
	}
	
	
	@Test(dataProvider="providerMethod")
	public void testmethod1(int param) {
		ITestResult it = Reporter.getCurrentTestResult();
		System.out.println(it.getTestClass().getName());
		ITestNGMethod method = Reporter.getCurrentTestResult().getMethod();
		System.out.println(method.getMethodName());
		System.out.println("method1 received: " + param);
	}
	
	@Test(dataProvider="providerMethod")
	public void testmethod2(String param) {
		System.out.println("method2 received: " + param);
	}
	
	@Test(dataProvider="providerMethod") 
	public void testmethod3(Person p) {
		System.out.println("method3 received: " + p.getName()+", "+p.getAge());
	}
}

class Person {
	private String name;
	private int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
