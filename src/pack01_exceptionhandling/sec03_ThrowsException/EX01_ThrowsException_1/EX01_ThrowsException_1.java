package pack01_exceptionhandling.sec03_ThrowsException.EX01_ThrowsException_1;

/*���� ����ó���� �ϴ� ���� ȣ��޼���� ���ܸ� �����ϴ� ���*/

//#1. ���� �޼��忡�� ���� ����ó���� �ϴ� ���
class A {
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			//����ó�� ����
		}
	}
}
//#2. ȣ��޼���� ���ܸ� ������ ���
class B {
	void abc() {
		try {
			bcd();
		} catch (InterruptedException e) {
			//����ó�� ����
		}
	}
	void bcd() throws InterruptedException {
		Thread.sleep(1000);	
	}
}

public class EX01_ThrowsException_1 {
	public static void main(String[] args) {		
	}
}
