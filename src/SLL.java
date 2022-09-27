
public class SLL {

	Node head;
	int counter;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	//default constructor
	public SLL() {
		head = null;
	}
	
	//copy constructor
	public SLL(SLL aList) {
		Node temp = new Node(head.data);
		temp = head;
	}
	
	//accessing first element
	public void front() {
		System.out.println(head.data);
	}
	
	//accessing last element
	public void back() {
		Node temp = new Node(head.data);
		temp = head;
		
		for (int i = 0; i < counter - 1; i++) {
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	//insert value
	public void insert(int val) {
		if (head == null) {
			head = new Node(val);
			counter++;
		}
		
		else {
			Node newNode = new Node(val);
			newNode.next = head;
			head = newNode;
		
			counter++;
		}
	}
	
	//remove value at front
	public void pop_front() {
		Node temp = new Node(head.data);
		temp = head;
		temp = temp.next;
		head = temp;
		counter--;
	}
	
	//remove value at end
	public void pop_back() {
		Node temp = new Node(head.data);
		temp = head;
		
		for (int i = 0; i < counter - 1; i++) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
		
		temp = null;
		counter--;

	}

	//determines if empty
	public Boolean empty() {
		if (head == null) {
			return true;
		}
		else {
			return false;	
		}
	}
	
	//returns number of elements
	public int size() {
		return counter;
	}
	
	//reverses order of elements in the list
	public void reverse() {
		SLL sll2 = new SLL();
		Node temp = new Node(head.data);
		temp = head;
				
		for (int i = counter; i > 0; i--) {
			sll2.insert(temp.data);
			temp = temp.next;
		}
		sll2.print();
	}
	
	//play with reverse method here - fix order of merged list
	//merge with another ordered list
	public void merge(SLL aList) {
		Node temp = new Node(head.data);
		temp = head;
				
		for (int i = counter; i > 0; i--) {
			//aList.reverse();
			aList.insert(temp.data);
			temp = temp.next;
		}
		aList.print();
	}
	
	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
