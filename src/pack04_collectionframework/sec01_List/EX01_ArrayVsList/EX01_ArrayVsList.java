package pack04_collectionframework.sec01_List.EX01_ArrayVsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*배열과 리스트의 비교*/

public class EX01_ArrayVsList {
	public static void main(String[] args) {
		
		//#1. 배열
		String[] array = new String[]{"가", "나", "다", "라", "마", "바", "사"};
		
		array[2]=null;
		array[5]=null;
		System.out.println(array.length); //7
		System.out.println(Arrays.toString(array)); //[가, 나, null, 라, 마, null, 사]
		System.out.println();
		
		//#2. 리스트
		List<String> aList = new ArrayList<>();
		System.out.println(aList.size()); //0
		aList.add("가"); aList.add("나"); aList.add("다"); aList.add("라"); 
		aList.add("마"); aList.add("바"); aList.add("사");
		
		System.out.println(aList.size()); //7
		aList.remove("다");
		aList.remove("바");
		System.out.println(aList.size()); //5
		System.out.println(aList); //[가, 나, 라, 마, 사]
	}
}
