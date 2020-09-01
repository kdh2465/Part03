package pack05_lambdaexpression.sec02_FunctionalInterfacesInJavaAPI.EX02_Supplier_FucntionalInterface;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

/*Supplier<T> 함수형 인터페이스 (자바 API 제공)*/

public class EX02_Supplier_FucntionalInterface {
	public static void main(String[] args) {
		
		//#1. Supplier<T> 의 익명이너클래스 표현
		Supplier<String> s = new Supplier<String>() {
			@Override
			public String get() {				
				return "Supplier<T> 함수형 인터페이스";
			}
		};
		System.out.println(s.get()); //Supplier<T> 함수형 인터페이스
		
		//#2. 기본 Supplier<T> 함수형 인터페이스의 람다식 표현
		//@2-1. 기본형 Supplier
		Supplier<String> s1 = ()->"Supplier<T> 함수형 인터페이스"; 
		System.out.println(s1.get()); //Supplier<T> 함수형 인터페이스

		//@2-2. 확장 Supplier<T> 함수형 인터페이스의 람다식 표현	
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
