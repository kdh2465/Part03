package pack03_collectionframework.sec01_List.EX06_ArrayListVsLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*ArrayList<E>와 LinkedList<E>의 성능 비교 (데이터추가/검색/삭제)*/

public class EX06_ArrayListVsLinkedList {
	public static void main(String[] args) {
		
		//#1. 데이터 추가 시간 측정비교		
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		long startTime=0, endTime=0;
		
		//@1-1 ArrayList 데이터 추가시간 측정
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
		  aList.add(0, i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 데이터 추가시간: " + (endTime-startTime) + "ns");
		
		//@1-2 LinkedList 데이터 추가시간 측정
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
		  linkedList.add(0, i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 데이터 추가시간: " + (endTime-startTime) + "ns");
		
		
		
		//#2. 데이터의 검색(get) 시간 비교
		//@2-1. ArrayList 데이터 검색 시간 측정
		startTime = System.nanoTime();
		for(int i=0; i<aList.size(); i++) {
		  aList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 데이터 검색시간: " + (endTime-startTime) + "ns");

		//@2-2. LinkedList 데이터 검색 시간 측정
		startTime = System.nanoTime();
		for(int i=0; i<linkedList.size(); i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 데이터 검색시간: " + (endTime-startTime) + "ns");

		
		//#3. 데이터의 제거 (remove) 시간 비교
		//@3-1. ArrayList 데이터 제거 시간 측정
		startTime = System.nanoTime();
		for(int i=0; i<aList.size(); i++) {
		  aList.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 데이터 제거시간: " + (endTime-startTime) + "ns");
		
		//@3-2. LinkedList 데이터 제거 시간 측정
		startTime = System.nanoTime();
		for(int i=0; i<linkedList.size(); i++) {
			linkedList.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 데이터 제거시간: " + (endTime-startTime) + "ns");
		
	}
}
