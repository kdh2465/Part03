package pack01_exceptionhandling.sec02_ExceptionHandlingSyntax.EX01_TryCatchFinally;

/*try-catch ������ try-catch-finally ������ ���� ��*/

public class EX01_TryCatchFinally {
	
	public static void main(String[] args) {
		
		//#1. try-catch		
		try {
			System.out.println(3/0);
			System.out.println("���α׷� ����");
		}
		catch(ArithmeticException e) {
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
			System.out.println("���α׷� ����");
		}
		
		//#2. try-catch-finally
		try {
			System.out.println(3/0);
		}
		catch(ArithmeticException e) {
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
		}
		finally {
			System.out.println("���α׷� ����");
		}		
		
	}
}
