package com.bridgelabz;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(70);
		linkedlist.add(56);
		linkedlist.add(26);
		linkedlist.insertAtPosition(3,30);

		System.out.println("Deleted key is : " + linkedlist.pop());
		linkedlist.toPrint();
		System.out.println("Deleted last key is : " + linkedlist.popLast());
		linkedlist.toPrint();
	}
}
