package implementation;

class Node {
		Object data;
		Node next;
		
		public Node(Object data) {
			this.data = data;
		}
	}

class LinkedList2
{
	
	 Node head;
	 Node tail;
	public void insert(Object data) 
	{
		Node n = new Node(data);
		if (this.head == null) 
		{
			this.head = n;
			this.tail = n;
			tail.next = null;
		}
		else 
		{
			tail.next=n;
			tail=n;
			tail.next=null;
		}
	}
	public void delete(Object data) 
	{
		if (this.head==null) {
			System.out.println("Linkedlist is empty");
		}else {
			tail=head;
			while (tail.next!=null) {
				if(tail.data==data) {
					
				}
			}
		}
	}
	public void display()
	{
		Node temp=head;
		while (temp.next!=null) 
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
}

public class LinkedList{
	public static void main(String[] args) {
		LinkedList2 linkedList2 = new LinkedList2();
		linkedList2.insert(4);
		linkedList2.insert(5);
		linkedList2.insert(6);
		linkedList2.display();
		
	}
}
