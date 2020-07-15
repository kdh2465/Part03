package pack04_lamdaexpression.sec02_FunctionalInterfacesInJavaAPI.EX01_Consumer_FucntionalInterface;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class EX01_Consumer_FucntionalInterface {
	public static void main(String[] args) {
		
		//#1. Consumer<T>�� �͸��̳�Ŭ���� ǥ��
		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}			
		};
		c.accept("Consumer<T> �Լ��� �������̽�");
		
		//#2. �⺻ Consumer<T> �Լ��� �������̽��� ���ٽ� ǥ��
		//@2-1. �⺻�� Consumer
		Consumer<String> c1 = (str)->System.out.println(str); 
		c1.accept("Consumer<T> �Լ��� �������̽�");

		//@2-2. Ȯ�� Consumer<T> �Լ��� �������̽��� ���ٽ� ǥ��	
		IntConsumer c2 = (num)->System.out.println("int ��="+num);		
		LongConsumer c3 = (num)->System.out.println("Long ��="+num);
		DoubleConsumer c4 = (num)->System.out.println("Double ��="+num);		
		BiConsumer<String, Integer> c5 = (name, age)->System.out.println("�̸�:"+name + " ����:"+age);
		c2.accept(3);
		c3.accept(5L);
		c4.accept(7.8);
		c5.accept("ȫ�浿", 16);		
		
	}
}
