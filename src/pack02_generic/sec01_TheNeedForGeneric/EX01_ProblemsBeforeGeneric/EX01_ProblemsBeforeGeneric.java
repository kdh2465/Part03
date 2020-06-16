package pack02_generic.sec01_TheNeedForGeneric.EX01_ProblemsBeforeGeneric;

//#1. Apple Ŭ������ Apple�� ���� �� �ִ� Ŭ����
class Apple{ }
class Goods1{ 
	private Apple apple = new Apple();
	public Apple get() {
		return apple;
	}
	public void set(Apple apple) {
		this.apple = apple;
	}	
}

//#2. Pencil Ŭ������ Pencil�� ���� �� �ִ� Ŭ����
class Pencil{ }
class Goods2{
	private Pencil pencil = new Pencil();
	public Pencil get() {
		return pencil;
	} 
	public void set(Pencil pencil) {
		this.pencil = pencil;
	}	
}

public class EX01_ProblemsBeforeGeneric {
	public static void main(String[] args) {
		//Goods1�� Apple�� ��� ����
		Goods1 goods1 = new Goods1(); 
		goods1.set(new Apple());
		Apple apple = goods1.get(); 
		
		//Goods2�� Pencil�� ��� ����
		Goods2 goods2 = new Goods2();
		goods2.set(new Pencil());
		Pencil pencil = goods2.get();
	}
}
