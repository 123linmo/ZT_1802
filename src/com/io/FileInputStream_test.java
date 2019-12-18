package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.stream.Stream;


public class FileInputStream_test {

	public static void main(String[] args) throws Exception {
		FileInputStream fin=new FileInputStream("d:\\tp.jpg");
		FileOutputStream fout=new FileOutputStream("c:\\tp.jpg");
		long kssj=System.currentTimeMillis();
		byte[]zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while (b!=-1) {
			//System.out.print((char)b);
			fout.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		long jssj=System.currentTimeMillis();
		System.out.println("拷贝40kb的图片文件耗时"+(jssj-kssj)+"毫秒");
		//fout.write(",come on!".getBytes());
		fin.close();
		fout.close();
	}         

}
