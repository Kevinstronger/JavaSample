package com.test.Singleton;

public class PatternTest {
	public static void main(String[] args) {
		
		//LazySingleton singleton = LazySingleton.getInstance();
		//System.out.println(singleton);
		
		//HungrySingleton singleton = HungrySingleton.getInstance();
		
		EnumSingleton.INSTANCE.doSomething();
		
	}

}
