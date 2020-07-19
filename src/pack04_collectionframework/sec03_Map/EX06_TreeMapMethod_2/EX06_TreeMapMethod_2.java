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
		
		//#1. Integer 크기 비교
		TreeMap<Integer, String> treeMap1 = new TreeMap<Integer, String>();
		Integer intValue1 = new Integer(20);
		Integer intValue2 = new Integer(10);
		// intValue1 > intValue2
		treeMap1.put(intValue1, "가나다");
		treeMap1.put(intValue2, "나다라");
		System.out.println(treeMap1.toString()); //{10=나다라, 20=가나다}
		
		//#2. String 크기 비교
		TreeMap<String, Integer> treeMap2 = new TreeMap<String, Integer>();
		String str1 = "가나";
		String str2 = "다라";
		// str1 < str2
		treeMap2.put(str1, 10);
		treeMap2.put(str2, 20);
		System.out.println(treeMap2.toString()); //{가나=20, 다라=10}
		
		/*
		//#3. MyClass 객체를 Key로 사용
		TreeMap<MyClass, String> treeMap3 = new TreeMap<>();
		MyClass myClass1 = new MyClass(2,5);
		MyClass myClass2 = new MyClass(3,3);
		// myclass1 ?? myclass2
		//treeMap3.put(myClass1, "가나다");         //예외발생
		//treeMap3.put(myClass2, "가나다");         //예외발생
		//System.out.println(treeMap3.toString()); //예외발생
		*/
		
		//#4. MyComparableClass 크기 비교 (방법#1)
		TreeMap<MyComparableClass, String> treeMap4 = new TreeMap<>();
		MyComparableClass myComparableClass1 = new MyComparableClass(2,5);
		MyComparableClass myComparableClass2 = new MyComparableClass(3,3);
		treeMap4.put(myComparableClass1, "가나다");
		treeMap4.put(myComparableClass2, "나다라");
		for(MyComparableClass mycomp : treeMap4.keySet()) {
		  System.out.println(mycomp.data1); //2, 3
		}
		
		//#5. MyClass 크기 비교 (Comparator<T> 객체 생성자 전달)
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
		treeMap5.put(myClass1, "가나다");                 
		treeMap5.put(myClass2, "나다라");   
		for(MyClass mc : treeMap5.keySet()) {
		  System.out.println(mc.data1); //2, 3
		}
	}
}
