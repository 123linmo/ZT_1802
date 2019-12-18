package com.object;
class Animal extends java.lang.Object{
	void shout() {
	System.out.print("动物叫");
}
	@Override
	public String toString(){
		return("这是一个动物");
	}
}
public class E06 {

	public static void main(String[] args) {
		Animal animal=new Animal();//animal--dw只是一个变量
		Animal animal2=new Animal();
		System.out.println(animal. toString());
		System.out.println(animal2. toString());
		// TODO 自动生成的方法存根

	}

}
