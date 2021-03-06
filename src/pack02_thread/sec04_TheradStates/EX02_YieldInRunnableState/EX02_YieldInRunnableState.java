﻿package pack02_thread.sec04_TheradStates.EX02_YieldInRunnableState;

/*RUNNABLE 상태에서 yield() 메서드를 이용한 CPU 사용 양보*/

class MyThread extends Thread{
	boolean yieldFlag;
	@Override
	public void run() {
		while(true) {
			if(yieldFlag) {
				Thread.yield();
			} else {
				System.out.println(getName()+" 실행");
				for(long i=0; i<1000000000L; i++) {}
			}
		}
	}
}

public class EX02_YieldInRunnableState {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.yieldFlag=false;
		thread1.setDaemon(true);
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");	
		thread2.yieldFlag=true;
		thread2.setDaemon(true);
		thread2.start();
		
		//#. 1초마다 한번씩 양보
		for(int i=0; i<6; i++) {
			try { Thread.sleep(1000); } catch (InterruptedException e) {}			
			thread1.yieldFlag=!thread1.yieldFlag;
			thread2.yieldFlag=!thread2.yieldFlag;
		}
	}
}