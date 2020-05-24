package pack03_collectionframework.sec02_Set.EX10_LinkedHashSetMethod;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class EX10_LinkedHashSetMethod {
	public static void main(String[] args) {
		Set<String> linkedSet1 = new LinkedHashSet<String>();
		//#1. add(E element)
		linkedSet1.add("��");
		linkedSet1.add("��");
		linkedSet1.add("��");
		System.out.println(linkedSet1.toString()); //[��, ��]

		//#2. addAll(Collection<? extends E> c)
		Set<String> linkedSet2 = new LinkedHashSet<String>();
		linkedSet2.add("��");
		linkedSet2.add("��");
		linkedSet2.addAll(linkedSet1);
		System.out.println(linkedSet2.toString()); //[��, ��, ��]
		
		//#3. remove(Object o)
		linkedSet2.remove("��");
		System.out.println(linkedSet2.toString()); //[��, ��]

		//#4. clear()
		linkedSet2.clear();
		System.out.println(linkedSet2.toString()); //[]

		//#5. isEmpty()
		System.out.println(linkedSet2.isEmpty()); //true

		//#6. contains(Object o)
		Set<String> linkedSet3 = new LinkedHashSet<String>();
		linkedSet3.add("��");
		linkedSet3.add("��");
		linkedSet3.add("��");
		System.out.println(linkedSet3.contains("��")); //true
		System.out.println(linkedSet3.contains("��")); //false

		//#7. size()
		System.out.println(linkedSet3.size()); //3

		//#8. iterator()
		Iterator<String> iterator = linkedSet3.iterator();
		while(iterator.hasNext()) {
		  System.out.print(iterator.next() + " "); //�� �� ��
		}
		System.out.println();

		//#9. toArray()
		Object[] objArray = linkedSet3.toArray();
		System.out.println(Arrays.toString(objArray)); //[�� �� ��]

		//#10-1. toArray(T[] t)
		String[] strArray1 = linkedSet3.toArray(new String[0]);
		System.out.println(Arrays.toString(strArray1)); //[�� �� ��]

		//#10-2. toArray(T[] t)
		String[] strArray2 = linkedSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2)); //[�� �� �� null null]


		
		
	}
}
