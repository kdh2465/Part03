package pack04_collectionframework.sec01_List.EX07_ListSummary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*List<E> ���� Ŭ���� Summary*/

public class EX07_ListSummary {
	public static void main(String[] args) {
		//#1. ArrayList
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("��");
		arrayList.add("��");
		arrayList.add("��");
		arrayList.add("��");
		System.out.println(arrayList.toString()); //[��, ��, ��, ��]

		//#2. Vector
		List<String> vector = new Vector<String>();
		vector.add("��");
		vector.add("��");
		vector.add("��");
		vector.add("��");
		System.out.println(vector.toString()); //[��, ��, ��, ��]

		//#3. LinkedList
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("��");
		linkedList.add("��");
		linkedList.add("��");
		linkedList.add("��");
		System.out.println(linkedList.toString());
	}
}
