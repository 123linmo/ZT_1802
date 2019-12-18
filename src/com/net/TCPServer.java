package com.net;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.mysql.fabric.Server;


import jdk.management.resource.internal.inst.ServerSocketChannelImplRMHooks;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		/*java.io.File wjj=new File("d:\\upload");
		File[] wjjh=wjj.listFiles();
		for(java.io.File wj:wjjh) {
			System.out.println(wj.getName());
		}*/
		// 创建服务器套接字,监听8899端口
		ServerSocket fwqtjz=new ServerSocket(8899);
		//在死循环里不断监听
		while (true) {
			//获取客户端套接字
			Socket khdtjz=fwqtjz.accept();
			//通过客户端套接字获取客户端的端口号
			new Thread(()-> {
				try {
			
			String ip=khdtjz.getInetAddress().getHostAddress();
			int port=khdtjz.getPort();
			//通过客户端套接字获取客户端的IP地址
			
			System.out.println("和客户端ip地址是"+ip+",端口是"+port+"连接上了");
			//String xinxi="客户端你好,来自服务的问候";
			
			InputStream is;
			
			is = khdtjz.getInputStream();
			
			byte[]zjhc=new byte[1024];
			//定义
			FileOutputStream fout=new FileOutputStream("d:\\upload\\"+ip+".jpg");
			int b=is.read(zjhc);
			while (b!=-1) {
			//
				
					fout.write(zjhc,0,b);
				
				b=is.read(zjhc);
				
			}
			String xinxi="文件上传成功";
			zjhc=new byte[1024];
			OutputStream os=khdtjz.getOutputStream();
			os.write(xinxi.getBytes("UTF-8"));
			os.close();
				} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			}).start();;
	}
	}}

