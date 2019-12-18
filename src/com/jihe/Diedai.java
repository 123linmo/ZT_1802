package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class Diedai {

	public static void main(String[] args) {
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("stu1");
		arraylist.add("stu2");
		arraylist.add("stu3");
		arraylist.add("stu4");
		//list.add(5);
		System.out.println("数组列表arraylist的长度:"+arraylist.size());
		System.out.println("数组列表arraylist第二个元素是:"+arraylist.get(1));
		System.out.println("使用迭代输出每个元素： ");
		//使用迭代读取集合中的每个元素
		Iterator<String>diedai=arraylist.iterator();
		//hasNext判断是否有下一个元素
		while (diedai.hasNext()) {
			//next方法读取下一个元素
			String dgys=diedai.next();
			System.out.println(dgys);
			
		}
		System.out.println("使用foreach循环输出每个元素");
		for (String mgys : arraylist) {
			System.out.println(mgys);
		}
		System.out.println("使用JDK8的foreach循环输出每个元素:");
		arraylist.forEach(jhlmgdx->System.out.println(jhlmgdx));
		
		System.out.println("利用迭代集合对象使用JDK8的foreach循环输出每个元素:");
		Iterator<String> Diedai=arraylist.iterator();
		Diedai.forEachRemaining(obj->System.out.println(obj));
	}
}
		

