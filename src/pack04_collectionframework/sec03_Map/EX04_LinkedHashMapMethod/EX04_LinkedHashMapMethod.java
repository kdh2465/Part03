package pack04_collectionframework.sec03_Map.EX04_LinkedHashMapMethod;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class EX04_LinkedHashMapMethod {
	public static void main(String[] args) {
		
		Map<Integer, String> lhMap1 = new LinkedHashMap<Integer, String>();
		//#1. put(K key, V value)
		lhMap1.put(2, "���ٶ�");
		lhMap1.put(1, "������");
		lhMap1.put(3, "�ٶ�");
		System.out.println(lhMap1.toString()); //{2=���ٶ�, 1=������, 3=�ٶ�}
		
		//#2. putAll(<Map<? extends K,? extends V> m)
		Map<Integer, String> lhMap2 = new LinkedHashMap<Integer, String>();
		lhMap2.putAll(lhMap1);
		System.out.println(lhMap2.toString()); //{2=���ٶ�, 1=������, 3=�ٶ�}

		//#3.replace(K key, V value)
		lhMap2.replace(1, "������");
		lhMap2.replace(4, "����"); //���۾���
		System.out.println(lhMap2.toString()); //{2=���ٶ�, 1=������, 3=�ٶ�}

		//#4.replace(K key, V oldValue, V newValue)
		lhMap2.replace(1, "������", "������");
		lhMap2.replace(2, "�ٴٴ�", "����"); //���۾���
		System.out.println(lhMap2.toString()); //{2=���ٶ�, 1=������, 3=�ٶ�}

		//#5. V get(Object key)
		System.out.println(lhMap2.get(1)); //������
		System.out.println(lhMap2.get(2)); //���ٶ�
		System.out.println(lhMap2.get(3)); //�ٶ�

		//#6. containsKey(Object key)
		System.out.println(lhMap2.containsKey(1)); //true
		System.out.println(lhMap2.containsKey(5)); //false

		//#7. containsValue(Object value)
		System.out.println(lhMap2.containsValue("������")); //true
		System.out.println(lhMap2.containsValue("�ٴٴ�")); //false

		//#8. Set<K> keySet()
		Set<Integer> keySet = lhMap2.keySet();
		System.out.println(keySet.toString()); //[2, 1, 3]

		//#9. Set<Map.Entry<K,V>> entrySet()
		Set<Map.Entry<Integer, String>> entrySet = lhMap2.entrySet();
		System.out.println(entrySet); //[2=���ٶ�, 1=������, 3=�ٶ�]

		//#10. size()
		System.out.println(lhMap2.size()); //3
		
		//#11. remove(Object key)
		lhMap2.remove(1);
		lhMap2.remove(4); //���۾���
		System.out.println(lhMap2.toString()); //{2=���ٶ�, 3=�ٶ�}

		//#12. remove(Object key, Object value)
		lhMap2.remove(2, "���ٶ�");
		lhMap2.remove(3, "�ٴٴ�"); //���۾���
		System.out.println(lhMap2.toString()); //{3=�ٶ�}

		//#13. clear()
		lhMap2.clear();
		System.out.println(lhMap2.toString()); //{}

	}
}
