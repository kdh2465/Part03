package pack03_collectionframework.sec03_Map.EX16_HashTableMethod;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class EX16_HashTableMethod {
	public static void main(String[] args) {
		Map<Integer, String> hTable1 = new Hashtable<Integer, String>();
		//#1. put(K key, V value)
		hTable1.put(2, "나다라");
		hTable1.put(1, "가나다");
		hTable1.put(3, "다라마");
		System.out.println(hTable1.toString());//{3=다라마, 2=나다라, 1=가나다}

		//#2. putAll(<Map<? extends K,? extends V> m)
		Map<Integer, String> hTable2 = new Hashtable<Integer, String>();
		hTable2.putAll(hTable1);
		System.out.println(hTable2.toString());//{3=다라마, 2=나다라, 1=가나다}
		
		//#3.replace(K key, V value)
		hTable2.replace(1, "가가가");
		hTable2.replace(4, "라라라"); //동작안함
		System.out.println(hTable2.toString());//{3=다라마, 2=나다라, 1=가가가}

		//#4.replace(K key, V oldValue, V newValue)
		hTable2.replace(1, "가가가", "나나나");
		hTable2.replace(2, "다다다", "라라라");//동작안함
		System.out.println(hTable2.toString());//{3=다라마, 2=나다라, 1=나나나}

		//#5. V get(Object key)
		System.out.println(hTable2.get(1)); //나나나
		System.out.println(hTable2.get(2)); //나다라
		System.out.println(hTable2.get(3)); //다라마

		//#6. containsKey(Object key)
		System.out.println(hTable2.containsKey(1)); //true
		System.out.println(hTable2.containsKey(5)); //false

		//#7. containsValue(Object value)
		System.out.println(hTable2.containsValue("나나나")); //true
		System.out.println(hTable2.containsValue("다다다")); //false

		//#8. Set<K> keySet()
		Set<Integer> keySet = hTable2.keySet();
		System.out.println(keySet.toString()); //[3, 2, 1]

		//#9. Set<Map.Entry<K,V>> entrySet()
		Set<Map.Entry<Integer, String>> entrySet = hTable2.entrySet();
		System.out.println(entrySet); //[1=나나나, 2=나다라, 3=다라마]

		//#10. size()
		System.out.println(hTable2.size()); //3



	}
}
