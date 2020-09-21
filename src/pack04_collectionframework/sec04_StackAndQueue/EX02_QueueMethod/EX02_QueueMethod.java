package pack04_collectionframework.sec04_StackAndQueue.EX02_QueueMethod;

import java.util.LinkedList;
import java.util.Queue;

/*Queue<E> 컬렉션의 주요 메서드 활용방법*/

public class EX02_QueueMethod {
	public static void main(String[] args) {
		
		//#1. 예외처리기능 미포함 메서드
		Queue<Integer> queue1 = new LinkedList<Integer>();
		//System.out.println(queue1.element()); //NoSuchElementException

		//@1-1. add(E item)
		queue1.add(3);
		queue1.add(5);
		queue1.add(4);

		//@1-2. element()
		System.out.println(queue1.element()); //3

		//@1-3. remove()
		System.out.println(queue1.remove()); //3
		System.out.println(queue1.remove()); //5 
		System.out.println(queue1.remove()); //4
		//System.out.println(queue1.remove()); //NoSuchElementException
		
	
		//#2. 예외처리기능 포함 메서드
		Queue<Integer> queue2 = new LinkedList<Integer>();
		System.out.println(queue2.peek()); //null
		
		//@2-1. offer(E item)
		queue2.offer(3);
		queue2.offer(5);
		queue2.offer(4);
		
		//@2-2. peek()
		System.out.println(queue2.peek()); //3
		
		//@2-3. poll()
		System.out.println(queue2.poll()); //3
		System.out.println(queue2.poll()); //5
		System.out.println(queue2.poll()); //4
		System.out.println(queue2.poll()); //null

	}
}
