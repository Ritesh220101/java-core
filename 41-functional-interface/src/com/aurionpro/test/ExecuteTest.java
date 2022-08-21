package com.aurionpro.test;

import com.aurionpro.model.ExecuteTask;
import com.aurionpro.model.IExecutable;

public class ExecuteTest {
	public static void main(String[] args) {
		ExecuteTask exe = new ExecuteTask();
		exe.execute("hello");

		IExecutable ex = new IExecutable() {
			// Anonymous class
			@Override
			public void execute(String message) {
				System.out.println(message);

			}
		};
		ex.execute("Executing");

		// lambda can be only implemeted in functional interface
		IExecutable ex1 = (message) -> {
			System.out.println("Executing lambda " + message);
		};
		ex1.execute("okok");

		IExecutable iex = ExecuteTest::showMessage;// ExecuteTest::showMessage is a static reference
		iex.execute("yay");
	}

	// declaration should be same as interface
	public static void showMessage(String msg) {
		System.out.println("Show message called " + msg);
	}
}
