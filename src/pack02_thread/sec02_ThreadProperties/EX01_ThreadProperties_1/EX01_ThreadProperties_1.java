package pack02_thread.sec02_ThreadProperties.EX01_ThreadProperties_1;

/*쓰레드 객체 가져오기/이름 직접설정/이름 자동설정/쓰레드 수*/

public class EX01_ThreadProperties_1 {
	public static void main(String[] args) {
		
		//#1. 객체 가져오기 (currentThread()) + 쓰레드 수 (activeCount())
		Thread curThread = Thread.currentThread();
		System.out.println("현재 쓰레드 이름:"+curThread.getName());
		System.out.println("쓰레드 수="+Thread.activeCount());
		
		//#2. 쓰레드 이름 자동 설정
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		// #3. 쓰레드 이름 직접 설정
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			thread.setName(i+"번째 쓰레드");
			System.out.println(thread.getName());
			thread.start();
		}
		
		//#4. 쓰레드 이름 자동 설정
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}	
		
		//#5. 쓰레드 수		
		System.out.println("쓰레드 수="+Thread.activeCount());		

	}
}
