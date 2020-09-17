package linkedList;

public class LinkedList_Reverse {
	
	Node head;
	
	class Node
	{
		int data;
		Node next;
		Node(int Data)
		{
			data = Data;
			next = null;
		}
	}
	
	public void push(int NewData)
	{
		Node newNode = new Node(NewData);
		
		newNode.next = head;
		
		head = newNode;
		
	}
	
	public void printList()
	{
		Node tnode = head;
		while(tnode!=null)
		{
			System.out.print(tnode.data+" ");
			tnode = tnode.next;
		}
	}
	
	public Node reverseList(Node node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
		
		while(current!=null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	public static void main(String[] args)
	{
		
		LinkedList_Reverse list = new LinkedList_Reverse();
		list.push(10);
		list.push(15);
		list.push(20);
		list.push(25);
		list.push(30);
		
		System.out.println("Before Rearrang : ");
		list.printList();
		System.out.println();
		System.out.println("After Rearrange : ");
		list.head = list.reverseList(list.head);
		list.printList();

	}

}
