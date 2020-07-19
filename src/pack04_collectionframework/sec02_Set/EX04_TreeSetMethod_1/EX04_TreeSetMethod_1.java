package pack04_collectionframework.sec02_Set.EX04_TreeSetMethod_1;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/*TreeSet<E> 클래스의 주요 메서드 활용방법*/

public class EX04_TreeSetMethod_1 {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for(int i=50; i>0; i-=2) { treeSet.add(i); }
		System.out.println(treeSet.toString()); //[2,4,6,...,50]

		//#1. first()
		System.out.println(treeSet.first()); //2		
		//#2. last()
		System.out.println(treeSet.last()); //50
		//#3. lower(E element)
		System.out.println(treeSet.lower(26)); //24
		//#4. lower(E element)
		System.out.println(treeSet.higher(26)); //28
		//#5. floor(E element)
		System.out.println(treeSet.floor(25)); //24
		System.out.println(treeSet.floor(26)); //26
		//#6. ceiling(E element)
		System.out.println(treeSet.ceiling(25)); //26
		System.out.println(treeSet.ceiling(26)); //26

		//#7. pollFirst()
		int treeSetSize = treeSet.size();
		System.out.println(treeSetSize); //25
		for(int i=0; i<treeSetSize; i++) {
		  System.out.print(treeSet.pollFirst()+ " "); //2 4 6 ... 50
		}
		System.out.println();
		System.out.println(treeSet.size()); //0

		//#8. pollLast()
		for(int i=50; i>0; i-=2) { treeSet.add(i); }

		treeSetSize = treeSet.size();
		System.out.println(treeSetSize); //25
		for(int i=0; i<treeSetSize; i++) {
		  System.out.print(treeSet.pollLast()+ " "); //50 48 46 ... 2
		}
		System.out.println();
		System.out.println(treeSet.size()); //0
		
		//#9. SortedSet<E> headSet(E toElement)
		for(int i=50; i>0; i-=2) { treeSet.add(i); }		
		SortedSet<Integer> sSet = treeSet.headSet(20);
		System.out.println(sSet.toString()); //[2, 4, 6, ..., 18]

		//#10. NavigableSet<E> headSet(E toElement, boolean inclusive)
		NavigableSet<Integer> nSet = treeSet.headSet(20, false);  
		System.out.println(nSet.toString()); //[2, 4, 6, ..., 18]
		nSet = treeSet.headSet(20, true);
		System.out.println(nSet.toString()); //[2, 4, 6, ..., 20]

		//#11. SortedSet<E> tailSet(E toElement)
		sSet = treeSet.tailSet(20);
		System.out.println(sSet.toString()); //[20, 22, 24, ..., 50]

		//#12. NavigableSet<E> tailSet(E toElement, boolean inclusive)
		nSet = treeSet.tailSet(20, false);  
		System.out.println(nSet.toString()); //[22, 24, 26 ..., 50]
		nSet = treeSet.tailSet(20, true);
		System.out.println(nSet.toString()); //[20, 22, 24, ..., 50]
		
		//#13. SortedSet<E> subSet(E fromElement, E toElement)
		sSet = treeSet.subSet(10, 20);
		System.out.println(sSet.toString()); //[10, 12, 14, 16, 18]

		//#14. NavigableSet<E> subSet(E fromElement, boolean frominclusive,E toElement, boolean toinclusive)
		nSet = treeSet.subSet(10, true, 20, false);  
		System.out.println(nSet.toString()); //[10, 12, 14, 16, 18]
		nSet = treeSet.subSet(10, false, 20, true);
		System.out.println(nSet.toString()); //[12, 14, 16, 18, 20]
		
		//#15. NavigableSet<E> descendingSet()		
		System.out.println(treeSet); //[2, 4, 6, ..., 50]
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();
		System.out.println(descendingSet); //[50, 48, 46, ..., 2]
		descendingSet = descendingSet.descendingSet();
		System.out.println(descendingSet); //[2, 4, 6, ..., 50]
			}
}
