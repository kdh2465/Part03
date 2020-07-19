package pack04_collectionframework.sec02_Set.EX05_TreeSetMethod_2;

import java.util.Comparator;
import java.util.TreeSet;

/*사용자 클래스의 대소비교 기준 제공 및 TreeSet<E> 데이터로의 활용*/

class MyClass {
	int data1;
	int data2;
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
}

class MyComparableClass implements Comparable<MyComparableClass>{
  int data1;
  int data2;
  public MyComparableClass(int data1, int data2) {
    this.data1=data1;
    this.data2=data2;
  }
  @Override
  public int compareTo(MyComparableClass m) {
    if(data1<m.data1) { return -1; }
    else if (data1==m.data1) {return 0;}
    else return 1;
  }
}



public class EX05_TreeSetMethod_2 {
	public static void main(String[] args) {
		
		//#1. Integer 크기 비교
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		Integer intValue1 = new Integer(20);
		Integer intValue2 = new Integer(10);
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		System.out.println(treeSet1.toString()); //[10, 20]

		//#2. String 크기 비교
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = "가나";
		String str2 = "다라";
		treeSet2.add(str1);
		treeSet2.add(str2);
		System.out.println(treeSet2.toString()); //[가나, 다라]

		/*
		//#3. MyClass 크기 비교
		TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>();
		MyClass myClass1 = new MyClass(2,5);
		MyClass myClass2 = new MyClass(3,3);
		treeSet3.add(myClass1);                  //예외발생
		treeSet3.add(myClass2);                  //예외발생
		System.out.println(treeSet3.toString()); //예외발생
        */
		
		//#4. MyComparableClass 크기 비교 (방법#1)
		TreeSet<MyComparableClass> treeSet4 = new TreeSet<MyComparableClass>();
		MyComparableClass myComparableClass1 = new MyComparableClass(2,5);
		MyComparableClass myComparableClass2 = new MyComparableClass(3,3);
		treeSet4.add(myComparableClass1);
		treeSet4.add(myComparableClass2);
		for(MyComparableClass mcc : treeSet4) {
		  System.out.println(mcc.data1);
		}
		
		//#5. MyClass 크기 비교 (Comparator<T> 객체 생성자 전달) (방법#2)
		TreeSet<MyClass> treeSet5 = new TreeSet<MyClass>(new Comparator<MyClass>() {
		  @Override
		  public int compare(MyClass o1, MyClass o2) {
		    if(o1.data1 < o2.data1) return -1;
		    else if(o1.data1 == o2.data1) return 0;
		    else return 1;
		  }
		});
		
		MyClass myClass1 = new MyClass(2,5);
		MyClass myClass2 = new MyClass(3,3);
		treeSet5.add(myClass1);                 
		treeSet5.add(myClass2);   
		for(MyClass mc : treeSet5) {
		  System.out.println(mc.data1);
		}		
	}
}
