 class Node
{
	private String data;
	private Node next;
	private Node prev;

	Node(String data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
	public void setData(String data)
	{
		this.data=data;
	}
	public String getData()
	{
		return this.data;
	}
	public void setNext(Node next)
	{
		this.next=next;
	}
	public Node getNext()
	{
		return this.next;	
	}
	public void setPrev(Node prev)
	{
		this.prev=prev;
	}
	public Node getPrev()
	{
		return this.prev;	
	}
}
 class LinkedList
{
	private Node head;
	private Node tail;
	
	public Node getHead()
	{
		return this.head;
	}
	public Node getTail()
	{
		return this.tail;
	}
//------------------------------add node at end ---------------------------------------	
	public void addNodeAtEnd(String data)
		{
			Node node = new Node(data);
			if(this.head==null)
				{
				   this.head = this.tail = node;
				}
			else
				{
					node.setPrev(tail);
					this.tail.setNext(node);
					this.tail=node;
				}
				System.out.println("Node added successfully");
		}
//-------------------------------display node--------------------------------
public void displayNode()
	{
		Node temp=this.head;
		if(this.head==null)
			 {
				System.out.println("The linked list is empty.");
			 }
		else
			{
				System.out.println("Forward linked list");
				while(temp!=null)
					{
						System.out.println("->"+temp.getData());
						temp = temp.getNext();
					}
					temp=this.tail;
				System.out.println("Backward linked list");
					
				while(temp!=null)
					{
						System.out.println("->"+temp.getData());
						temp = temp.getPrev();
					}
			}
	}

//----------------------------------------------------------------------------------
}
public class  DoublyLinkedList
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.addNodeAtEnd("Nikhil");
		l.addNodeAtEnd("Ajinkya");
		l.addNodeAtEnd("Prathamesh");
		l.addNodeAtEnd("Omkar");
		l.addNodeAtEnd("Aditya");
		l.displayNode();
	}
}
