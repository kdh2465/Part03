package pack02_generic.sec02_GenericClass.EX03_SingleGenericArgument;

class MyClass<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class EX03_SingleGenericArgument {
	public static void main(String[] args) {
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("�ȳ�");
		System.out.println(mc1.get());// "�ȳ�"
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.set(100);
		System.out.println(mc2.get());// 100
		MyClass<Integer> mc3 = new MyClass<>();
		//mc3.set("�ȳ�"); 	//��������(syntax error)
		                	//���� Ÿ��üũ
	}
}
