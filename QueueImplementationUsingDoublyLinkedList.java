class Node
{
	private int data;
	private Node Prev;
	private Node next;
	
	public Node(int data)
		{
			this.data=data;
			this.next=null;
			this.Prev=null;
		}
	public void setData(int data)
		{
			this.data=data;
		}
	public void setNext(Node next)
		{
			this.next=next;
		}
	public Node getNext()
		{
			return this.next;
		}
	public int getData()
		{
			return this.data;
		}
	public void setPrev(Node Prev)
		{
			this.Prev=Prev;
		}
	public Node getPrev()
		{
			return this.Prev;
		}
	
}
class LinkedList
{
	private Node head;
	private Node tail;

    public void enqueue(int data)
		{
		Node node = new Node(data);
			if(this.head==null)
				{
					this.head=this.tail=node;
					
				}
			else
				{
					
					this.tail.setNext(node);
					node.setPrev(this.tail);
					this.tail=node;
				}
				System.out.println(this.tail.getData()+" inserted into the queue.\n");
		}
	public void dequeue()
		{
			if(this.head==null)
				{
					System.out.println("the queue is empty.");
				}
			else
				{
					System.out.println(this.head.getData()+" is removed from the queue.\n");
					this.head=this.head.getNext();
					this.head.setPrev(null);
				}
		}
	public void display()
		{
			Node temp = this.head;
			while(temp!=null)
				{
					System.out.println("\t"+temp.getData());
					temp=temp.getNext();
				}
		}
	
	
}
class QueueImplementationUsingDoublyLinkedList 
{ 
	public static void main(String[] args) 
	{
		LinkedList q = new LinkedList();
		q.enqueue(1);
		q.enqueue(2);
		q.display();
		q.dequeue();
		q.display();
		q.enqueue(3);
		q.enqueue(4);
		q.display();
		q.dequeue();
		q.display();
		q.enqueue(5);
		q.enqueue(6);
		q.display();
		q.dequeue();
		q.display();
		q.enqueue(7);
		q.enqueue(8);
		q.display();
		q.dequeue();
		q.display();
	}
}
