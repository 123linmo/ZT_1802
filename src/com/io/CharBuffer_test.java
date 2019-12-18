package com.io;

import java.nio.CharBuffer;

public class CharBuffer_test {

	public static void main(String[] args) {
		CharBuffer cbf=CharBuffer.allocate(6);
		System.out.println("这个字符缓冲区容量是"+cbf.capacity());
		System.out.println("这个字符缓冲区界限值是"+cbf.limit());
		System.out.println("这个字符缓冲区初始位置值是"+cbf.position());
		//向CharBuffer对象中放入3个元素
		cbf.put('a');
		cbf.put('b');
		cbf.put('c');
		System.out.println("加入元素后的界限值是"+cbf.limit());
		System.out.println("加入元素后位置值是"+cbf.position());
		//执行flip()方法
		cbf.flip();
		System.out.println("执行flif()后的界限值是"+cbf.limit());
		System.out.println("执行flif()后位置值是"+cbf.position());
		//取出第1个元素
		System.out.println("取出的第一个元素为是"+cbf.get());
		System.out.println("这个字符缓冲区界限值是"+cbf.limit());
		System.out.println("这个字符缓冲区初始位置值是"+cbf.position());
		//执行clear方法
		cbf.clear();
		System.out.println("执行clear()后的界限值"+cbf.limit());
		System.out.println("执行clear()后的位置"+cbf.position());
		//取出第1个元素
		System.out.println("取出的第一个元素为:"+cbf.get(0));
		System.out.println("取出的第一个元素为:"+cbf.limit());
		System.out.println("取出的第一个元素为:"+cbf.position());
		
	}

}
