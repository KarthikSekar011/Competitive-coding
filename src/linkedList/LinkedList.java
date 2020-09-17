package linkedList;

public class LinkedList 
{
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
	
	public void Print()
	{
		Node tnode = head;
		while(tnode!=null)
		{
			System.out.print(tnode.data+" ->");
			tnode = tnode.next;
		}
		System.out.println("null");
	}
	
	public void printMiddle()
	{
		Node slowNode = head;
		Node fastNode = head;
		
		if(head!=null)
		{
			while(fastNode!=null&&fastNode.next!=null)
			{
				fastNode = fastNode.next.next;
				slowNode = slowNode.next;
			}
			System.out.println("Middle Element is : ["+slowNode.data+"]");
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		
		LinkedList list = new LinkedList();
		
		for(int i=5;i>=1;i--)
		{
			list.push(i);
			list.Print();
			list.printMiddle();
		}
	}

}
