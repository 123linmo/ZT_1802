package com.net;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import org.apache.commons.math3.random.ISAACRandom;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		// 创建客户端套接字要带上服务器的IP地址和端口
		Socket khdtjz=new Socket("10.2.103.34",8899);
		//通过客户端套接字获取写入网络的输出流
		//OutputStream os=khdtjz.getOutputStream();
		OutputStream os=khdtjz.getOutputStream();
		//
		FileInputStream fin=new FileInputStream("d:\\1.png");
		//FileInputStream fin=new FileInputStream("d:\\10.2.103.34.jpg");
		//
		byte[] zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while (b!=-1) {
			//System.out.println((char)b);
			os.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		khdtjz.shutdownOutput();
		//
		InputStream is=khdtjz.getInputStream();
		b=is.read(zjhc);
		while (b!=-1) {
			System.out.println(new String(zjhc,0,b));
			b=is.read();
		}
		is.close();
		khdtjz.close();
		
	//khdtjz.shutdownOutput();
	}

}
