package com.aurionpro.model;

public class ExecuteTask implements IExecutable {

	@Override
	public void execute(String message) {
		System.out.println(message);
	}

}
