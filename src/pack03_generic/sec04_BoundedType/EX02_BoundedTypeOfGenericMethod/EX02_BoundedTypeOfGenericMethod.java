package pack03_generic.sec04_BoundedType.EX02_BoundedTypeOfGenericMethod;

/*제네릭 메서드에서의 제네릭 타입 제한 범위 설정*/

class A {
	public <T extends String> void method1(T t) {
	    System.out.println(t.charAt(0));
	}
}

interface MyInterface{
	public abstract void print();
}

class B {
	public <T extends MyInterface> void method1(T t) {
	    t.print();
	}
}

public class EX02_BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.method1("안녕"); //안
		
		B b = new B();
		b.method1(new MyInterface() {
			@Override
			public void print() {
				System.out.println("print() 구현");
			}
		});
	}
}
