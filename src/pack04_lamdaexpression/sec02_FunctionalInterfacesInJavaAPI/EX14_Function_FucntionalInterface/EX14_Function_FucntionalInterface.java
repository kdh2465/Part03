package pack04_lamdaexpression.sec02_FunctionalInterfacesInJavaAPI.EX14_Function_FucntionalInterface;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class EX14_Function_FucntionalInterface {
	public static void main(String[] args) {
		
		//#1. Function<T> 의 익명이너클래스 표현		
		Function<String, Integer> f = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {				
				return t.length();
			}
		};		
		System.out.println(f.apply("안녕")); //2 (문자열의 길이)
		
		//#2. 기본 Function<T> 함수형 인터페이스의 람다식 표현
		//@2-1. 기본형 Function
		Function<String, Integer> f1 = str->str.length();
		System.out.println(f1.apply("안녕")); //2 (문자열의 길이)

		//@2-2. 확장 Function<T> 함수형 인터페이스의 람다식 표현 		
		IntFunction<Double> f2 = (num)->(double)num; //int->double		
		LongFunction<String> f3 = (num)->String.valueOf(num);//long->문자열
		DoubleFunction<Integer> f4 = (num)->(int)num; //double->int
		BiFunction<String, Integer, String> f5 = (name, age)->"이름: "+name+", 나이 : "+age;
		System.out.println(f2.apply(10));	//10.0
		System.out.println(f3.apply(20L));	//20
		System.out.println(f4.apply(30.5));	//30
		System.out.println(f5.apply("홍길동", 16));//이름: 홍길동, 나이 : 16
		
		ToIntFunction<String> f6 = (str)->str.length();			//str->int
		ToLongFunction<Double> f7 = (num)->num.longValue(); 	//double->long
		ToDoubleFunction<Integer> f8 = (num)->num/100.0;		//int->double
		System.out.println(f6.applyAsInt("반갑습니다."));	//6
		System.out.println(f7.applyAsLong(58.254));		//58
		System.out.println(f8.applyAsDouble(250));		//2.5
		
	}
}
