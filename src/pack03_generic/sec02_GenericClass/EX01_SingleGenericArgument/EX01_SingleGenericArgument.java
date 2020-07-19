package pack03_generic.sec02_GenericClass.EX01_SingleGenericArgument;

/*제네릭 타입변수 1개를 가진 제네릭클래스의 선언 및 활용*/

class MyClass<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class EX01_SingleGenericArgument {
	public static void main(String[] args) {
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("안녕");
		System.out.println(mc1.get());// "안녕"
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.set(100);
		System.out.println(mc2.get());// 100
		MyClass<Integer> mc3 = new MyClass<>();
		//mc3.set("안녕"); 	//문법오류(syntax error)
		                	//강한 타입체크
	}
}
