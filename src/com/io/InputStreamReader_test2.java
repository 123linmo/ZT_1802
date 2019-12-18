package com.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReader_test2 {

	public static void main(String[] args) {
		//定义标准字节输入流
		InputStream jpsr=System.in;
		//将标准字节输入流转换成字符流
		InputStreamReader ir=new InputStreamReader(jpsr);
		//将字符流包装成缓冲字符流
		BufferedReader br=new BufferedReader(ir);
		

	}

}
