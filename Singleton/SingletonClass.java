package com.test.Singleton;
//加锁，以实现同步
public class SingletonClass {
	private static SingletonClass singletonClass = null;
	private SingletonClass(){}
	//原始代码
	/*
	public synchronized static SingletonClass getInstance(){
		if(singletonClass == null) {
			singletonClass = new SingletonClass();
		}
		return singletonClass;
	}
	//第一次修改后
	
	public static SingletonClass getInstance() {
		synchronized(SingletonClass.class) {
			if(singletonClass == null) {
				singletonClass = new SingletonClass();
			}
		}
		return singletonClass;
	}
	*/
	//第二次修改后(双重校验锁)
	public static SingletonClass getInstance() {
		if(singletonClass == null) {
			synchronized(SingletonClass.class){
				if(singletonClass == null) {
					singletonClass = new SingletonClass();
				}
			}
		}
		return singletonClass;
	}
}
