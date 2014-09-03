package com.ifeng.utils;

public class Utils {
	public static void sleep(int second){
		long million = second * 1000;
		try {
			Thread.sleep(million);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
