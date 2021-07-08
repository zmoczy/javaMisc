package Com.javaMisc.JavaMisc;

import java.util.Calendar;
import java.util.Date;
/**
 * Working with threads and practicing with sleep function
 * @author zachary_moczygemba
 *
 */
public class threadTest1 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadTest1 t1 = new threadTest1();
		Thread thread1 = new Thread(t1);
		thread1.start();
	}

	/**
	 * Override the run method with function to display time sleep and display 
	 * time again
	 */
	@Override
	public void run() {
		Date time = new Date();
		Thread.currentThread().setName("my Thread");
		System.out.println("The name of my thread is: " + Thread.currentThread().getName());
		System.out.println("the time is: " + time.toString());
		try {
			//try catch in case thread is interrupted
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		time = new Date();
		System.out.println("the time is: " + time.toString());
	}

}
