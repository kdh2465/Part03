package pack03_generic.sec04_BoundedType.EX03_BoundTypeOfInputArguments;

/*메서드 매개변수로서 제네릭 클래스의 타입 제한 범위 설정*/

class A{}
class B extends A{}
class C extends B{}
class D extends C{}

class Goods<T>{
  private T t;
  public T get() {
    return t;
  }
  public void set(T t) {
    this.t = t;
  }
}

class Test {
	void method1(Goods<A> g) {} //#case1
	void method2(Goods<?> g) {} //#case2
	void method3(Goods<? extends B> g) {} //#case3
	void method4(Goods<? super B> g) {} //#case4
}

public class EX03_BoundTypeOfInputArguments {
	public static void main(String[] args) {
		Test t = new Test();
		//#1. Case1. method1(Goods<A> g)
		t.method1(new Goods<A>()); //O
//		t.method1(new Goods<B>()); //X
//		t.method1(new Goods<C>()); //X
//		t.method1(new Goods<D>()); //X
		
		//#2. Case2. method2(Goods<?> g)
		t.method2(new Goods<A>()); //O
		t.method2(new Goods<B>()); //O 
		t.method2(new Goods<C>()); //O 
		t.method2(new Goods<D>()); //O 
		
		//#3. Case3. method3(Goods<? extends B> g)
//		t.method3(new Goods<A>()); //X
		t.method3(new Goods<B>()); //O
		t.method3(new Goods<C>()); //O
		t.method3(new Goods<D>()); //O
		
		//#4. Case4. method4(Goods<? super B> g)
		t.method4(new Goods<A>()); //O
		t.method4(new Goods<B>()); //O
//		t.method4(new Goods<C>()); //X
//		t.method4(new Goods<D>()); //X

	}
}
