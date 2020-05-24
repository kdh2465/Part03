package pack05_stream.sec03_TerminalOperations.EX17_Iterating_forEach;

import java.util.stream.Stream;

public class EX17_Iterating_forEach {
	public static void main(String[] args) {
		
		//#. Iterating (forEach())
		Stream.of(1,2,3,4).forEach(s->System.out.println(s));
		Stream.of("��ť", "����", "����").forEach(System.out::print);
		System.out.println();

		//cf. peek(..)�� �߰��۾� (�����۾��� ������ �������� ����) 
		Stream.of(1,2,3,4).peek(s->System.out.println(s));//���۾���
		Stream.of(1,2,3,4).peek(s->System.out.print(s+" ")).count();//������

	}
}
