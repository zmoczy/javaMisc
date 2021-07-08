package Com.javaMisc.JavaMisc;
/**
 * another practice with threads that extends thread
 * @author zachary_moczygemba
 *
 */
public class threadTest3 extends Thread {
	public static void main(String[] args) {
		threadTest2 t2 = new threadTest2();
		Thread thread0 = new Thread(t2);
		Thread thread1 = new Thread(t2);
		Thread thread2 = new Thread(t2);
		thread0.start();
		thread1.start();
		thread2.start();
	}

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " is at " + i);
			try {
				Thread.currentThread().sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
