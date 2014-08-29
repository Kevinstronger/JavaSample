package com.test.Singleton;
/*
枚举，《Effective Java》作者推荐使用的方法，优点：不仅能避免多线程同步问题，
而且还能防止反序列化重新创建新的对象
*/
enum EnumSingleton {
	INSTANCE;
	public void doSomething(){
		System.out.println("枚举法不错呀！");
	}
}
