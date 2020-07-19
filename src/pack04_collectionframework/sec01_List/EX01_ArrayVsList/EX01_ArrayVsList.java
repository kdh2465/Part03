package pack04_collectionframework.sec01_List.EX01_ArrayVsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*�迭�� ����Ʈ�� ��*/

public class EX01_ArrayVsList {
	public static void main(String[] args) {
		
		//#1. �迭
		String[] array = new String[]{"��", "��", "��", "��", "��", "��", "��"};
		
		array[2]=null;
		array[5]=null;
		System.out.println(array.length); //7
		System.out.println(Arrays.toString(array)); //[��, ��, null, ��, ��, null, ��]
		System.out.println();
		
		//#2. ����Ʈ
		List<String> aList = new ArrayList<>();
		System.out.println(aList.size()); //0
		aList.add("��"); aList.add("��"); aList.add("��"); aList.add("��"); 
		aList.add("��"); aList.add("��"); aList.add("��");
		
		System.out.println(aList.size()); //7
		aList.remove("��");
		aList.remove("��");
		System.out.println(aList.size()); //5
		System.out.println(aList); //[��, ��, ��, ��, ��]
	}
}
