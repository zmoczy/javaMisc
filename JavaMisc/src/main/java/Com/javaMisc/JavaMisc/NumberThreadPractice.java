package Com.javaMisc.JavaMisc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RunnableFuture;

public class NumberThreadPractice implements Runnable {
	public int x;
	public NumberThreadPractice(int x) {
		this.x = x;
	}
	public static void main(String[] args) throws InterruptedException {
		NumberThreadPractice one = new NumberThreadPractice(1);
		NumberThreadPractice Two = new NumberThreadPractice(2);
		NumberThreadPractice five = new NumberThreadPractice(5);

		Thread th1 = new Thread(one);
		Thread th2 = new Thread(Two);
		Thread th3 = new Thread(five);
		
		th1.start();
		th1.join();
		th2.start();
		th2.join();
		th3.start();
		th3.join();
		
		
	}

	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " Displaying multiples of: " + x);
		for(int i =1; i < 11; i++) {
			System.out.println(x + " * " + i + " = " + i*x);
		}
		
	
		
	}
	
	
	

}
