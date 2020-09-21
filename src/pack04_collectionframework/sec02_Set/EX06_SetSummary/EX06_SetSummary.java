package pack04_collectionframework.sec02_Set.EX06_SetSummary;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Set<E> 구현클래스 Summary*/

public class EX06_SetSummary {
	public static void main(String[] args) {
		//#1. HashSet
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("다");
		hashSet.add("마");
		hashSet.add("나");
		hashSet.add("가");
		System.out.println(hashSet.toString()); //[가, 다, 마, 나]

		//#2. LinkedHashSet
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("다");
		linkedHashSet.add("마");
		linkedHashSet.add("나");
		linkedHashSet.add("가");
		System.out.println(linkedHashSet.toString()); //[다, 마, 나, 가]

		//#3. TreeSet
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("다");
		treeSet.add("마");
		treeSet.add("나");
		treeSet.add("가");
		System.out.println(treeSet.toString());

	}
}
