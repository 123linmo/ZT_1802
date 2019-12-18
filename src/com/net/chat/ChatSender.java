package com.net.chat;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;


public class ChatSender implements Runnable {
	private DatagramSocket client;
	private int targetPort;
	public ChatSender(DatagramSocket client, int target) {
		// TODO 自动生成的构造函数存根
		this.client=client;
		this.targetPort=target;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		
			Scanner sc=new Scanner(System.in) ;
			
		while (true) {
			
			try {
			System.out.println("我说:");
			String data=sc.nextLine();
			byte[] buf = data.getBytes();
			System.out.println("这条信息要发送给哪个IP:");
			DatagramPacket packet = new DatagramPacket(buf, buf.length,
					InetAddress.getByName("10.2.103.31"),8900);
			client.send(packet);
		}
		 catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}}
