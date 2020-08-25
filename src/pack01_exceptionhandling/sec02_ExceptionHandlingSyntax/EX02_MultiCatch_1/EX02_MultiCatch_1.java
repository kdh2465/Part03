package pack01_exceptionhandling.sec02_ExceptionHandlingSyntax.EX02_MultiCatch_1;

/*두 개의 try-catch 구문과 하나의 다중 catch 구문의 비교*/

public class EX02_MultiCatch_1 {
	public static void main(String[] args) {
		
		//#1. 단일 try-catch 문
		try {
			System.out.println(3/0);
		} catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		}
		finally {
			System.out.println("프로그램 종료");
		}
		
		try {
			int a = Integer.parseInt("20A");
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		finally {
			System.out.println("프로그램 종료");			
		}
		
		//#2. 다중 catch 구문
		try {
			System.out.println(3/0);
			int a = Integer.parseInt("20A");
		}
		catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		}
		catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		finally {
			System.out.println("프로그램 종료");			
		}		
	}
}
