class Node
{
	private String data;
	private Node next;
	
	public Node(String data)
	{
		this.data=data;
		this.next=null;
	}
	public void setData(String data)
		{
			this.data=data;
		}
	public void setNext(Node next)
		{
			this.next=next;
		}
	public String getData()
		{
			return this.data;
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
     
	public void setHead(Node head)
		{
			this.head=head;
		}
	public void setTail(Node tail)
		{
			this.tail=tail;
		}
	public void addNode(String data)
		{
			 Node node = new Node(data);
			 if(this.head==null)
				 {
					this.head=this.tail=node;
					tail.setNext(head);
				 }
			else
				{
					this.tail.setNext(node);
					this.tail=node;
					this.tail.setNext(this.head);

				}
			System.out.println("Node added succesfully");
		}
	public void displayNode()
	{
			System.out.println("linked list :");
		
		if(this.head==null)
		{
			System.out.println("empty list");
		}
		else
		{
			Node temp =this.head;
			//method 1 : 
			do
			{
						System.out.println("->"+temp.getData());
						temp=temp.getNext();
			}
			while(temp!=this.head);
			//method 2 :
			/* while (true) {
            System.out.println("-> " + temp.getData());
            temp = temp.getNext();
            if (temp == this.head) {  // Stop if we've come back to the head
                break;
            }*/
					
		}
	}
}

public class SinglyCircularLinkedList
{
	public static void main(String[] args)
		{
			LinkedList list = new LinkedList();
			list.addNode("one");
			
			list.addNode("two");
			list.addNode("three");
			list.addNode("four");
			list.addNode("five");
			
		    list.displayNode();
		}
}
