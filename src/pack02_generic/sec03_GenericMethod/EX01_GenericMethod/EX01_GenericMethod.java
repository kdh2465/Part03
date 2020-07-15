package pack02_generic.sec03_GenericMethod.EX01_GenericMethod;

/*일반클래스 내부에 포함되는 제네릭 메서드*/

class GenericMethods {
	public <T> T method1(T t) {
		return t; //내부에서는 Object 메서드만 사용 가능
	}
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);		
	}	
	public <K, V> void method3(K k , V v){
		System.out.print(k +" : ");
		System.out.println(v);
	}		
	/*
	public <T extends String, V extends Integer> T method3(T t, V v) {
		return (T)t.substring(v);
	}
	*/		
}
public class EX01_GenericMethod {
	public static void main(String[] args) {
		
		GenericMethods gm = new GenericMethods();
		
		String str1 = gm.<String>method1("안녕");
		String str2 = gm.method1("안녕");
		System.out.println(str1 + ", "+ str2);//안녕, 안녕
		
		boolean bool1 = gm.<Double>method2(2.5,2.5);
		boolean bool2 = gm.method2(2.5,2.5);
		System.out.println(bool1 + ", "+ bool2);//true, true
		
		gm.<String, Integer>method3("국어", 80); //국어 : 80
		gm.method3("국어", 80); //국어 : 80
	}
}
