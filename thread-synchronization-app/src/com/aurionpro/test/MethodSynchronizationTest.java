package com.aurionpro.test;

import com.aurionpro.model.MethodSynchronization;

public class MethodSynchronizationTest {

	public static void main(String[] args) {
		MethodSynchronization met = new MethodSynchronization();
		Thread t1 = new Thread() {
			public void run() {
				met.print(5);
			}
		};

		Runnable t2 = () -> {
			met.print(15);
		};

		Thread thread = new Thread(t2);
		t1.start();
		thread.start();
	}

}
