class Node
{
	private int data;
	private Node next;
	private Node Prev;

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
class DoublyLinkedList
{
	private Node head;
	private Node tail;

	public void push(int data)
		{
		Node node = new Node(data);
			if(this.head==null)
				{
					this.head=this.tail=node;
				}
			else
				{
					tail.setNext(node);
					node.setPrev(this.tail);
					this.tail=node;
				}
				System.out.println("Element pushed successfuly");
		}
	public void pop()
		{
			if(this.head==null)
				{
					System.out.println("Stack is empty.");
				}
			else
				{
					
					System.out.println("the Element"+this.tail.getData()+" popped successfuly");
					Node temp=this.tail.getPrev();
					temp.setNext(null);
					this.tail=temp;
					
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
class StackImplementationUsingDoublyLinkedList 
{
	public static void main(String[] args) 
	{
		DoublyLinkedList list = new DoublyLinkedList();
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