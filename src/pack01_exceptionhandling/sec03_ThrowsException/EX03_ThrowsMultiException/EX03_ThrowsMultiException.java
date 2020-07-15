package pack01_exceptionhandling.sec03_ThrowsException.EX03_ThrowsMultiException;

/*���� ���� ���� �Ѳ����� �����ϱ�*/

//#1. ���� �޼��忡�� ���� ����ó���� �ϴ� ���
class A {
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000);
		} catch (InterruptedException | ClassNotFoundException e) {
			//����ó�� ����
		}
	}
}
//#2. ȣ��޼���� ���� ����ó���� �� ������ ���
class B {
	void abc() {
		try {
			bcd();
		} catch (InterruptedException | ClassNotFoundException e) {
			//����ó�� ����
		}
	}
	void bcd() throws InterruptedException, ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
}
public class EX03_ThrowsMultiException {
	public static void main(String[] args) {		
	}
}
