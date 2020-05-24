package pack02_generic.sec05_InheritanceOfGeneric.EX12_InheritanceOfGenericMethod;

class Parent {
	<T extends Number> void print(T t) {
		System.out.println(t);
	}
}

class Child extends Parent {

}

public class EX12_InheritanceOfGenericMethod {
	public static void main(String[] args) {
		
		//#1. 부모 클래스의 제네릭 메서드 사용
		Parent p = new Parent();
		p.<Integer>print(10);
		p.print(10);
		
		//#2. 자식 클래스의 제네릭 메서드 사용
		Child c = new Child();
		c.<Double>print(5.8);
		p.print(5.8);
			
	}
}
