package pack01_exceptionhandling.sec02_ExceptionHandlingSyntax.EX07_TryWithResource_1;

import java.io.IOException;
import java.io.InputStreamReader;

public class EX07_TryWithResource_1 {
	public static void main(String[] args) {
		
		//#1. ���ҽ��� ����ϰ� finally���� ���ҽ� �����ϱ�
		InputStreamReader isr1=null;
		try {
			isr1=new InputStreamReader(System.in);
			char input = (char)isr1.read();
			System.out.println("�Է±��� = "+input);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(isr1!=null) {
				try {
					isr1.close();
				} catch (IOException e) { }
			}
		}
		//����. System.in�� ���ҽ��� �����ϸ� ���Ŀ��� �ܼ� �Է� �Ұ� (����ؼ� �Է¹������� ������ ���� ��������)
		
		//#2. try with resource ������ �̿��ؼ� �ڵ����� ����
		try (InputStreamReader isr2=new InputStreamReader(System.in);){			
			char input = (char)isr2.read();
			System.out.println("�Է±��� = "+input);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
