package com.chapter4;
class Animal_1{
	public Animal_1 (String name) {
		System.out.print("我是一只"+name);
	}
}
	/*//filed：成员变量
	String name;//Method成员方法
	void shout() {
		System.out.println("动物发出叫声");
	}
}
*/
class Dog_1 extends Animal_1{
	public Dog_1() {
		super("二哈");
	}
}
	/*//方法的重写
	@Override
	//继承了Animal类所有的成员变量和方法
	void shout() {
		System.out.println("嗷嗷。。。。");
	}
	public  void printname() {
		System.out.println("name="+name);
	}
}*/
public class E02 {

	public static void main(String[] args) {
	Dog_1 dog=new Dog_1();
	/*dog.name="雪橇三傻";
	dog.printname();
	dog.shout();*/
			

	}

}
