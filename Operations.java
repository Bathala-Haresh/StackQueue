package stcks;

import java.util.Scanner;

public class Operations {
	static Scanner sc = new Scanner(System.in);

	public static int askUser() {
		System.out.println("Stack Operations ::");
		System.out.println("Press 1 to Push");
		System.out.println("Press 2 to Pop");
		System.out.println("Press 3 to Peek");
		System.out.println("Press 4 to display stack");
		System.out.println("Queue Operations ::");
		System.out.println("Press 5 to Enqueue");
		System.out.println("Press 6 to dequeue");
		System.out.println("Press 7 to display queue");
		System.out.println("press 8 to quit");
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
				obj.pop();
				result = true;
				break;

			case 3:
				System.out.println("Last element is: " + obj.peek());
				result = true;
				break;

			case 4:
				obj.printStack();
				result = true;
				break;
				
			case 5:
				System.out.println("Enter element to add for queue : ");
				int enqueue = sc.nextInt();
				obj.enqueue(enqueue);
				result = true;
				break;
			case 6:
				obj.dequeue();
				result=true;
				obj.displayQueue();
				break;
				
			case 7:
				obj.displayQueue();
				result = true;
				break;	

			case 8:
				result = false;
				break;

			}
		}

	}

}
