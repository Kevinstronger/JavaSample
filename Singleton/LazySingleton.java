package com.test.Singleton;
//懒汉式，常用写法
public class LazySingleton {
	private static LazySingleton lazySingleton = null;
	private LazySingleton(){}
	
	public static LazySingleton getInstance(){
		if(lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}	
}
