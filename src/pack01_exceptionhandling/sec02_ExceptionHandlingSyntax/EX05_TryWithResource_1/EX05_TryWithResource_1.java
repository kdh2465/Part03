package pack01_exceptionhandling.sec02_ExceptionHandlingSyntax.EX05_TryWithResource_1;

import java.io.IOException;
import java.io.InputStreamReader;

/*리소스 자동 해제 기능이 포함된 try with resource 구문 */

public class EX05_TryWithResource_1 {
	public static void main(String[] args) {
		
		//참고. System.in은 리소스를 해지하면 이후에는 콘솔 입력 불가		
		//#1. try with resource 구문을 이용해서 자동으로 해제
		try (InputStreamReader isr1=new InputStreamReader(System.in);){			
			char input = (char)isr1.read();
			System.out.println("입력글자 = "+input);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		//#2. 리소스를 사용하고 finally에서 리소스 해제하기
		InputStreamReader isr2=null;
		try {
			isr2=new InputStreamReader(System.in);
			char input = (char)isr2.read();
			System.out.println("입력글자 = "+input);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(isr2!=null) {
				try {
					isr2.close();
				} catch (IOException e) { }
			}
		}		
				
	}
}
