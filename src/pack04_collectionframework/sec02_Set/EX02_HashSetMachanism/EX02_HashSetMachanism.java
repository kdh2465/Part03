package pack04_collectionframework.sec02_Set.EX02_HashSetMachanism;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*HashSet<E>에서의 중복확인 메커니즘*/

//#1. CASE1. equals(): 오버라이딩 X + hashcode(): 오버라이딩 X
class A {
	int data;
	public A(int data) {
		this.data = data;
	}
}

//#2. CASE2. equals(): 오버라이딩 O + hashcode(): 오버라이딩 X
class B {
	int data;
	public B(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof B) {
			if (this.data == ((B) obj).data)
				return true;
		}
		return false;
	}
}

//#3. CASE3. equals(): 오버라이딩 O + hashcode(): 오버라이딩 O
class C {
	int data;
	public C(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof C) {
			if (this.data == ((C) obj).data)
				return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(data); // data
	}
}

public class EX02_HashSetMachanism {
	public static void main(String[] args) {
		//#1. CASE1. equals(): 오버라이딩 X + hashcode(): 오버라이딩 X
		Set<A> hashSet1 = new HashSet<>();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1==a2); //false
		System.out.println(a1.equals(a2)); //false
		System.out.println(a1.hashCode() + " " + a2.hashCode());
		hashSet1.add(a1);
		hashSet1.add(a2);
		System.out.println(hashSet1.size()); //2 (다른 객체)
		
		//#2. CASE2. equals(): 오버라이딩 O + hashcode(): 오버라이딩 X
		Set<B> hashSet2 = new HashSet<>();
		B b1 = new B(3);
		B b2 = new B(3);
		System.out.println(b1==b2); //false
		System.out.println(b1.equals(b2)); //true
		System.out.println(b1.hashCode() + " " + b2.hashCode());
		hashSet2.add(b1);
		hashSet2.add(b2);
		System.out.println(hashSet2.size()); //2 (다른 객체)

		//#3. CASE3. equals(): 오버라이딩 O + hashcode(): 오버라이딩 O
		Set<C> hashSet3 = new HashSet<>();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1==c2); //false
		System.out.println(c1.equals(c2)); //true
		System.out.println(c1.hashCode() + " " + c2.hashCode());
		hashSet3.add(c1);
		hashSet3.add(c2);
		System.out.println(hashSet3.size()); //1 (같은 객체)
	}
}
