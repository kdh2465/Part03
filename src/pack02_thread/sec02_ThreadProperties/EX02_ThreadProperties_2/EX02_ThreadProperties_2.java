﻿package pack02_thread.sec02_ThreadProperties.EX02_ThreadProperties_2;

/*쓰레드의 우선순위(priority)*/

class MyThread extends Thread {
	@Override
	public void run() {
		for(long i=0; i<1000000000; i++) {} //#약간의 시간 지연
		System.out.println(getName() + " 우선순위:" + getPriority());
	}
}

public class EX02_ThreadProperties_2 {
	public static void main(String[] args) {
		
		//#참고. CPU Core 수 가져오기
		System.out.print("코어수 : ");
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		//#1. 디폴트(default) 우선순위
		for (int i = 0; i < 3; i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		
		//#2. 우선순위 지정
		for (int i = 0; i < 10; i++) {
			Thread thread = new MyThread();
			thread.setName(i + " 번째 쓰레드");
			if (i == 9)
				thread.setPriority(Thread.MAX_PRIORITY);
			thread.start();
		}
				
	}
}

