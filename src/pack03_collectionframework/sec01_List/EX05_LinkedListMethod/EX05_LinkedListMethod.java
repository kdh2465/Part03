package pack03_collectionframework.sec01_List.EX05_LinkedListMethod;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*LinkedList<E> 클래스의 주요 메서드 활용방법*/

public class EX05_LinkedListMethod {
	public static void main(String[] args) {
		
		List<Integer> linkedlist1 = new LinkedList<Integer>();
		
		//#1. add(E element)
		linkedlist1.add(3);
		linkedlist1.add(4);
		linkedlist1.add(5);
		System.out.println(linkedlist1.toString()); //[3, 4, 5]
		
		//#2. add(int index, E element)
		linkedlist1.add(1, 6);
		System.out.println(linkedlist1.toString()); //[3, 6, 4, 5]

		//#3. addAll(Collection<? extends E> c)
		List<Integer> linkedlist2 = new Vector<Integer>();
		linkedlist2.add(1);
		linkedlist2.add(2);
		linkedlist2.addAll(linkedlist1);
		System.out.println(linkedlist2.toString()); //[1,2,3,6,4,5]
		
		//#4. addAll(int index, Collection<? extends E> c)
		List<Integer> linkedlist3 = new Vector<Integer>();
		linkedlist3.add(1);
		linkedlist3.add(2);
		linkedlist3.addAll(1,linkedlist3);
		System.out.println(linkedlist3.toString()); //[1,1,2,2]
		
		//#5. set(int index, E element)
		linkedlist3.set(1, 5);
		linkedlist3.set(3, 6);
		//linkedlist3.set(4, 7); //IndexOutOfBoundsException
		System.out.println(linkedlist3.toString()); //[1,5,2,6]

		//#6. remove(int index)
		linkedlist3.remove(1); 
		System.out.println(linkedlist3.toString()); //[1,2,6]

		//#7. remove(Object o)
		linkedlist3.remove(new Integer(2));
		System.out.println(linkedlist3.toString()); //[1,6]

		//#8. clear()
		linkedlist3.clear();
		System.out.println(linkedlist3.toString()); //[]

		//#9. isEmpty();
		System.out.println(linkedlist3.isEmpty()); //true

		//#10. size()
		linkedlist3.add(1);
		linkedlist3.add(2);
		linkedlist3.add(3);
		System.out.println(linkedlist3.toString()); //[1,2,3]
		System.out.println("size : "+linkedlist3.size()); //size : 3

		//#11. get(int index)
		System.out.println("0번째 : " + linkedlist3.get(0)); //0번째 : 1
		System.out.println("1번째 : " + linkedlist3.get(1)); //1번째 : 2
		System.out.println("2번째 : " + linkedlist3.get(2)); //2번째 : 3
		for(int i=0; i<linkedlist3.size(); i++) {
		  System.out.println(i+"번째 : " + linkedlist3.get(i));
		}		

		//#12. toArray()
		Object[] object = linkedlist3.toArray();
		System.out.println(Arrays.toString(object)); //[1,2,3]

		//#13-1. toArray(T[] t)
		Integer[] integer1 = linkedlist3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer1)); //[1,2,3]

		//#13-2. toArray(T[] t)
		Integer[] integer2 = linkedlist3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2)); //[1,2,3,null,null]
	}
}
