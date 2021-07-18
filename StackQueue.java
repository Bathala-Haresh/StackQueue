package stcks;
public class StackQueue {
	MyNode head;

	MyNode front = null;
	MyNode rear = null;
	
	public void push(int element) {
		MyNode newNode = new MyNode();
		newNode.data = element;
		newNode.next=null;
		newNode.next = head;
		head = newNode;

	}

	//method to pop element from stack
	public void pop() {
		if (head == null)
			System.out.println("\n" + "Stack is Empty!");
		else {
			MyNode temp = head;
			System.out.printf("Popped element is : %d", temp.data);
			System.out.println();
			head = temp.next;
		}
	}

	//Method to display peek element in stack
	public int peek() {
		if (head != null)
			return head.data;
		else {
			System.out.println("Stack is empty");
			return 0;
		}
	}
    
	//method to display elements in stack
	public void printStack() {
		MyNode tempNode = head;
		while(tempNode != null) {
			System.out.println(tempNode.data);
			tempNode =tempNode.next;
		}
	}

   //method to add elements in queue
	public void enqueue(int element) {
		MyNode node = new MyNode();
		node.data = element;
		// If queue is empty then both front and rear are same
		if (front == null) {
			front = node;
			rear = node;
		} else {
			// Add the new node at the end of queue and change rear
			rear.next = node;
			rear = node;
		}
	}
	

	//display elements in queue
	public void displayQueue() {
		if (front == null)
			System.out.println("Stack is Empty");
		else {
			MyNode temp = front;
			while (temp.next != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
}