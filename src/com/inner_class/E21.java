package com.inner_class;
@FunctionalInterface
interface Animal{
	void shout();
}
interface Calculate{
	int sum(int a,int b);
}
class Cat implements Animal{

	@Override
	public void shout() {
		System.out.println("喵喵");
		
	}
	
}
public class E21 {

	public static void main(String[] args) {
		//第一种方式：用具体cat类的对象调用shout方法
		Cat cat=new Cat();
		cat.shout();
		//第二种方法：用匿名内部类的方式调用shout方法
		animalShout(new Animal() {

			@Override
			public void shout() {
				System.out.println("miaomiao");
				
			}
			
		});
		//第三种方式，用lambda表达式调用shout方法
		animalShout(()->System.out.println("aow..."));
		/*animalShout(()->{System.out.println("aow..."));
		   System.out.println("I am a tiger");});*/
		showSum(10,40,(x,y)->x+y);
	}
	
		

	private static void animalShout(Animal animal) {
		animal.shout();
		
	}
	private static void showSum(int x,int y,Calculate calculate) {
		System.out.println(x+"+"+y+"的和为:"+calculate.sum(x, y));
	}

}
