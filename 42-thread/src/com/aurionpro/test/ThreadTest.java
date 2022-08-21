package com.aurionpro.test;

public class ThreadTest {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("running inside anonymous class");
			}
		};

		Thread thread = new Thread(r1);
		thread.start();

		Runnable r2 = () -> {
			System.out.println("Thread is running using lambda");

		};
		
		Thread t1 = new Thread(r2);
		t1.start();

		Runnable r3 = ThreadTest::showThread;
		Thread t2 = new Thread(r3);
		t2.start();

	}

	public static void showThread() {
		System.out.println("Thread is running from static reference");
	}

}
