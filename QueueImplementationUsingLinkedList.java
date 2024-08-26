class Node
{
	private int data;
	private Node next;

	public Node(int data)
		{
			this.data=data;
			this.next=null;
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
					this.tail=node;
				}
			System.out.println(node.getData()+" enqueued successfuly. \n");
		}
	public void dequeue()
		{
			if(this.head==null)
				{
					System.out.println("Queue is empty");
				}
			else
				{
				System.out.println(this.head.getData()+" dequeued successfuly. \n");
					this.head=this.head.getNext();
					
				}
		}
	public void display()
		{
			Node temp=this.head;
			while(temp!=null)
				{
					System.out.println("\t"+temp.getData());
					temp=temp.getNext();
				}

		} 
}
class  QueueImplementationUsingLinkedList
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
