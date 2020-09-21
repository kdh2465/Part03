package pack02_thread.sec04_TheradStates.EX07_Waiting_WaitNotify_2;

/*wait(), notify()를 이용한 쓰레드의 교차 실행*/

class DataBox {
	boolean isEmpty=true;
	int data;
	synchronized void inputData(int data) throws InterruptedException {
		if(!isEmpty) {			
			wait(); 
		}
		isEmpty=false; 
		this.data = data;		
		System.out.println("입력 데이터: "+data);		 
		notify();
	}
	synchronized void outputData() throws InterruptedException {
		if(isEmpty) {
			wait();
		}
		isEmpty=true;
		System.out.println("출력 데이터: "+data);		
		notify();
	}
}

public class EX07_Waiting_WaitNotify_2 {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						dataBox.inputData(i);
					} catch (InterruptedException e) {}
				}
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						dataBox.outputData();
					} catch (InterruptedException e) {}
				}
			}
		};

		t1.start();
		t2.start();
	}

}
