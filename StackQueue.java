package stcks;
public class StackQueue {
	MyNode head;

	//method to add elements in stack
	public void push(int element) {
		MyNode newNode = new MyNode();
		newNode.data = element;
		newNode.next=null;
		newNode.next = head;
		head = newNode;

	}

    
	//method to display elements in stack
	public void printStack() {
		MyNode tempNode = head;
		while(tempNode != null) {
			System.out.println(tempNode.data);
			tempNode =tempNode.next;
		}
	}
}

  