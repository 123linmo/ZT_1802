package com.class_cast;
interface  Animal{
	void shout();
}
class Tiger implements Animal{
	public void shout() {
		System.out.println("aow...");
	}
	public void eatMan() {
		System.out.println("老虎吃人了");
	}
}
class Pig implements Animal{

	@Override
	public void shout() {
		System.out.println("huhu...");
	}
	
}
public class E16 {

	public static void main(String[] args) {
		//Animal tiger=new Tiger();
		//tiger.shout();
		//((Tiger) tiger).eatMan();
		Animal an1=new Pig();
		//判断an1这个对象是否是Tiger类的实例
		if(an1 instanceof Tiger) {
			Tiger tiger2=(Tiger) an1;
			tiger2.shout();
			tiger2.eatMan();
		}else {
			System.out.println("这个动物不是老虎");
		}

	}

}
