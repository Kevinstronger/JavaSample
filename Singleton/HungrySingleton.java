package com.test.Singleton;

//饿汉式，缺点：没有达到Lazy loading的效果。
public class HungrySingleton {
	private static final HungrySingleton hungrySingleton = new HungrySingleton();
	private HungrySingleton(){}
	public static HungrySingleton getInstance(){
		return hungrySingleton;
	}
}
