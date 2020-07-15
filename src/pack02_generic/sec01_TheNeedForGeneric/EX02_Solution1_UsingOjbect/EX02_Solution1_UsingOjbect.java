package pack02_generic.sec01_TheNeedForGeneric.EX02_Solution1_UsingOjbect;

/*해결책 1. Object를 사용한 다양한 객체의 저장 및 추가적인 문제점*/

class Apple{ }
class Pencil{ }

//# Good 필드를 Object로 구성하여 모든 타입을 get/set할 수 있도록 함
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
		//Apple 저장 
		Goods goods1 = new Goods();
		goods1.set(new Apple());
		Apple apple = (Apple)goods1.get();
		
		//Pencil 저장
		Goods goods2 = new Goods();
		goods2.set(new Pencil());
		Pencil pencil = (Pencil)goods2.get();		
		
		/*
		//잘못된 캐스팅 (약한 타입체크)
		Goods goods3 = new Goods();
		goods3.set(new Apple());
		Pencil pen = (Pencil)goods3.get(); //classcastException
		*/
	}
}
