package com.ljhs;
class Person{
	@Override
	public void finalize() {
		System.out.println("对象将被作为垃圾回收......");
	}
}


public class E37 {
	

	public static void main(String[] args) {
		ljhs1();
		
		System.out.println("-------------");
		
		ljhs2();
	

	}

	private static void ljhs2() {
		Person p2=new Person();
		p2=null;//
		//
		//
		for(int i=0;i<10;i++) {
			System.out.println("方法2循环中......");
		}
	}

	private static void ljhs1() {
		Person p1=new Person();
		p1=null;//让p1对象成为垃圾
		//System.gc();//强制回收垃圾对象
		Runtime.getRuntime().gc();
		//循环执行语句
		for(int i=0;i<10;i++) {
			System.out.println("方法1循环中......");
		}
		System.out.println("----------");
		
		
		
		
	}



}
