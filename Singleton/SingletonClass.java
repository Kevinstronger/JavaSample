package com.test.Singleton;
//��������ʵ��ͬ��
public class SingletonClass {
	private static SingletonClass singletonClass = null;
	private SingletonClass(){}
	//ԭʼ����
	/*
	public synchronized static SingletonClass getInstance(){
		if(singletonClass == null) {
			singletonClass = new SingletonClass();
		}
		return singletonClass;
	}
	//��һ���޸ĺ�
	
	public static SingletonClass getInstance() {
		synchronized(SingletonClass.class) {
			if(singletonClass == null) {
				singletonClass = new SingletonClass();
			}
		}
		return singletonClass;
	}
	*/
	//�ڶ����޸ĺ�(˫��У����)
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
