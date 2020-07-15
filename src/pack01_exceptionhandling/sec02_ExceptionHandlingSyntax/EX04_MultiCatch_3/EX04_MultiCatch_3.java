package pack01_exceptionhandling.sec02_ExceptionHandlingSyntax.EX04_MultiCatch_3;

/*예외의 OR(|) 연산으로 구성한 다중 catch 구문*/

public class EX04_MultiCatch_3 {
	public static void main(String[] args) {
		
		//#1. catch 블럭을 각각 처리한 경우		
		try {
			System.out.println(3/0);
			int a = Integer.parseInt("20A");
		}		
		catch(ArithmeticException e) { //오류
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		}
		catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		
		//#2. catch 블럭을 하나로 통합한 경우		
		try {
			System.out.println(3/0);
			int a = Integer.parseInt("20A");
		}		
		catch(ArithmeticException | NumberFormatException e) { //오류
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		}
			
	}
}
