package pack01_exceptionhandling.sec02_ExceptionHandlingSyntax.EX03_MultiCatch_2;

/*���� catch �������� catch ����� �ùٸ� ����*/

public class EX03_MultiCatch_2 {
	public static void main(String[] args) {
		
		//#1. catch �� ���� (�߸��� ����)
/*
		try {
			System.out.println(3/0);
			int a = Integer.parseInt("20A");
		}
		catch(Exception e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		}
		catch(ArithmeticException e) { //����
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
		}
*/
		
		//#2. catch �� ���� (�ùٸ� ����)		
		try {
			System.out.println(3/0);
			int a = Integer.parseInt("20A");
		}		
		catch(ArithmeticException e) { //����
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
		}
		catch(Exception e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		}
		
	}
}
