package pack01_exceptionhandling.sec02_ExceptionHandlingSyntax.EX04_MultiCatch_3;

/*예외의 OR(|) 연산으로 구성한 다중 catch 구문*/

public class EX04_MultiCatch_3 {
	public static void main(String[] args) {
		
		//#1. catch블록을 각각 처리한 경우
		try {
			System.out.println(3/1);
			int num = Integer.parseInt("10A");			
		}	
		catch(ArithmeticException e) {
			System.out.println("예외가 발생했습니다.");			
		}
		catch(NumberFormatException e) {
			System.out.println("예외가 발생했습니다.");			
		}


		//#2. catch 블록을 하나로 통일한 경우 		
		try {
			System.out.println(3/1);
			int num = Integer.parseInt("10A");			
		}		
		catch(ArithmeticException | NumberFormatException e) {
			System.out.println("예외가 발생했습니다.");			
		}			
	}
}
