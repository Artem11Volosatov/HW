package sourceit.HW_Concurrent;

import java.util.concurrent.TimeUnit;

class MyThread1 extends Thread {
	
	
	/**
	 * Interval between printing to console.
	 */
	private static final int PAUSE = 500;

	/**
	 * In while loop prints current thread name with specified interval.
	 */
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println(getName());
				TimeUnit.MILLISECONDS.sleep(PAUSE);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread was interrupted");
		}

	}
}

/**
 * Thread that prints to console its own name intervals.
 * 
 * @author Andrey Pyatakha
 *
 */

class MyThread2 implements Runnable {
	
	/**
	 * Interval between printing to console.
	 */
	private static final int PAUSE = 500;
	
	/**
	 * In while loop prints current thread name with specified interval.
	 */
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println(Thread.currentThread().getName());
				TimeUnit.MILLISECONDS.sleep(PAUSE);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread was interrupted");
		}

	}
}

/**
 * Demo class with main method.
 * 
 * Demonstrates how to run threads.
 * Runs thread with object that extends Thread and 
 * object that implements Runnable.
 * 
 * @author Andrey Pyatakha
 *
 */

public class MyThreadDemo {

	/**
	 * Enter point to the Part1.
	 * 
	 * Create and runs threads in different way.
	 * Interrupt threads after five seconds.
	 * 
	 * @param args input parameters
	 * @throws InterruptedException in case of interruption in threads.
	 */
	public static void main(String[] args) throws InterruptedException {

		Thread t = new Thread(new MyThread2());

		t.start();
		TimeUnit.SECONDS.sleep(5);
		t.interrupt();

		MyThread1 t2 = new MyThread1();
		t2.start();
		TimeUnit.SECONDS.sleep(5);
		t2.interrupt();
	}

}