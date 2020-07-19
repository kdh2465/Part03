package pack02_thread.sec04_TheradStates.EX05_BlockedState;

/*공유객체 동기화로 인한 BLOCKED 상태*/

class MyClass{
	synchronized void syncMethod() {
		System.out.println(Thread.currentThread().getName());
		for(long i=0; i<1000000000L; i++) {}
	}
}

public class EX05_BlockedState {
	public static void main(String[] args) throws InterruptedException {
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
		t1.start();
		t2.start();
		t3.start();
		
		Thread.State old_t1=null, new_t1=null;
		Thread.State old_t2=null, new_t2=null;
		Thread.State old_t3=null, new_t3=null;
		
		while(true) {
			new_t1=t1.getState();
			new_t2=t2.getState();
			new_t3=t3.getState();
			
			if(old_t1!=new_t1||old_t2!=new_t2||old_t3!=new_t3) {						
				System.out.println("t1 : "+new_t1);
				System.out.println("t2 : "+new_t2);
				System.out.println("t3 : "+new_t3);
				if(t1.getState()==Thread.State.TERMINATED
						&& t2.getState()==Thread.State.TERMINATED 
						&& t3.getState()==Thread.State.TERMINATED)
					break;
			}
			old_t1=new_t1; old_t2=new_t2; old_t3=new_t3;
			
			Thread.sleep(10);
		}
	}
}

