package pack04_lamdaexpression.sec01_LambdaExpression.EX01_OOPvsFP;

/*객체 지향 프로그래밍 문법과 함수적 프로그래밍 문법*/

interface A {
	void abc();
}

class B implements A {
	public void abc() {
		System.out.println("메서드 내용");
	}
}


public class EX01_OOPvsFP {
	public static void main(String[] args) {
		//#1. 객체지향 프로그래밍 문법 1(case#1)
		A a1 = new B();
		a1.abc(); //메서드 내용
		
		//#2. 객체지향 프로그래밍 문법 2(case#2)
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("메서드 내용");			
			}
		};
		a2.abc();
		
		//#3. 함수적 프로그래밍 문법 (람다식)(case#3)
		A a3 = ()->{System.out.println("메서드 내용");};
		a3.abc();

	}
}
