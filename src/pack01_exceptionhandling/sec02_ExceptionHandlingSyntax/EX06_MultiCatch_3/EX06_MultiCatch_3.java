package pack01_exceptionhandling.sec02_ExceptionHandlingSyntax.EX06_MultiCatch_3;

public class EX06_MultiCatch_3 {
	public static void main(String[] args) {
		
		//#1. catch ���� ���� ó���� ���		
		try {
			System.out.println(3/0);
			int a = Integer.parseInt("20A");
		}		
		catch(ArithmeticException e) { //����
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
		}
		catch(NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		}
		
		//#2. catch ���� �ϳ��� ������ ���		
		try {
			System.out.println(3/0);
			int a = Integer.parseInt("20A");
		}		
		catch(ArithmeticException | NumberFormatException e) { //����
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
		}
			
	}
}
