package pack05_lambdaexpression.sec01_LambdaExpression.EX02_FunctionToLambdaExpression;

/*함수적 인터페이스의 객체생성을 위한 람다식 표현방법*/

interface A{ //입력X, 출력x
	void method1();
}
interface B{ //입력O, 출력x
	void method2(int a);
}
interface C{ //입력X, 출력O
	int method3();
}
interface D{ //입력O, 출력O
	double method4(int a, double b);
}

public class EX02_FunctionToLambdaExpression {
	public static void main(String[] args) {
		
		//#함수(함수적인터페이스) --> 람다식
		
		//#1. 입력X, 출력x의 함수
		//@1-1. 익명이너클래스 표현
		A a1 = new A() { 
			@Override
			public void method1() {
				System.out.println("입력X, 출력x의 함수");				
			}
		};
		//@1-2. 람다식 표현
		A a2 = ()->{System.out.println("입력X, 출력x의 함수");};
		A a3 = ()-> System.out.println("입력X, 출력x의 함수"); //중괄호 삭제
		
		//#2. //입력O, 출력x의 함수
		//@2-1. 익명이너클래스 표현
		B b1 = new B() {
			public void method2(int a) {
				System.out.println(a);
			};
		};
		//@2-2. 람다식 표현
		B b2 = (int a)->{System.out.println(a);};
		B b3 = (a)->{System.out.println(a);};
		B b4 = (a)->System.out.println(a);
		B b5 = a->System.out.println(a);
		
		//#3. //입력x, 출력O의 함수
		//@3-1. 익명이너클래스 표현
		C c1 = new C() {
			@Override
			public int method3() {				
				return 4;
			}
		};
		//@3-2. 람다식 표현
		C c2 = ()->{return 4;};
		C c3 = ()->4;
		
		//#4. //입력x, 출력O의 함수
		//@4-1. 익명이너클래스 표현
		D d1 = new D() {
			@Override
			public double method4(int a, double b) {				
				return a+b;
			}
		};
		//@4-2. 람다식 표현
		D d2 = (int a, double b)->{return a+b;};
		D d3 = (a, b)->{return a+b;};
		D d4 = (a, b)->a+b;
		
	}
}
