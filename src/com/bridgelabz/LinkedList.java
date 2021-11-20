package com.bridgelabz;

public class LinkedList {
	
private Node head;
	
	class Node {
		
		int key;
		Node next;
		public Node(int key) {
			this.key=key;
		}	
	}

	public boolean add(int element) {
		
		boolean isAdded=false;
		Node newNode = new Node(element);
		if(head==null) {
			head=newNode;
			isAdded = true;
		}else {
			
			Node temp = head;
			if(temp.next!=null) {
				temp=temp.next;		
			}
			temp.next=newNode;
			isAdded = true;
		}
		return isAdded;		
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void toPrint() {
		if(head==null) {
			System.out.println("linkedList is empty");
		}else {
			Node temp =head;
			System.out.println("LinkedList is : ");
			while(temp!=null) {
				System.out.print(temp.key + "-->");
				temp=temp.next;
			}
		}
		System.out.println();
		
	}
}
