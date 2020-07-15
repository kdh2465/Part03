package pack03_collectionframework.sec03_Map.EX01_HashMapMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*HashMap<K,V> Ŭ������ �ֿ� �޼��� Ȱ����*/

public class EX01_HashMapMethod {
	public static void main(String[] args) {
		Map<Integer, String> hMap1 = new HashMap<Integer, String>();
		//#1. put(K key, V value)
		hMap1.put(2, "���ٶ�");
		hMap1.put(1, "������");
		hMap1.put(3, "�ٶ�");
		System.out.println(hMap1.toString()); //{1=������, 2=���ٶ�, 3=�ٶ�}

		//#2. putAll(<Map<? extends K,? extends V> m)
		Map<Integer, String> hMap2 = new HashMap<Integer, String>();
		hMap2.putAll(hMap1);
		System.out.println(hMap2.toString()); //{1=������, 2=���ٶ�, 3=�ٶ�}
		
		//#3.replace(K key, V value)
		hMap2.replace(1, "������");
		hMap2.replace(4, "����"); //���۾���
		System.out.println(hMap2.toString()); //{1=������, 2=���ٶ�, 3=�ٶ�}

		//#4.replace(K key, V oldValue, V newValue)
		hMap2.replace(1, "������", "������");
		hMap2.replace(2, "�ٴٴ�", "����"); //���۾���
		System.out.println(hMap2.toString()); //{1=������, 2=���ٶ�, 3=�ٶ�}

		//#5. V get(Object key)
		System.out.println(hMap2.get(1)); //������
		System.out.println(hMap2.get(2)); //���ٶ�
		System.out.println(hMap2.get(3)); //�ٶ�

		//#6. containsKey(Object key)
		System.out.println(hMap2.containsKey(1)); //true
		System.out.println(hMap2.containsKey(5)); //false

		//#7. containsValue(Object value)
		System.out.println(hMap2.containsValue("������")); //true
		System.out.println(hMap2.containsValue("�ٴٴ�")); //false

		//#8. Set<K> keySet()
		Set<Integer> keySet = hMap2.keySet();
		System.out.println(keySet.toString()); //[1, 2, 3]

		//#9. Set<Map.Entry<K,V>> entrySet()
		Set<Map.Entry<Integer, String>> entrySet = hMap2.entrySet();
		System.out.println(entrySet); //[1=������, 2=���ٶ�, 3=�ٶ�]

		//#10. size()
		System.out.println(hMap2.size()); //3

		//#11. remove(Object key)
		hMap2.remove(1);
		hMap2.remove(4); //���۾���
		System.out.println(hMap2.toString()); //{2=���ٶ�, 3=�ٶ�}

		//#12. remove(Object key, Object value)
		hMap2.remove(2, "���ٶ�");
		hMap2.remove(3, "�ٴٴ�"); //���۾���
		System.out.println(hMap2.toString()); //{3=�ٶ�}

		//#13. clear()
		hMap2.clear();
		System.out.println(hMap2.toString()); //{}

	}
}
