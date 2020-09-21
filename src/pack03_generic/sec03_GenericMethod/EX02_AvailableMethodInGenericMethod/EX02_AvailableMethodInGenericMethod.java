package pack03_generic.sec03_GenericMethod.EX02_AvailableMethodInGenericMethod;

/*제네릭 메서드 내부에서 사용가능한 메서드*/

class A{
	public <T> void method1(T t) {
		//System.out.println(t.length());//(불가능)
		System.out.println(t.equals("안녕")); //가능(Object 메서드)
	}
}

public class EX02_AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.<String>method1("안녕");
	}
}
