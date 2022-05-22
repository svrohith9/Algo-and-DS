package com.algorithms;

public class Node {
	Node next;
	String data;

	public Node(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [next=" + next + ", data=" + data + "]";
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
