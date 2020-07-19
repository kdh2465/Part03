package pack04_collectionframework.sec03_Map.EX06_TreeMapMethod_2;

import java.util.Comparator;
import java.util.TreeMap;

class MyClass {
	int data1;
	int data2;
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
}

class MyComparableClass implements Comparable<MyComparableClass> {
	int data1;
	int data2;
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public int compareTo(MyComparableClass m) {
		if (data1 < m.data1) {
			return -1;
		} else if (data1 == m.data1) {
			return 0;
		} else
			return 1;
	}
}

public class EX06_TreeMapMethod_2 {
	public static void main(String[] args) {
		
		//#1. Integer ũ�� ��
		TreeMap<Integer, String> treeMap1 = new TreeMap<Integer, String>();
		Integer intValue1 = new Integer(20);
		Integer intValue2 = new Integer(10);
		// intValue1 > intValue2
		treeMap1.put(intValue1, "������");
		treeMap1.put(intValue2, "���ٶ�");
		System.out.println(treeMap1.toString()); //{10=���ٶ�, 20=������}
		
		//#2. String ũ�� ��
		TreeMap<String, Integer> treeMap2 = new TreeMap<String, Integer>();
		String str1 = "����";
		String str2 = "�ٶ�";
		// str1 < str2
		treeMap2.put(str1, 10);
		treeMap2.put(str2, 20);
		System.out.println(treeMap2.toString()); //{����=20, �ٶ�=10}
		
		/*
		//#3. MyClass ��ü�� Key�� ���
		TreeMap<MyClass, String> treeMap3 = new TreeMap<>();
		MyClass myClass1 = new MyClass(2,5);
		MyClass myClass2 = new MyClass(3,3);
		// myclass1 ?? myclass2
		//treeMap3.put(myClass1, "������");         //���ܹ߻�
		//treeMap3.put(myClass2, "������");         //���ܹ߻�
		//System.out.println(treeMap3.toString()); //���ܹ߻�
		*/
		
		//#4. MyComparableClass ũ�� �� (���#1)
		TreeMap<MyComparableClass, String> treeMap4 = new TreeMap<>();
		MyComparableClass myComparableClass1 = new MyComparableClass(2,5);
		MyComparableClass myComparableClass2 = new MyComparableClass(3,3);
		treeMap4.put(myComparableClass1, "������");
		treeMap4.put(myComparableClass2, "���ٶ�");
		for(MyComparableClass mycomp : treeMap4.keySet()) {
		  System.out.println(mycomp.data1); //2, 3
		}
		
		//#5. MyClass ũ�� �� (Comparator<T> ��ü ������ ����)
		TreeMap<MyClass, String> treeMap5 = new TreeMap<>(new Comparator<MyClass>() {
			@Override
			public int compare(MyClass o1, MyClass o2) {
				if(o1.data1 < o2.data1) return -1;
				else if(o1.data1 == o2.data1) return 0;
				else return 1;
			}
		});
		MyClass myClass1 = new MyClass(2,5);
		MyClass myClass2 = new MyClass(3,3);
		treeMap5.put(myClass1, "������");                 
		treeMap5.put(myClass2, "���ٶ�");   
		for(MyClass mc : treeMap5.keySet()) {
		  System.out.println(mc.data1); //2, 3
		}
	}
}
