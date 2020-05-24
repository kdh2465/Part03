package pack01_exceptionhandling.sec04_UserException.EX15_UserExceptionExample;

//#.������ ������ ��� �߻��ϴ� ���� Ŭ���� ����
class MinusException extends Exception {
	MinusException() {
	}
	MinusException(String s) {
		super(s); // �θ������ȣ��
	}
}
//#.������ 100�� �ʰ��ϴ� ��� �߻��ϴ� ���� Ŭ���� ����
class OverException extends Exception {
	OverException() {
	}
	OverException(String s) {
		super(s); // �θ������ȣ��
	}
}

class A {
	// #.������ 0~100 ������ �ƴ� ��� ���ܸ� �߻��ϴ� �޼���
	void checkScore(int score) throws MinusException, OverException {
		if (score < 0) {
			throw new MinusException("���ܹ߻�:������ �Է�");
		} else if (score > 100) {
			throw new OverException("���ܹ߻�:100�� �ʰ�");
		} else {
			System.out.println("�������� ���Դϴ�");
		}
	}
}

public class EX15_UserExceptionExample {
	//#. A ��ü�� checkScore �޼��带 ȣ���Ͽ� ����ó���ϴ� �޼���
	public static void main(String[] args) {

		A a = new A();		
		try {
			a.checkScore(85);
			a.checkScore(150); //���ܹ߻�
		} catch (MinusException | OverException e) {			
			System.out.println(e.getMessage());
		} 
	}
}
