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

	public boolean add(int data) {
		
		boolean isAdded=false;
		Node newNode = new Node(data);
		
		if(head==null) {
			head=newNode;
			isAdded = true;
		}
		else {
			
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
	
	public void insertAt(int position, int data) {
		
		if(position<1) {
			System.out.println("Position is Invalid");
		}
		
		if(position==1) {
			push(data);
		}
		else {
			Node newNode =new Node(data);
			Node temp = head;
			int count=1;
			while(count<position-1) {
				temp=temp.next;
				count++;
			}
			Node current = temp.next;
			temp.next = newNode;
			newNode.next=current;
		}
	}

	public int pop() {
		
		if(head==null) {
			System.out.println("deletion is not possible it is an  empty list");
		}
		Node temp = head;
		head = temp.next;
		
		return temp.key;
	}
	
	public int popLast() {
		if(head==null) {
			System.out.println("deletion is not possible it is  empty list");
		}
		
		Node temp = head;
		
		while(temp.next.next != null) {
			temp=temp.next;
		}
		
		int popLastKey=temp.next.key;
		temp.next=null;
		return popLastKey;
	}
	
	public boolean toSearch(int data) {
		
		if(head==null) {
			System.out.println("List is empty");
			return false;
		}		
		Node temp = head;
		boolean isFound = false;
		while(temp != null) {
			if(temp.key == data) {
				isFound = true;
				break;
			}
			temp = temp.next;
		}
		return isFound;
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
