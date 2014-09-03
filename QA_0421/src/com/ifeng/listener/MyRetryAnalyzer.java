package com.ifeng.listener;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {
	private static final Logger logger = Logger.getLogger(MyRetryAnalyzer.class);
	int retryCount = 0;
	int retryMaxCount = 2;
	static{
		PropertyConfigurator.configure("./conf/log4j.properties");
	}
	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess()){
			if(retryCount < retryMaxCount){
				String message = "重新运行失败用例："+ result.getName()+"这是第"+(retryCount+1)
						+"次运行";
				logger.info(message);
				retryCount++;
				return true;
			}
		}
		logger.debug("用例运行"+(retryMaxCount+1)+"次后仍然失败，跳过该用例");
		
		return false;
	}
}
