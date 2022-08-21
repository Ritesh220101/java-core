package com.aurionpro.test;

import com.aurionpro.model.ThreadJoin;

public class ThreadJoinTest {

	public static void main(String[] args) {
		ThreadJoin thread = new ThreadJoin();
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("Thread 1 started");
				thread.run();
				System.out.println("Thread 1 ended");
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				System.out.println("Thread 2 started");
				thread.run();
				System.out.println("Thread 2 ended");
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				System.out.println("Thread 3 started");
				thread.run();
				System.out.println("Thread 3 ended");

			}
		};

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();
		t3.start();
	}

}
