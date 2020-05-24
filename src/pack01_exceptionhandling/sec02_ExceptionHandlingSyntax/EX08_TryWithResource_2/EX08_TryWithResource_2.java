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
			System.out.println("���ҽ��� �����Ǿ����ϴ�.");
		}
	}
}
public class EX08_TryWithResource_2 {
	public static void main(String[] args) {
		
		//#1. ���ҽ��� ����ϰ� finally���� ���ҽ� �����ϱ�
		A a1 = null;		
		try {
			a1=new A("Ư������");
			a1.abc();
		} catch (Exception e) {
			System.out.println("����ó��");
		} finally {
			if(a1.resource!=null)
				try {
					a1.close();
				} catch (Exception e) {}
		}
		
		//#2. try with resource ������ �̿��ؼ� �ڵ����� ����			
		try (A a2 = new A("Ư������");){
			a2.abc();
		} catch (Exception e) {
			System.out.println("����ó��");
		}		
	}
}
