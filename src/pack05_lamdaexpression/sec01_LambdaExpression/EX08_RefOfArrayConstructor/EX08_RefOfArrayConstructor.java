package pack05_lamdaexpression.sec01_LambdaExpression.EX08_RefOfArrayConstructor;

/*Ȱ��#3-1. �迭�� ������ ����*/

interface A {
	int[] abc(int len);
}

public class EX08_RefOfArrayConstructor {
	public static void main(String[] args) {
						
		// #�迭 ������ ����
		// #1. �͸��̳�Ŭ���� ǥ��
		A a1 = new A() {
			public int[] abc(int len) {
				return new int[len];
			}
		};

		// #2. �Ϲ� ���ٽ� ǥ��
		A a2 = (len)->(new int[len]);
		
		// #3. �迭 ������ ���� ǥ��
		A a3 = int[]::new;
		
		int [] array1 = a1.abc(3); System.out.println(array1.length);
		int [] array2 = a1.abc(3); System.out.println(array2.length);
		int [] array3 = a1.abc(3); System.out.println(array3.length);

	}
}
