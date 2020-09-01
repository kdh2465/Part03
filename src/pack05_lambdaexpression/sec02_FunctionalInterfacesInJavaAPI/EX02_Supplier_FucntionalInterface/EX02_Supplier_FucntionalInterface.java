package pack05_lambdaexpression.sec02_FunctionalInterfacesInJavaAPI.EX02_Supplier_FucntionalInterface;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

/*Supplier<T> �Լ��� �������̽� (�ڹ� API ����)*/

public class EX02_Supplier_FucntionalInterface {
	public static void main(String[] args) {
		
		//#1. Supplier<T> �� �͸��̳�Ŭ���� ǥ��
		Supplier<String> s = new Supplier<String>() {
			@Override
			public String get() {				
				return "Supplier<T> �Լ��� �������̽�";
			}
		};
		System.out.println(s.get()); //Supplier<T> �Լ��� �������̽�
		
		//#2. �⺻ Supplier<T> �Լ��� �������̽��� ���ٽ� ǥ��
		//@2-1. �⺻�� Supplier
		Supplier<String> s1 = ()->"Supplier<T> �Լ��� �������̽�"; 
		System.out.println(s1.get()); //Supplier<T> �Լ��� �������̽�

		//@2-2. Ȯ�� Supplier<T> �Լ��� �������̽��� ���ٽ� ǥ��	
		BooleanSupplier s2 = ()->false;
		IntSupplier s3 = ()->2+3;		
		LongSupplier s4 = ()->10L;
		DoubleSupplier s5 = ()->5.8;
		System.out.println(s2.getAsBoolean()); //false
		System.out.println(s3.getAsInt()); 	   //5
		System.out.println(s4.getAsLong());    //10
		System.out.println(s5.getAsDouble());  //5.8
	
	}
}
