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
		hashMap.put("다", 30);
		hashMap.put("마", 40);
		hashMap.put("나", 50);
		hashMap.put("가", 60);
		System.out.println(hashMap.toString());//{가=60,다=30,마=40,나=50}

		//#2. HashTable
		Map<String, Integer> hashtable = new Hashtable<>();
		hashtable.put("다", 30);
		hashtable.put("마", 40);
		hashtable.put("나", 50);
		hashtable.put("가", 60);
		System.out.println(hashtable.toString());//{가=60,나=50,마=40,다=30}


		//#3. LinkedHashMap
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("다", 30);
		linkedHashMap.put("마", 40);
		linkedHashMap.put("나", 50);
		linkedHashMap.put("가", 60);
		System.out.println(linkedHashMap.toString());//{다=30, 마=40, 나=50, 가=60}

		//#4. TreeMap
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("다", 30);
		treeMap.put("마", 40);
		treeMap.put("나", 50);
		treeMap.put("가", 60);
		System.out.println(treeMap.toString());//{가=60, 나=50, 다=30, 마=40}

	}
}
