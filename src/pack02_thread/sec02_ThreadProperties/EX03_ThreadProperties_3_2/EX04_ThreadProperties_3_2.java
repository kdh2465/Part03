package pack02_thread.sec02_ThreadProperties.EX03_ThreadProperties_3_2;

/*�������� ����(daemon) ���� #2 : ���󾲷���*/

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + ":" + (isDaemon() ? "���󾲷���" : "�Ϲݾ�����"));
		for (int i = 0; i < 6; i++) {
			System.out.println(getName() + ":" + i + "��");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}

public class EX04_ThreadProperties_3_2 {
	public static void main(String[] args) {
		
		//#1. �Ϲݾ�����
		//Thread thread1 = new MyThread();
		//thread1.setDaemon(false);
		//thread1.setName("thread1");
		//thread1.start();
		
		//#2. ���󾲷���
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
				
		//#3. 3���� MainThread ����
		try { Thread.sleep(3500); } catch (InterruptedException e) {}
		System.out.println("main thread ����");		
	}
}
