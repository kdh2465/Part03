package pack02_generic.sec03_GenericMethod.EX01_GenericMethod;

/*�Ϲ�Ŭ���� ���ο� ���ԵǴ� ���׸� �޼���*/

class GenericMethods {
	public <T> T method1(T t) {
		return t; //���ο����� Object �޼��常 ��� ����
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
		
		String str1 = gm.<String>method1("�ȳ�");
		String str2 = gm.method1("�ȳ�");
		System.out.println(str1 + ", "+ str2);//�ȳ�, �ȳ�
		
		boolean bool1 = gm.<Double>method2(2.5,2.5);
		boolean bool2 = gm.method2(2.5,2.5);
		System.out.println(bool1 + ", "+ bool2);//true, true
		
		gm.<String, Integer>method3("����", 80); //���� : 80
		gm.method3("����", 80); //���� : 80
	}
}
