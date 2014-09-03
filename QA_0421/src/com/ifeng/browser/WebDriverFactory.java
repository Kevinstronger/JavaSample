package com.ifeng.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

public class WebDriverFactory {
	private final String CHROMEPATH = "./lib/driver/chromedriver.exe";
	private final String IEPATH = "./lib/driver/IEDriverServer.exe";
	
	public WebDriver getBrowser(){
		WebDriver driver = null;
		String bt = BrowserProperties.getInstance().getBrowserType("browserType");
		if(BrowserProperties.getInstance().getString(BrowserType.CHROME).equalsIgnoreCase(bt)){
			System.setProperty("webdriver.chrome.driver", CHROMEPATH);
			driver = new ChromeDriver();
		}else if (BrowserProperties.getInstance().getString(BrowserType.IE).equalsIgnoreCase(bt)){
			System.setProperty("webdriver.ie.driver", IEPATH);
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			driver = new InternetExplorerDriver(ieCapabilities);
		}else if(BrowserProperties.getInstance().getString(BrowserType.FIREFOX).equalsIgnoreCase(bt)){
			driver = new FirefoxDriver();
		}else{
			Reporter.log("无法识别的浏览器类型");
		}
		return driver;
	}
}
