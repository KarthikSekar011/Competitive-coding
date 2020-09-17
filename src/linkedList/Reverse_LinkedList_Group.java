package linkedList;

public class Reverse_LinkedList_Group
{
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
		Node newNode = new Node(newdata);
		newNode.next = head;
		head = newNode;
		
	}
	
	void printList()
	{
		Node tnode = head;
		
		while(tnode!=null)
		{
			System.out.print(tnode.data+" ");
			tnode = tnode.next;
		}
		System.out.println();
	}
	
	Node reverse(Node node,int k)
	{
		
		Node next = null;
		Node curr = node;
		Node prev = null;
		
		int count=0;
		
		while(count<k && curr!=null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		
		if(next!=null)
			head.next = reverse(next,k);
		
		return prev;
	}

	public static void main(String[] args) {
		
		Reverse_LinkedList_Group obj = new Reverse_LinkedList_Group();
		
		obj.push(10);
		obj.push(15);
		obj.push(20);
		obj.push(25);
		obj.push(30);
		obj.push(35);
		obj.push(40);
		
		System.out.println("Before Rearrange : ");
		obj.printList();
		
		
		System.out.println("After Rearrange : ");
		
		obj.head = obj.reverse(obj.head, 3);
		obj.printList();
		
	}

}
