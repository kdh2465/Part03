package pack02_thread.sec02_ThreadProperties.EX02_ThreadProperties_2;

/*�������� �켱����(priority)*/

class MyThread extends Thread {
	@Override
	public void run() {
		for(long i=0; i<1000000000; i++) {} //#�ణ�� �ð� ����
		System.out.println(getName() + " �켱����:" + getPriority());
	}
}

public class EX02_ThreadProperties_2 {
	public static void main(String[] args) {
		
		//#����. CPU Core �� ��������
		System.out.print("�ھ�� : ");
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		//#1. ����Ʈ(default) �켱����
		for (int i = 0; i < 3; i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		
		//#2. �켱���� ����
		for (int i = 0; i < 10; i++) {
			Thread thread = new MyThread();
			thread.setName(i + " ��° ������");
			if (i == 9)
				thread.setPriority(Thread.MAX_PRIORITY);
			thread.start();
		}
				
	}
}

