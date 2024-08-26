class Node
{
	private int data;
	private Node next;

	public Node(int data)
		{
			this.data = data;
			this.next = null;
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
	
	public Node getHead()
	{
		return this.head;
	}
	public Node getTail()
	{
		return this.tail;
	}

	public void push(int data)
		{
			//case 1 : list is empty
			Node node = new Node(data);
			if(this.head==null)
				{
					this.head=this.tail=node;
				}
			//case 2 : list is not empty
			else
				{
					this.tail.setNext(node);
					this.tail=node;
				}
			System.out.println("Data pushed into stack");
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
	public void pop()
		{
			if(this.head==null)
				{
					System.out.println("stack is empty");
				}
			else
				{
					Node temp = this.head;
					while(temp!=null && temp.getNext()!= this.tail)
						{
							
							temp=temp.getNext();
						}
						System.out.println((temp.getNext().getData())+" popped out of the  stack");
						this.tail=temp;
						temp.setNext(null);
						
				}
		}


}
class  StackUsingLinkedList
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(6);
		list.pop();
		list.pop();
		list.pop();
		list.display();
		
	}
}
