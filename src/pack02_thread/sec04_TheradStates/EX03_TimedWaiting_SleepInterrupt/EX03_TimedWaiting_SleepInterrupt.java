package pack02_thread.sec04_TheradStates.EX03_TimedWaiting_SleepInterrupt;

/*Thread.sleep(.) �޼��带 �̿��� TIMED_WAITING�� interrupt()*/

class MyThread extends Thread {
	@Override
	public void run() {
		try { 
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(" --sleep() �� interrupt �߻�--");
			for (long i = 0; i < 1000000000L; i++) {} //RUNNABLE
		}
	}
}

public class EX03_TimedWaiting_SleepInterrupt {
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
	    myThread.start();
	    
	    //#Thread.sleep() 
	    try {Thread.sleep(100);} catch (InterruptedException e) {} //run()�� ���۵Ǳ���� �ð�����
	    System.out.println("MyThread State : " + myThread.getState()); //TIMED_WAITING
	    
	    //#interrupt()
	    myThread.interrupt();
	    try {Thread.sleep(100);} catch (InterruptedException e) {} //���ܹ߻������� �ð�����
	    System.out.println("MyThread State : " + myThread.getState()); //RUNNABLE
	    
	}
}
