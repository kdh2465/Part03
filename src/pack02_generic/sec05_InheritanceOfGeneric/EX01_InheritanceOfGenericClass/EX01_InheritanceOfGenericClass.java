package pack02_generic.sec05_InheritanceOfGeneric.EX01_InheritanceOfGenericClass;

/*제네릭 클래스의 상속*/

class Parent<T> {
	T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

class Child1<T> extends Parent<T> {

}

class Child2<T, V> extends Parent<T> {
	V v;
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}	
}	
	
public class EX01_InheritanceOfGenericClass {
	public static void main(String[] args) {
		//#1. 부모제네릭 클래스
		Parent<String> p = new Parent<>();
		p.setT("부모제네릭클래스");
		System.out.println(p.getT());
		
		//#2. 자식1제네릭 클래스
		Child1<String> c1 = new Child1<>();
		c1.setT("자식1 제네릭클래스");
		System.out.println(c1.getT());
		
		//#3. 자식2제네릭 클래스
		Child2<String, Integer> c2 = new Child2<>();
		c2.setT("자식2 제네릭클래스");
		c2.setV(100);
		System.out.println(c2.getT());
		System.out.println(c2.getV());
	}
}
