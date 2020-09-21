package pack05_lambdaexpression.sec02_FunctionalInterfacesInJavaAPI.EX01_Consumer_FucntionalInterface;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/*Consumer<T> 함수형 인터페이스 (자바 API 제공)*/

public class EX01_Consumer_FucntionalInterface {
	public static void main(String[] args) {
		
		//#1. Consumer<T>의 익명이너클래스 표현
		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}			
		};
		c.accept("Consumer<T> 함수형 인터페이스");
		
		//#2. 기본 Consumer<T> 함수형 인터페이스의 람다식 표현
		//@2-1. 기본형 Consumer
		Consumer<String> c1 = (str)->System.out.println(str); 
		c1.accept("Consumer<T> 함수형 인터페이스");

		//@2-2. 확장 Consumer<T> 함수형 인터페이스의 람다식 표현	
		IntConsumer c2 = (num)->System.out.println("int 값="+num);		
		LongConsumer c3 = (num)->System.out.println("Long 값="+num);
		DoubleConsumer c4 = (num)->System.out.println("Double 값="+num);		
		BiConsumer<String, Integer> c5 = (name, age)->System.out.println("이름:"+name + " 나이:"+age);
		c2.accept(3);
		c3.accept(5L);
		c4.accept(7.8);
		c5.accept("홍길동", 16);		
		
	}
}
