package pack05_lambdaexpression.sec02_FunctionalInterfacesInJavaAPI.EX03_Predicate_FucntionalInterface;
import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

/*Predicate<T> �Լ��� �������̽� (�ڹ� API ����)*/

public class EX03_Predicate_FucntionalInterface {
	public static void main(String[] args) {
		
		//#1. Predicate<T> �� �͸��̳�Ŭ���� ǥ��
		Predicate<String> p = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return (t.length()>0)? true:false;
			}
		};		
		System.out.println(p.test("�ȳ�")); //true
		
		//#2. �⺻ Predicate<T> �Լ��� �������̽��� ���ٽ� ǥ��
		//@2-1. �⺻�� Predicate
		Predicate<String> p1 = (str)->(str.length()>0)? true:false;
		System.out.println(p1.test("�ȳ�")); //true

		//@2-2. Ȯ�� Predicate<T> �Լ��� �������̽��� ���ٽ� ǥ��
		
		IntPredicate p2 = (num)->(num%2==0)? true:false;		
		LongPredicate p3 = (num)->(num>100)? true:false;
		DoublePredicate p4 = (num)->(num>0)? true:false;
		BiPredicate<String, String> p5 = (str1, str2)->str1.equals(str2);
		
		System.out.println(p2.test(2)); 			//true
		System.out.println(p3.test(85L)); 			//false
		System.out.println(p4.test(-5.8));  		//false
		System.out.println(p5.test("�ȳ�", "�ȳ�"));	//true
	
	}
}
