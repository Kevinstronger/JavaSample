package com.test.Singleton;

//��̬�ڲ��ࡣ�ŵ㣺�����ǲ����ʼ����̬����INSTANCE����Ϊû������ʹ�ã��ﵽ��Lazy Loading��Ч����
public class InternalSingleton {
	private InternalSingleton(){}
	private static class SingletonHolder{
		private final static InternalSingleton INSTANCE = new InternalSingleton();
	}
	public static InternalSingleton getInstance(){
		return SingletonHolder.INSTANCE;
	}
}
