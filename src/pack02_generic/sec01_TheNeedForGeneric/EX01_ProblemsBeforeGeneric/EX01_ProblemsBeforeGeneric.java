package pack02_generic.sec01_TheNeedForGeneric.EX01_ProblemsBeforeGeneric;

//#1. Apple 클래스와 Apple을 담을 수 있는 클래스
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

//#2. Pencil 클래스와 Pencil을 담을 수 있는 클래스
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
		//Goods1은 Apple만 사용 가능
		Goods1 goods1 = new Goods1(); 
		goods1.set(new Apple());
		Apple apple = goods1.get(); 
		
		//Goods2은 Pencil만 사용 가능
		Goods2 goods2 = new Goods2();
		goods2.set(new Pencil());
		Pencil pencil = goods2.get();
	}
}
