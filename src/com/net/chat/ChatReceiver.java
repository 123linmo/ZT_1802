package com.net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChatReceiver implements Runnable {
	//
	private DatagramSocket server;
	public ChatReceiver(DatagramSocket ds) {
		this.server=ds;
	}
	@Override
	public void run() {
	
			//
			byte[] buf=new byte[1024];
			DatagramPacket packet = new DatagramPacket(buf,buf.length);
		
			while (true) {
				try {
			server.receive(packet);
			//
			String str=new String(packet.getData(),
									0,packet.getLength());
			System.out.println("收到"+packet.getAddress()
						+":"+packet.getPort()+"发送的数据:"+str);
		

	}
			catch (Exception e) {
					// TODO: handle exception
				e.printStackTrace();
					}
				
			}
		}
	}
