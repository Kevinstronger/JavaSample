package com.test.Singleton;

//����ʽ��ȱ�㣺û�дﵽLazy loading��Ч����
public class HungrySingleton {
	private static final HungrySingleton hungrySingleton = new HungrySingleton();
	private HungrySingleton(){}
	public static HungrySingleton getInstance(){
		return hungrySingleton;
	}
}
