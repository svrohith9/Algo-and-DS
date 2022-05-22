package com.algorithms;

public class LinkedList {
	Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	Node tail;

	public void addAtEnd(String data) {
		Node node = new Node(data);
		if (this.head == null)
			this.head = this.tail = node;
		else {
			this.tail.setNext(node);
			this.tail = node;
		}

	}

	public void addAtIndex(String data) {
		Node node = new Node(data);
		if (this.head == null)
			this.head = this.tail = node;
		else {
			node.next = this.head;
			this.head = node;

		}

	}

	@Override
	public String toString() {
		return "LinkedList [head=" + head + ", tail=" + tail + "]";
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();

		linkedList.addAtIndex("one");
		linkedList.addAtEnd("two");
		linkedList.addAtEnd("three");
		linkedList.addAtEnd("four");

		linkedList.addAtIndex("4");
		linkedList.addAtIndex("3");
		linkedList.addAtIndex("2");
		linkedList.addAtEnd("1");
		System.out.println(linkedList.toString());
	}
}
