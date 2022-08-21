package com.aurionpro.test;

import com.aurionpro.model.MethodSynchronization;

public class BlockSynchronizationTest {

	public static void main(String[] args) {
		MethodSynchronization met = new MethodSynchronization();
		Thread t1 = new Thread() {
			public void run() {
				met.print(5);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				met.print(15);
			}
		};

		t1.start();
		t2.start();
	}

}
