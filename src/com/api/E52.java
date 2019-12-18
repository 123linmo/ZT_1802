package com.api;

public class E52 {

	public static void main(String[] args) {
		String s1="abcabccbanba.jpg";
		//字符串可以看成是多个字符组成的字符数组
		System.out.println("字符串s1的长度是"+s1.length());
		System.out.println("字符串s1的第一个字符是"+s1.charAt(0));
		System.out.println("字符串s1的第二个字符是"+s1.charAt(1));
		//'a'=97 'A'=65 'e'=48
		System.out.println("字符串s1中字符c的第一次出现的位置是"+s1.indexOf('c'));
		//java方法命名一般采用驼峰命名原则，第一个英语单词首字母小写
		//后面每个英语单词的首字母都是大写
		System.out.println("字符串s1中字符c的最后一次出现的位置是"+s1.lastIndexOf(99));
	}

}
