package pack03_collectionframework.sec03_Map.EX07_MapSummary;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class EX07_MapSummary {
	public static void main(String[] args) {

		//#1. HashMap
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("��", 30);
		hashMap.put("��", 40);
		hashMap.put("��", 50);
		hashMap.put("��", 60);
		System.out.println(hashMap.toString());//{��=60,��=30,��=40,��=50}

		//#2. HashTable
		Map<String, Integer> hashtable = new Hashtable<>();
		hashtable.put("��", 30);
		hashtable.put("��", 40);
		hashtable.put("��", 50);
		hashtable.put("��", 60);
		System.out.println(hashtable.toString());//{��=60,��=50,��=40,��=30}


		//#3. LinkedHashMap
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("��", 30);
		linkedHashMap.put("��", 40);
		linkedHashMap.put("��", 50);
		linkedHashMap.put("��", 60);
		System.out.println(linkedHashMap.toString());//{��=30, ��=40, ��=50, ��=60}

		//#4. TreeMap
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("��", 30);
		treeMap.put("��", 40);
		treeMap.put("��", 50);
		treeMap.put("��", 60);
		System.out.println(treeMap.toString());//{��=60, ��=50, ��=30, ��=40}

	}
}
