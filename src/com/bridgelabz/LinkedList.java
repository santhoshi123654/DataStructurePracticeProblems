package com.bridgelabz;

public class LinkedList {
	private Node head;
	
	private class Node{
		int key;
		Node next;
		 
	   public Node(int key){
		this.key=key;
			 
	   }
    }
	public boolean add(int data) {
		boolean isAdded =false;
		Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
				isAdded = true;	
			//56 is already added
			}
			else {
				Node temp = head;
				while(temp.next != null) {
				temp = temp.next;
				}
				temp.next =newNode;
				isAdded = true;
			}
			return isAdded;
	}

	public void print() {
		if(head==null) {
			System.out.println("linkedList is empty");
		}else {
			Node temp  = head;
			System.out.println("LinkedList is : ");
			while(temp!=null) {
				System.out.print(temp.key + "-->");
				temp=temp.next;
			}
		}
		System.out.println();
		
	}
}
