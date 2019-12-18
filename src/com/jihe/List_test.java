package com.jihe;

import java.util.ArrayList;
import java.util.LinkedList;

public class List_test {

	public static void main(String[] args) {
		//<>是泛型，里面的类型是集合里元素的类型
		//有两个类，前面一个是集合类，后面尖括号里的是集合里元素类型
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("stu1");
		arraylist.add("stu2");
		arraylist.add("stu3");
		arraylist.add("stu4");
		//list.add(5);
		System.out.println("数组列表arraylist的长度:"+arraylist.size());
		System.out.println("数组列表arraylist第二个元素是:"+arraylist.get(1));
		
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("stu1");
		linkedList.add("stu2");
		linkedList.offer("offer");
		linkedList.push("push");
		
		//arraylist.add(5);
		System.out.println("链表LinkedList的长度:"+linkedList.size());
		System.out.println("链表LinkedList的最后一个元素是:"+linkedList.getLast());
		System.out.println("链表LinkedList的第一个元素是"+linkedList.getFirst());
		System.out.println(linkedList);
		
		String dygys=linkedList.peek();
		System.out.println("链表LinkedList的最后一个元素是:"+dygys);
		
		linkedList.removeFirst();
		linkedList.pollLast();
		System.out.println(linkedList);
	}

}
