package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import com.sun.swing.internal.plaf.basic.resources.basic_zh_TW;

public class InputStreamReader_test {

	public static void main(String[] args) throws Exception {
		//定义标准字节输入流
		//InputStream jpsr=System.in;
		//将标准字节输入流转换成字符流
		//InputStreamReader ir=new InputStreamReader(jpsr);
		//将字符流包装成缓冲字符流
		//BufferedReader br=new BufferedReader(ir);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("profile.txt")));
		System.out.println("请输入您的姓名:");
		String line=br.readLine();
		bw.write("您叫"+line);
		br.close();
		bw.flush();
		bw.close();
	}

}
