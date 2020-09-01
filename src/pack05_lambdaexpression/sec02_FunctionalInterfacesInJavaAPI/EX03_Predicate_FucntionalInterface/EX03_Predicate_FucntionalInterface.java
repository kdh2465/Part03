package pack05_lambdaexpression.sec02_FunctionalInterfacesInJavaAPI.EX03_Predicate_FucntionalInterface;
import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

/*Predicate<T> 함수형 인터페이스 (자바 API 제공)*/

public class EX03_Predicate_FucntionalInterface {
	public static void main(String[] args) {
		
		//#1. Predicate<T> 의 익명이너클래스 표현
		Predicate<String> p = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return (t.length()>0)? true:false;
			}
		};		
		System.out.println(p.test("안녕")); //true
		
		//#2. 기본 Predicate<T> 함수형 인터페이스의 람다식 표현
		//@2-1. 기본형 Predicate
		Predicate<String> p1 = (str)->(str.length()>0)? true:false;
		System.out.println(p1.test("안녕")); //true

		//@2-2. 확장 Predicate<T> 함수형 인터페이스의 람다식 표현
		
		IntPredicate p2 = (num)->(num%2==0)? true:false;		
		LongPredicate p3 = (num)->(num>100)? true:false;
		DoublePredicate p4 = (num)->(num>0)? true:false;
		BiPredicate<String, String> p5 = (str1, str2)->str1.equals(str2);
		
		System.out.println(p2.test(2)); 			//true
		System.out.println(p3.test(85L)); 			//false
		System.out.println(p4.test(-5.8));  		//false
		System.out.println(p5.test("안녕", "안녕"));	//true
	
	}
}
