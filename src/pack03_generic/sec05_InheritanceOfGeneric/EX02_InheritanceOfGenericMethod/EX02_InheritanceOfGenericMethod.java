package pack03_generic.sec05_InheritanceOfGeneric.EX02_InheritanceOfGenericMethod;

/*���׸� �޼����� ���*/

class Parent {
	<T extends Number> void print(T t) {
		System.out.println(t);
	}
}

class Child extends Parent {

}

public class EX02_InheritanceOfGenericMethod {
	public static void main(String[] args) {
		
		//#1. �θ� Ŭ������ ���׸� �޼��� ���
		Parent p = new Parent();
		p.<Integer>print(10);
		p.print(10);
		
		//#2. �ڽ� Ŭ������ ���׸� �޼��� ���
		Child c = new Child();
		c.<Double>print(5.8);
		p.print(5.8);
			
	}
}
