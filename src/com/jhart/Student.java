package com.jhart;



//右击“源码”-“生成Getter和Setter...”



public class Student extends Person{
	//作用范围修饰符
	//private:类可见性   只在本类中可以使用，其他地方访问都是非法的
	//没有作用范围修饰符：包可见性    只在本包中可以使用，其他地方访问都是非法的
	//protected:子类可见性
	private String name;//姓名成员属性
	private int score;//成绩成员属性
	//构造方法 修饰符public+类名（）{}
	//无参构造方法
	public  Student() {}
	//有参数的构造方法
	public Student(String mz,int cj) {
		this.name=mz;
		this.score=cj;
	}
	
	//读取姓名
	public String getName() {
		return name;
	}
	//设置姓名
	public void setName(String mz) {//mz是参数
		this.name = mz;
	}
	//读取成绩
	public int getScore() {
		return score;
	}
	//设置成绩
	public void setScore(int cj) {
		this.score = cj;
	}

}
