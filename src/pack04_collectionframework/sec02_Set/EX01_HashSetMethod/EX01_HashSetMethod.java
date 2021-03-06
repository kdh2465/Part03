﻿package pack04_collectionframework.sec02_Set.EX01_HashSetMethod;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*HashSet<E> 클래스의 주요 메서드 활용방법*/

public class EX01_HashSetMethod {
	public static void main(String[] args) {
		
		Set<String> hSet1 = new HashSet<String>();
		//#1. add(E element)
		hSet1.add("가");
		hSet1.add("나");
		hSet1.add("가");
		System.out.println(hSet1.toString()); //[가, 나]

		//#2. addAll(Collection<? extends E> c)
		Set<String> hSet2 = new HashSet<String>();
		hSet2.add("나");
		hSet2.add("다");
		hSet2.addAll(hSet1);
		System.out.println(hSet2.toString()); //[가, 다, 나]
		
		//#3. remove(Object o)
		hSet2.remove("나");
		System.out.println(hSet2.toString()); //[가, 다]

		//#4. clear()
		hSet2.clear();
		System.out.println(hSet2.toString()); //[]

		//#5. isEmpty()
		System.out.println(hSet2.isEmpty()); //true

		//#6. contains(Object o)
		Set<String> hSet3 = new HashSet<String>();
		hSet3.add("가");
		hSet3.add("다");
		hSet3.add("나");
		System.out.println(hSet3.contains("나")); //true
		System.out.println(hSet3.contains("라")); //false

		//#7. size()
		System.out.println(hSet3.size()); //3

		//#8. iterator()
		Iterator<String> iterator = hSet3.iterator();
		while(iterator.hasNext()) {
		  System.out.print(iterator.next() + " "); //가 다 나
		}
		System.out.println();

		//#9. toArray()
		Object[] objArray = hSet3.toArray();
		System.out.println(Arrays.toString(objArray)); //[가 다 나]

		//#10-1. toArray(T[] t)
		String[] strArray1 = hSet3.toArray(new String[0]);
		System.out.println(Arrays.toString(strArray1)); //[가 다 나]

		//#10-2. toArray(T[] t)
		String[] strArray2 = hSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2)); //[가 다 나]

	}
}
