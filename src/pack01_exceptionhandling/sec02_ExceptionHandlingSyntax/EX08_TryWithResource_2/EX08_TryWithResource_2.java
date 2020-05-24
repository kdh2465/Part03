package pack01_exceptionhandling.sec02_ExceptionHandlingSyntax.EX08_TryWithResource_2;

import java.io.IOException;
import java.io.InputStreamReader;

class A implements AutoCloseable{
	String resource ;
	A(String resource) {
		this.resource=resource;
	}
	void abc() throws Exception {
		
	}
	@Override
	public void close() throws Exception {
		if(resource !=null) {
			resource=null;
			System.out.println("리소스가 해제되었습니다.");
		}
	}
}
public class EX08_TryWithResource_2 {
	public static void main(String[] args) {
		
		//#1. 리소스를 사용하고 finally에서 리소스 해제하기
		A a1 = null;		
		try {
			a1=new A("특정파일");
			a1.abc();
		} catch (Exception e) {
			System.out.println("예외처리");
		} finally {
			if(a1.resource!=null)
				try {
					a1.close();
				} catch (Exception e) {}
		}
		
		//#2. try with resource 구문을 이용해서 자동으로 해제			
		try (A a2 = new A("특정파일");){
			a2.abc();
		} catch (Exception e) {
			System.out.println("예외처리");
		}		
	}
}
