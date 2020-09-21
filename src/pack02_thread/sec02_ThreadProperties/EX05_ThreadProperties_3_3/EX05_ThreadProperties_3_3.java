﻿package pack02_thread.sec02_ThreadProperties.EX05_ThreadProperties_3_3;

/*쓰레드의 데몬(daemon) 설정 #3 : 일반쓰레드 vs. 데몬쓰레드*/

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + ":" + (isDaemon() ? "데몬쓰레드" : "일반쓰레드"));
		for (int i = 0; i < 6; i++) {
			System.out.println(getName() + ":" + i + "초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}

public class EX05_ThreadProperties_3_3 {
	public static void main(String[] args) {
		
		//#1. 일반쓰레드
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);
		thread1.setName("thread1");
		thread1.start();
		
		//#2. 데몬쓰레드
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
				
		//#3. 3초후 MainThread 종료
		try { Thread.sleep(3500); } catch (InterruptedException e) {}
		System.out.println("main thread 종료");		
	}
}
