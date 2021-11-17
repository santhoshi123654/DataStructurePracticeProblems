package com.bridgelabz;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(56);
		linkedlist.add(70);
		linkedlist.insertAtPosition(2,30);

		System.out.println("Deleted key is : " + linkedlist.pop());
		linkedlist.toPrint();
		
	}
}
