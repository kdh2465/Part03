package pack01_exceptionhandling.sec01_TypeOfException.EX01_CheckedException;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/*대표적인 일반예외(Checked Exception)*/

class A {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}	
}

public class EX01_CheckedException {
	public static void main(String[] args) {
		
		//#Checked Exception
		
		//#1. InterruptedException
		//Thread.sleep(1000);
		
		//#2. ClassNotFoundException
		//Class Cls = Class.forName("java.lang.Ojbect");
		
		//#3. IOException
		InputStreamReader in = new InputStreamReader(System.in);
		//in.read();
		
		//#4. FileNotFoundException
		//FileInputStream fis = new FileInputStream("text.txt");
		
		//#. CloneNotSupportedException
		A a1 = new A();
		//A a2 = (A)a1.clone();
		
	}
}
