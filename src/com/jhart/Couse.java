package com.jhart;
//"记事本"
//"Course类：
//课程 id  Course_id		String
//课程名       Course_name	String
//参考教材    Course_book	String
public class Couse {
	private String course_id;
	private String course_name;
	private String course_book;
	//如果没有任何构造方法，java   VM虚拟机会自动创建一个无参数的构造方法
	//如果创建了带参数的构造方法，java   VM虚拟机不会自动创建一个无参数的构造方法
	//因此，在创建类的时候，一定要写一个不带参数的构造方法
	
	public Couse() {}
	public Couse(String course_name, String course_book) {
		this.course_name = course_name;
		this.course_book = course_book;
	}
	
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_book() {
		return course_book;
	}
	public void setCourse_book(String course_book) {
		this.course_book = course_book;
	}

	
	
	
}
