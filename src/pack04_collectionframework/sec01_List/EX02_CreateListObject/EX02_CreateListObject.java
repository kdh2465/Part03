package pack04_collectionframework.sec01_List.EX02_CreateListObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*����ũ��� ����ũ�⸦ ������ ����Ʈ ��ü ����*/

public class EX02_CreateListObject {
	public static void main(String[] args) {
		
		//#���1. ���� ũ�⸦ ������ ����Ʈ ��ü ����
		List<Integer> aList1 = new ArrayList<Integer>(); //capacity(10)
		List<Integer> aList2 = new ArrayList<Integer>(30); //capacity(30)
			
		List<String> aList5 = new Vector<String>(); //capacity(10)
		List<String> aList6 = new Vector<String>(20); //capacity(20)		
		
		List<String> aList9 = new LinkedList<String>(); //capacity(10)		
		//List<Double> aList11 = new LinkedList<Double>(20); //(�Ұ���) capacity ���� �Ұ���
			
		
		//#���2. ���� ũ�⸦ ������ ����Ʈ ��ü ����
		List<Integer> aList12 = Arrays.asList(1,2,3,4);
		List<String> aList13 = Arrays.asList("�ȳ�","�氡");		
		aList12.set(1,7); // [1 7 3 4]
		aList13.set(0, "����"); //["����", "�氡"]		
		//aList12.add(5); // ���� UnsupportedOperationException
		//aList13.remove(0); // ���� UnsupportedOperationException

	}
}
