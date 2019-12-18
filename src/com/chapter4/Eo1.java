package com.chapter4;
class Animal{
	//filed：成员变量
	String name;//Method成员方法
	void shout() {
		System.out.println("动物发出叫声");
	}
}

class Dog extends Animal{
	//方法的重写
	@Override
	//继承了Animal类所有的成员变量和方法
	void shout() {
		System.out.println("嗷嗷。。。。");
	}
	public  void printname() {
		System.out.println("name="+name);
	}
}
public class Eo1 {

	public static void main(String[] args) {
	Dog dog=new Dog();
	dog.name="雪橇三傻";
	dog.printname();
	dog.shout();
			

	}

}
