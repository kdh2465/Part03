package pack01_exceptionhandling.sec02_ExceptionHandlingSyntax.EX07_TryWithResource_1;

import java.io.IOException;
import java.io.InputStreamReader;

public class EX07_TryWithResource_1 {
	public static void main(String[] args) {
		
		//#1. 리소스를 사용하고 finally에서 리소스 해제하기
		InputStreamReader isr1=null;
		try {
			isr1=new InputStreamReader(System.in);
			char input = (char)isr1.read();
			System.out.println("입력글자 = "+input);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(isr1!=null) {
				try {
					isr1.close();
				} catch (IOException e) { }
			}
		}
		//참고. System.in은 리소스를 해지하면 이후에는 콘솔 입력 불가 (계속해서 입력받으려면 해지는 제일 마지막에)
		
		//#2. try with resource 구문을 이용해서 자동으로 해제
		try (InputStreamReader isr2=new InputStreamReader(System.in);){			
			char input = (char)isr2.read();
			System.out.println("입력글자 = "+input);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
