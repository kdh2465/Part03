package pack02_thread.sec04_TheradStates.EX06_Waiting_WaitNotify_1;

/*����ȭ���� ����� ��� �������� �� �������� ���� ����*/

class DataBox {

	int data;
	synchronized void inputData(int data) throws InterruptedException {
		this.data = data;		
		System.out.println("�Է� ������: "+data);
	}
	synchronized void outputData() throws InterruptedException {		
		System.out.println("��� ������: "+data);
	}
}

public class EX06_Waiting_WaitNotify_1 {
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
