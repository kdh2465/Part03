package pack02_thread.sec03_SynchronizedMethodAndBlock.EX02_SynchronizedMethod;

/*����ȭ �޼��带 Ȱ���� ����ȭ ����*/

//#. ������ü 
class MyData {
	int data = 3;
		
	public synchronized void plusData() {
		int mydata = data; //�����͸� �ٷ� ������ 2�� �� ����� ����
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {		}
		data=mydata+1;
	}
}

//# ������ü ��� ������
class PlusThread extends Thread {
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "������: " + myData.data);
	}
}


public class EX02_SynchronizedMethod {
	public static void main(String[] args) {
	    //#������ü
		MyData myData = new MyData();
		
		//#plusThread1
	    Thread plusThread1 = new PlusThread(myData);
	    plusThread1.setName("plusThread1");
	    plusThread1.start();
	    
	    try { Thread.sleep(1000); } 
	    catch (InterruptedException e) {}
	    
	    //#plusThread2
	    Thread plusThread2 = new PlusThread(myData);
	    plusThread2.setName("plusThread2");
	    plusThread2.start();
	}
}
