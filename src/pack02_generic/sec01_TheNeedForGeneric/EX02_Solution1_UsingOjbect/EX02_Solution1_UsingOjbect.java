package pack02_generic.sec01_TheNeedForGeneric.EX02_Solution1_UsingOjbect;

/*�ذ�å 1. Object�� ����� �پ��� ��ü�� ���� �� �߰����� ������*/

class Apple{ }
class Pencil{ }

//# Good �ʵ带 Object�� �����Ͽ� ��� Ÿ���� get/set�� �� �ֵ��� ��
class Goods{
	private Object object = new Object();
	public Object get() {
		return object;
	}
	public void set(Object object) {
		this.object = object;
	}	
}

public class EX02_Solution1_UsingOjbect {
	public static void main(String[] args) {
		//Apple ���� 
		Goods goods1 = new Goods();
		goods1.set(new Apple());
		Apple apple = (Apple)goods1.get();
		
		//Pencil ����
		Goods goods2 = new Goods();
		goods2.set(new Pencil());
		Pencil pencil = (Pencil)goods2.get();		
		
		/*
		//�߸��� ĳ���� (���� Ÿ��üũ)
		Goods goods3 = new Goods();
		goods3.set(new Apple());
		Pencil pen = (Pencil)goods3.get(); //classcastException
		*/
	}
}
