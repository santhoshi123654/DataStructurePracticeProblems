package com.bridgelabz;

import java.util.Scanner;

public class ListUserInterface {

public int inputData() {
		
		System.out.println("enter the  element : ");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		return value;	
	}
	
	public int userMenu() {
		
		System.out.println(" enter 1 : for appending \n enter 2 : to push the element \n enter 3 : to insert at position"
				+ "\n enter 4 : to pop the element \n enter 5 : to pop at last \n enter 6 : for searching an element"
			+ "\n enter 7 : to insert the value after  the searched value " + " \n enter 0 : to exit program ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		return number;
	}
	
}