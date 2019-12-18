package com.jihe;

import java.util.TreeSet;

/*class Mycomparator implements Comparator{

	@Override//比较字符串的长度，如果长度相同，则不允许进入TreeSet
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		return s1.length()-s2.length();
	}
	
}*/

public class TreeSet_test3 {

	public static void main(String[] args) {
		//在构造TreeSet时，指明要用到的比较器
		TreeSet<String> ts = new TreeSet<String> ((o1,o2)->{
			String s1=(String)o1;
			String s2=(String)o2;
			return s1.length()-s2.length();
		});
		//TreeSet ts = new TreeSet(new Mycomparator());
		ts.add("Jack");
		ts.add("Evas");
		ts.add("Tom");
		ts.add("Rose");
		ts.add("Jack");
		System.out.println(ts);
		

	}

}
