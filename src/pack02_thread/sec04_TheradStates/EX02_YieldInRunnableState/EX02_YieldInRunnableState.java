package pack02_thread.sec04_TheradStates.EX02_YieldInRunnableState;

/*RUNNABLE ���¿��� yield() �޼��带 �̿��� CPU ��� �纸*/

class MyThread extends Thread{
	boolean yieldFlag;
	boolean stopFlag;
	@Override
	public void run() {
		while(!stopFlag) {
			if(yieldFlag) {
				Thread.yield();
			} else {
				System.out.println(getName()+" ����");
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
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");	
		thread2.yieldFlag=true;
		thread2.start();
		
		//#. 1�ʸ��� �ѹ��� �纸
		for(int i=0; i<6; i++) {
			try { Thread.sleep(1000); } catch (InterruptedException e) {}			
			thread1.yieldFlag=!thread1.yieldFlag;
			thread2.yieldFlag=!thread2.yieldFlag;
		}
		thread1.stopFlag=thread2.stopFlag=true;		
	}
}