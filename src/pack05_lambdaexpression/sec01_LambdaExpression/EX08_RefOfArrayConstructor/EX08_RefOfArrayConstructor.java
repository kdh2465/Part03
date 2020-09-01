package pack05_lamdaexpression.sec01_LambdaExpression.EX08_RefOfArrayConstructor;

/*활용#3-1. 배열의 생성자 참조*/

interface A {
	int[] abc(int len);
}

public class EX08_RefOfArrayConstructor {
	public static void main(String[] args) {
						
		// #배열 생성자 참조
		// #1. 익명이너클래스 표현
		A a1 = new A() {
			public int[] abc(int len) {
				return new int[len];
			}
		};

		// #2. 일반 람다식 표현
		A a2 = (len)->(new int[len]);
		
		// #3. 배열 생성자 참조 표현
		A a3 = int[]::new;
		
		int [] array1 = a1.abc(3); System.out.println(array1.length);
		int [] array2 = a1.abc(3); System.out.println(array2.length);
		int [] array3 = a1.abc(3); System.out.println(array3.length);

	}
}
