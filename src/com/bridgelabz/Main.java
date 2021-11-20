package com.bridgelabz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		LinkedList linkedlist = new LinkedList();
		ListUserInterface userInterface = new ListUserInterface();
			while (true) {
				int number = userInterface.userMenu();
			
		switch (number) {
			case 1:
				linkedlist.add(userInterface.inputData());
				break;
			case 2 : 
				linkedlist.push(userInterface.inputData());
			case 3:
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
			
			case 7:
				System.out.println("Enter the value to be searched :");
				int searchElement = scanner.nextInt();
				System.out.println("enter insert value : ");
				int data = scanner.nextInt();
				linkedlist.insertAfterSearch(searchElement, data);
			case 8 :
				System.out.println("enter the value to delete : ");
				int element = scanner.nextInt();
				linkedlist.delete(element);
				linkedlist.toPrint();
				break;
		
		}
			if(number == 0) {
						break;
			}
		}
		
		linkedlist.toPrint();
}
}
