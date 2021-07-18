package stcks;

import java.util.Scanner;

public class Operations {
	static Scanner sc = new Scanner(System.in);

	public static int askUser() {
		System.out.println("Stack Operations ::");
		System.out.println("Press 1 to Push");
		System.out.println("Press 2 to display stack");
		System.out.println("press 3 to exit");
		
		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		StackQueue obj = new StackQueue();

		boolean result = true;
		while (result) {
			int choice1 = askUser();
			switch (choice1) {

			case 1:
				System.out.println("Enter element to push : ");
				int push = sc.nextInt();
				obj.push(push);
				result = true;
				break;
			case 2:
				obj.printStack();
				result = true;
				break;

			case 3:
				result = false;
				break;

			}
		}

	}

}
