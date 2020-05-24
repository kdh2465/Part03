package pack01_exceptionhandling.sec02_ExceptionHandlingSyntax.EX04_MultiCatch_1;

public class EX04_MultiCatch_1 {
	public static void main(String[] args) {
		
		//#1. ���� try-catch ��
		try {
			System.out.println(3/0);
		} catch(ArithmeticException e) {
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
		}
		finally {
			System.out.println("���α׷� ����");
			System.exit(0);
		}
		
		try {
			int a = Integer.parseInt("20A");
		} catch(NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		}
		finally {
			System.out.println("���α׷� ����");
			System.exit(0);
		}
		
		//#2. ���� catch ����
		try {
			System.out.println(3/0);
			int a = Integer.parseInt("20A");
		}
		catch(ArithmeticException e) {
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
		}
		catch(NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		}
		finally {
			System.out.println("���α׷� ����");
			System.exit(0);
		}		
	}
}
