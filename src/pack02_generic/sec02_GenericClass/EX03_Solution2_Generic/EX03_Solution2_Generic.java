package pack02_generic.sec02_GenericClass.EX03_Solution2_Generic;

/*해결책 2. 제네릭 클래스를 사용한 다양한 객체의 저장*/

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
		
		//#.goods1은 Apple 저장용으로 객체 생성
		Goods<Apple> goods1 = new Goods<Apple>();
		goods1.set(new Apple());
		Apple apple = goods1.get();
		
		//#.goods2는 Pencil 저장용으로 객체 생성
		Goods<Pencil> goods2 = new Goods<Pencil>();
		goods2.set(new Pencil());
		Pencil pencil = goods2.get();	
		
		/*
		//강한 타입 체크
		Goods<Apple> goods3 = new Goods<Apple>();
		goods3.set(new Apple());
		Pencil pen = goods3.get(); //syntax 에러
		*/
	}
}
