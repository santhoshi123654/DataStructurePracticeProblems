package com.bridgelabz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.toPrint();
	
		ListUserInterface userInterface = new ListUserInterface();
			while (true) {
				int num = userInterface.userMenu();
			
		switch (num) {
			case 1:
				linkedlist.add(userInterface.inputData());
				break;
			case 2 : 
				linkedlist.push(userInterface.inputData());
			case 3:
				Scanner scanner = new Scanner(System.in);
				System.out.println("enter the insert position : ");
				int position = scanner.nextInt();
				System.out.println("enter the inserting value : ");
				int value = scanner.nextInt();
				linkedlist.insertAt(position, value);
				linkedlist.toPrint();
				break;
			case 4:
				System.out.println("Deleted first key is : " + linkedlist.pop());
				break;
			case 5:
				System.out.println("Deleted last key is : " + linkedlist.popLast());
				break;
			case 6 :
				System.out.println("The element is found " + linkedlist.toSearch(userInterface.inputData()));
			}
					if(num==0) {
						break;
					}
		}
		
		linkedlist.toPrint();
	}

	}
