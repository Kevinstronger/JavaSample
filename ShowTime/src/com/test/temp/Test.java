package com.test.temp;

public class Test {
	public static void main(String[] args) {
		boolean flag = false;
		flag = check(2);
		if(!flag){
			System.out.println("这是错误的时候");
			System.out.println(flag);
		}else{
			System.out.println(flag);
			System.out.println("这是为真的时候");
		}
		
		
	}
	
	private static boolean check(int num) {
		if(num >=10) {
			return true;
		} else {
			return false;
		}
	}

}
