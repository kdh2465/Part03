package pack02_generic.sec03_GenericMethod.EX07_AvailableMethodInGenericMethod;

class A{
	public <T> void method1(T t) {
		//System.out.println(t.length());//(불가능)
		System.out.println(t.equals("안녕")); //가능(Object 메서드)
	}
}

public class EX07_AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.<String>method1("안녕");
	}
}
