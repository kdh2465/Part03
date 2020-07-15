package pack03_collectionframework.sec03_Map.EX02_HashMapMachanism;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

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

public class EX02_HashMapMachanism {
	public static void main(String[] args) {
		
		//#1. CASE1. equals(): 오버라이딩 X + hashcode(): 오버라이딩 X
		Map<A, String> hashMap1 = new HashMap<A, String>();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1==a2); //false
		System.out.println(a1.equals(a2)); //false
		System.out.println(a1.hashCode() + " " + a2.hashCode());
		hashMap1.put(a1, "첫번째");
		hashMap1.put(a2, "두번째");
		System.out.println(hashMap1.size()); //2 (다른 객체)
		
		//#2. CASE2. equals(): 오버라이딩 O + hashcode(): 오버라이딩 X
		Map<B, String> hashMap2 = new HashMap<>();
		B b1 = new B(3);
		B b2 = new B(3);
		System.out.println(b1==b2); //false
		System.out.println(b1.equals(b2)); //true
		System.out.println(b1.hashCode() + " " + b2.hashCode());
		hashMap2.put(b1, "첫번째");
		hashMap2.put(b2, "두번째");
		System.out.println(hashMap2.size()); //2 (다른 객체)

		//#3. CASE3. equals(): 오버라이딩 O + hashcode(): 오버라이딩 O
		Map<C, String> hashMap3 = new HashMap<>();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1==c2); //false
		System.out.println(c1.equals(c2)); //true
		System.out.println(c1.hashCode() + " " + c2.hashCode());
		hashMap3.put(c1, "첫번째");
		hashMap3.put(c2, "두번째");
		System.out.println(hashMap3.size()); //1 (같은 객체)

	}
}
