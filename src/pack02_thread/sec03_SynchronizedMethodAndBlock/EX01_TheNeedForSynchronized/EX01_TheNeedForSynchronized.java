package pack02_thread.sec03_SynchronizedMethodAndBlock.EX01_TheNeedForSynchronized;

/*동기화의 필요성 : 동기화를 사용하지 않은 경우 발생하는 문제점*/

//#. 공유객체
class MyData {
	int data = 3;
		
	public void plusData() {
		int mydata = data; //데이터를 바로 가져와 2초 뒤 결과값 저장
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {		}
		data=mydata+1;
	}
}

//# 공유객체 사용 쓰레드
class PlusThread extends Thread {
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "실행결과: " + myData.data);
	}
}

public class EX01_TheNeedForSynchronized {
	public static void main(String[] args) {
	    //#공유객체
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
