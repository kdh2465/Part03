package pack03_collectionframework.sec01_List.EX03_ArrayListMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*ArrayList<E> 클래스의 주요 메서드 활용방법*/

public class EX03_ArrayListMethod {
	public static void main(String[] args) {

		List<Integer> aList1 = new ArrayList<Integer>();
		
		//#1. add(E element)
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println(aList1.toString()); //[3, 4, 5]
		
		//#2. add(int index, E element)
		aList1.add(1, 6);
		System.out.println(aList1.toString()); //[3, 6, 4, 5]

		//#3. addAll(Collection<? extends E> c)
		List<Integer> aList2 = new ArrayList<Integer>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(aList1);
		System.out.println(aList2.toString()); //[1,2,3,6,4,5]
		
		//#4. addAll(int index, Collection<? extends E> c)
		List<Integer> aList3 = new ArrayList<Integer>();
		aList3.add(1);
		aList3.add(2);
		aList3.addAll(1,aList3);
		System.out.println(aList3.toString()); //[1,1,2,2]
		
		//#5. set(int index, E element)
		aList3.set(1, 5);
		aList3.set(3, 6);
		//aList3.set(4, 7); //IndexOutOfBoundsException
		System.out.println(aList3.toString()); //[1,5,2,6]

		//#6. remove(int index)
		aList3.remove(1); 
		System.out.println(aList3.toString()); //[1,2,6]

		//#7. remove(Object o)
		aList3.remove(new Integer(2));
		System.out.println(aList3.toString()); //[1,6]

		//#8. clear()
		aList3.clear();
		System.out.println(aList3.toString()); //[]

		//#9. isEmpty();
		System.out.println(aList3.isEmpty()); //true

		//#10. size()
		aList3.add(1);
		aList3.add(2);
		aList3.add(3);
		System.out.println(aList3.toString()); //[1,2,3]
		System.out.println("size : "+aList3.size()); //size : 3

		//#11. get(int index)
		System.out.println("0번째 : " + aList3.get(0)); //0번째 : 1
		System.out.println("1번째 : " + aList3.get(1)); //1번째 : 2
		System.out.println("2번째 : " + aList3.get(2)); //2번째 : 3
		for(int i=0; i<aList3.size(); i++) {
		  System.out.println(i+"번째 : " + aList3.get(i));
		}		

		//#12. toArray()
		Object[] object = aList3.toArray();
		System.out.println(Arrays.toString(object)); //[1,2,3]

		//#13-1. toArray(T[] t)
		Integer[] integer1 = aList3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer1)); //[1,2,3]

		//#13-2. toArray(T[] t)
		Integer[] integer2 = aList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2)); //[1,2,3,null,null]

	}
}
