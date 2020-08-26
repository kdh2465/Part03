package pack02_thread.sec04_TheradStates.EX05_BlockedState;

/*공유객체 동기화로 인한 BLOCKED 상태*/

class MyBlockTest {
	MyClass mc = new MyClass();
	Thread t1 = new Thread("thread1") {
		public void run() {
			mc.syncMethod();
		}
	};
	Thread t2 = new Thread("thread2") {
		public void run() {
			mc.syncMethod();
		}
	};
	Thread t3 = new Thread("thread3") {
		public void run() {
			mc.syncMethod();
		}
	};
	
	void startAll() {
		t1.start();
		t2.start();
		t3.start();
	}
	
	class MyClass{
		synchronized void syncMethod() {
			try {Thread.sleep(100);} catch (InterruptedException e) {} //쓰레드 시작 준비 시간
			System.out.println("["+Thread.currentThread().getName()+"]");
			System.out.println("thread1->"+t1.getState());
			System.out.println("thread2->"+t2.getState());
			System.out.println("thread3->"+t3.getState());

			for(long i=0; i<100000000L; i++) {}
		}
	}
}

public class EX05_BlockedState {
	
	public static void main(String[] args) {
		
		MyBlockTest mbt = new MyBlockTest();
		mbt.startAll();
	
	}
}

