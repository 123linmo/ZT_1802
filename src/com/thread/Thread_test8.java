package com.thread;

import org.apache.commons.collections4.functors.ForClosure;

public class Thread_test8 {

	public static void main(String[] args) {
		//lambda表达式
		Thread t1=new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName()+"正在输出:i"+i);
				
			}
		},"优先级较低的线程");
		Thread t2=new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName()+"正在输出:i"+i);
				
			}
		},"优先级较高的线程");
		//使用匿名内部类
		Thread t3=new Thread(new Runnable() {
			
			@Override
			public void run() {
				
					for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName()+"正在输出:i"+i);
			}
			}
		
				
			
		},"优先级普通的线程");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(10);
		//t1.setPriority(1);
		t1.start();
		t2.start();
		t3.start();
	}

}
