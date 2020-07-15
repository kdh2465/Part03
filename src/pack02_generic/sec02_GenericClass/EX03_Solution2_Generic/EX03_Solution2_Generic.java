package pack02_generic.sec02_GenericClass.EX03_Solution2_Generic;

/*�ذ�å 2. ���׸� Ŭ������ ����� �پ��� ��ü�� ����*/

class Apple{ }
class Pencil{ }

class Goods<T>{
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}	
}

public class EX03_Solution2_Generic {
	public static void main(String[] args) {
		
		//#.goods1�� Apple ��������� ��ü ����
		Goods<Apple> goods1 = new Goods<Apple>();
		goods1.set(new Apple());
		Apple apple = goods1.get();
		
		//#.goods2�� Pencil ��������� ��ü ����
		Goods<Pencil> goods2 = new Goods<Pencil>();
		goods2.set(new Pencil());
		Pencil pencil = goods2.get();	
		
		/*
		//���� Ÿ�� üũ
		Goods<Apple> goods3 = new Goods<Apple>();
		goods3.set(new Apple());
		Pencil pen = goods3.get(); //syntax ����
		*/
	}
}
