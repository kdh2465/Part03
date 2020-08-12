package pack01_exceptionhandling.sec02_ExceptionHandlingSyntax.EX05_TryWithResource_1;

import java.io.IOException;
import java.io.InputStreamReader;

/*���ҽ� �ڵ� ���� ����� ���Ե� try with resource ���� */

public class EX05_TryWithResource_1 {
	public static void main(String[] args) {
		
		//����. System.in�� ���ҽ��� �����ϸ� ���Ŀ��� �ܼ� �Է� �Ұ�		
		//#1. try with resource ������ �̿��ؼ� �ڵ����� ����
		try (InputStreamReader isr1=new InputStreamReader(System.in);){			
			char input = (char)isr1.read();
			System.out.println("�Է±��� = "+input);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		//#2. ���ҽ��� ����ϰ� finally���� ���ҽ� �����ϱ�
		InputStreamReader isr2=null;
		try {
			isr2=new InputStreamReader(System.in);
			char input = (char)isr2.read();
			System.out.println("�Է±��� = "+input);
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
