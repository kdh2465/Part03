package pack01_exceptionhandling.sec02_ExceptionHandlingSyntax.EX03_MultiCatch_2;

/*다중 catch 구문에서 catch 블록의 올바른 순서*/

public class EX03_MultiCatch_2 {
	public static void main(String[] args) {
		
		//#1. catch 블럭 순서 (잘못된 순서)
/*
		try {
			System.out.println(3/0);
			int a = Integer.parseInt("20A");
		}
		catch(Exception e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		catch(ArithmeticException e) { //오류
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		}
*/
		
		//#2. catch 블럭 순서 (올바른 순서)		
		try {
			System.out.println(3/0);
			int a = Integer.parseInt("20A");
		}		
		catch(ArithmeticException e) { //오류
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		}
		catch(Exception e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		
	}
}
