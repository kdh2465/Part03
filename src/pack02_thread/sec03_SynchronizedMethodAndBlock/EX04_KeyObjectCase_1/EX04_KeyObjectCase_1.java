package pack02_thread.sec03_SynchronizedMethodAndBlock.EX04_KeyObjectCase_1;

/*�� ���� ����ȭ ������ ������ ����(key)�� ����ȭ �� ���*/

class MyData {
	synchronized void abc() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
	synchronized void bcd() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
	void cde() {
		synchronized (this) {
			for (int i = 0; i < 3; i++) {
				System.out.println(i + "��°");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		}
	}
}

public class EX04_KeyObjectCase_1 {
	public static void main(String[] args) {
		//#������ü
		MyData myData = new MyData();
		
		// #Thread 1 : abc() ����
		new Thread() {
			public void run() {
				myData.abc();
			}
		}.start();

		// #Thread 2 : bcd() ����
		new Thread() {
			public void run() {
				myData.bcd();
			}
		}.start();

		// #Thread 3 : cde() ���� 
		new Thread() {
			public void run() {
				myData.cde();
			}
		}.start();
	}
}