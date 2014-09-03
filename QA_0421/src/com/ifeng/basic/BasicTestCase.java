package com.ifeng.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.ifeng.browser.BrowserProperties;
import com.ifeng.utils.Utils;

public class BasicTestCase{
	protected WebDriver driver = null;
	private final String CHROMEPATH = "./lib/driver/chromedriver.exe";
	private final String IEPATH = "./lib/driver/IEDriverServer.exe";

	@BeforeTest
	public void getWebDriver() {
		if(driver == null){			
			driver = selectDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
	}
	


	@AfterTest(alwaysRun = true)
	public void afterTest() {
		driver.quit();
	}
	
	public void openURL(String url){
		driver.get(url);
		Utils.sleep(1);
	}

	public static void log(String message) {
		Throwable t = new Throwable();
		StackTraceElement trace[] = t.getStackTrace();
		if (trace.length > 1) {
			StackTraceElement element = trace[1];
			System.out.format("[%s.%s] %s", element.getClassName(),
					element.getMethodName(), message).println();
		} else {
			System.out.format("[no info] %s", message);
		}
	}
	
	private WebDriver selectDriver(){		
		
		String bt = BrowserProperties.getInstance().getBrowserType("browserType");
		if("IE".equalsIgnoreCase(bt)){
			System.setProperty("webdriver.ie.driver", IEPATH);
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			driver = new InternetExplorerDriver(ieCapabilities);
		} else if("CHROME".equalsIgnoreCase(bt)){
			System.setProperty("webdriver.chrome.driver", CHROMEPATH);
			driver = new ChromeDriver();
		}else {
			driver = new FirefoxDriver();
		}
		return driver;
	}
}
