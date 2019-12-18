package com.duotai;
 abstract class Animal{
	 abstract void shout();
}

class Dog extends Animal{
	public void shout() {
		System.out.println("wangwang...");
	}
}
class Cat extends Animal{
	public void shout() {
		System.out.println("miaomiao...");
	}
}
public class E15 {

	public static void main(String[] args) {
		Animal an1=new Dog();
		Animal an2=new Cat();
		an1.shout();
		an2.shout();

	}

}
