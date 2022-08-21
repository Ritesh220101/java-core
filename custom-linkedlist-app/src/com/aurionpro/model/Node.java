package com.aurionpro.model;

public class Node {
	private int data;
	Node next;

	

	public Node(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextNode() {
		return next;
	}

	public void setNextNode(Node nextNode) {
		this.next = nextNode;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", nextNode=" + next + "]";
	}
	
}
