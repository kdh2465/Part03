package pack03_collectionframework.sec02_Set.EX06_SetSummary;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Set<E> ����Ŭ���� Summary*/

public class EX06_SetSummary {
	public static void main(String[] args) {
		//#1. HashSet
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		System.out.println(hashSet.toString()); //[��, ��, ��, ��]

		//#2. LinkedHashSet
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("��");
		linkedHashSet.add("��");
		linkedHashSet.add("��");
		linkedHashSet.add("��");
		System.out.println(linkedHashSet.toString()); //[��, ��, ��, ��]

		//#3. TreeSet
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		System.out.println(treeSet.toString());

	}
}
