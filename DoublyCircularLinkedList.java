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
	public void addNode(String data)
	{
		Node node = new Node(data);
		if(this.head==null)
			{
				this.head=this.tail=node;
				node.setPrev(this.tail);
				node.setNext(this.head);
			}
		else
			{
				node.setPrev(this.tail);
				node.setNext(this.head);
				this.tail.setNext(node);
				this.head.setPrev(node);
				this.tail=node;
			}
		System.out.println("Node Added successfully.");
	}
	public void displayNode()
		{
			Node temp=this.head;
			if(temp==null)
				{
					System.out.println("List is empty");
				}
				else
				{
					System.out.println("forward List :");
				 while(true)
					{
						System.out.println(temp.getData());
						temp=temp.getNext();
						if(temp==this.head)
							{
								break;
							}
					 }
					 temp=this.tail;
					 System.out.println("backward List :");
				 while(true)
					{
						System.out.println(temp.getData());
						temp=temp.getPrev();
						if(temp==this.tail)
							{
								break;
							}
					 }	
				}
		}
}
public class  DoublyCircularLinkedList
{
	public static void main(String[] args) 
	{
		LinkedList list =new LinkedList();
		list.addNode("one");
		list.addNode("two");
		list.addNode("three");
		list.addNode("four");
		list.addNode("five");
		list.addNode("six");
		list.displayNode();
	}
}
