package linkedList;

public class Rotate_a_LinkedList {
	
	Node head;
	
	class Node
	{
		int data;
		Node next;
		Node(int x)
		{
			data = x;
			next = null;
		}
	}
	
	void push(int newdata)
	{
		Node new_Node = new Node(newdata);
		
		new_Node.next = head;
		head = new_Node;
		
	}
	
	void printList()
	{
		Node tnode = head;
		
		while(tnode!=null)
		{
			System.out.print(tnode.data+" ");
			tnode = tnode.next;
		}
	}
	
	void rotate(int k)
	{
		if(k==0)
			return;
		
		int count=1;
		Node current = head;
		
		while(count<k&&current!=null)
		{
			current = current.next;
			count++;
		}
		
		if(current==null)
			return;
		
		Node kthElement = current;
		
		while(current.next!=null)
		{
			current = current.next;
		}
		
		current.next = head;
		
		head = kthElement.next;
		
		kthElement.next = null;
		
	}
	
	public static void main(String[] args)
	{
		
		Rotate_a_LinkedList obj = new Rotate_a_LinkedList();
		
		obj.push(10);
		obj.push(15);
		obj.push(20);
		obj.push(25);
		obj.push(30);
		obj.push(35);
		obj.push(40);
		
		System.out.println("Before Rotate : ");
		obj.printList();
		
		System.out.println();
		System.out.println("After Rotate : ");
		obj.rotate(4);
		obj.printList();

	}

}
