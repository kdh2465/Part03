package pack04_collectionframework.sec01_List.EX02_CreateListObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*동적크기와 정적크기를 가지는 리스트 객체 생성*/

public class EX02_CreateListObject {
	public static void main(String[] args) {
		
		//#방법1. 동적 크기를 가지는 리스트 객체 생성
		List<Integer> aList1 = new ArrayList<Integer>(); //capacity(10)
		List<Integer> aList2 = new ArrayList<Integer>(30); //capacity(30)
			
		List<String> aList5 = new Vector<String>(); //capacity(10)
		List<String> aList6 = new Vector<String>(20); //capacity(20)		
		
		List<String> aList9 = new LinkedList<String>(); //capacity(10)		
		//List<Double> aList11 = new LinkedList<Double>(20); //(불가능) capacity 지정 불가능
			
		
		//#방법2. 정적 크기를 기지는 리스트 객체 생성
		List<Integer> aList12 = Arrays.asList(1,2,3,4);
		List<String> aList13 = Arrays.asList("안녕","방가");		
		aList12.set(1,7); // [1 7 3 4]
		aList13.set(0, "감사"); //["감사", "방가"]		
		//aList12.add(5); // 오류 UnsupportedOperationException
		//aList13.remove(0); // 오류 UnsupportedOperationException

	}
}
