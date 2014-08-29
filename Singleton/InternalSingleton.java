package com.test.Singleton;

//静态内部类。优点：加载是不会初始化静态变量INSTANCE，因为没有主动使用，达到了Lazy Loading的效果。
public class InternalSingleton {
	private InternalSingleton(){}
	private static class SingletonHolder{
		private final static InternalSingleton INSTANCE = new InternalSingleton();
	}
	public static InternalSingleton getInstance(){
		return SingletonHolder.INSTANCE;
	}
}
