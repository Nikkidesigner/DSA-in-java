 class Node
{
	private String data;
	private Node next;

	Node(String data)
	{
		this.data=data;
		this.next=null;
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
					this.tail.setNext(node);
					this.tail=node;
				}
				System.out.println("Node added successfully");
		}
	//------------------------------add node at start -----------------------
	public void addNodeAtStart(String data)
		{
			Node node = new Node(data);
			if(this.head==null)
				{
				   this.head = this.tail = node;
				}
			else
				{
					node.setNext(this.head);
					this.head=node;
				}
				System.out.println("Node added successfully");
		}
	//------------------------------add node at particular position -----------------------
	public void addNodeAtRandom(String data1,String data2)
		{
			Node node = new Node(data1);
			if(this.head==null)
				{
				   this.head = this.tail = node;
				}
			else
				{
					Node temp=this.head, current=null;
					while(temp!=null)
					{
						if(temp.getData()==data2)
							{
								current=temp;
							}
						temp=temp.getNext();
					}
					node.setNext(current.getNext());
					current.setNext(node);
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
				while(temp!=null)
					{
						System.out.println(temp.getData());
						temp = temp.getNext();
					}
			}
	}

//--------------------------------------deleting a node--------------------------------------------
	public void DeleteNode(String data)
		{
		if(this.head==null)
			{
				System.out.println("list is empty ");
				return;
			}
			
			Node temp=this.head, before=null;
			
            if(temp!=null && temp.getData().equals(data))
				{
					this.head=temp.getNext();

					if(temp==this.tail)
						{
							this.tail=null;
						}
				  System.out.println("Node deleted successfully.");
				  return;
				}
			while(temp!=null && !temp.getData().equals(data))
				before=temp;
				temp=temp.getNext();
			  // Node not found
			if (temp == null)
				{
					System.out.println("Node with data " + data + " not found.");
					 return;
				}
				before.setNext(temp.getNext());

				if(temp==this.tail)
					{
						this.tail=before;
					}
			}

			
		
//----------------------------------------------------------------------------------
}
public class  LinkedListImplementPractice
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.addNodeAtStart("one");
		l.addNodeAtEnd("two");
		l.addNodeAtEnd("four");
		l.addNodeAtEnd("five");
		l.addNodeAtEnd("six");
		l.addNodeAtEnd("seven");
		l.addNodeAtEnd("eight");
		l.addNodeAtRandom("three","two");
		l.DeleteNode("one");
		l.displayNode();
		System.out.println("-------------------------------");
		l.DeleteNode("eight");
		l.displayNode();
		System.out.println("-------------------------------");
		l.DeleteNode("five");
		l.displayNode();
	}
}
