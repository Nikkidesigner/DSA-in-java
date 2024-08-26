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
	public Node getNext()
		{
			return this.next;
		}
	public String getData()
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
    public void addNode(String data)
		{
			Node node = new Node(data);
			if(this.head==null)
				{
					this.head=node;
					this.tail=node;
				}
			else
				{
					tail.setNext(node);
					this.tail=node;

				}

		}
		public void deleteNode(String data)
			{
				Node temp = this.head;
			
				if(this.head==null)
					{
						System.out.println("list is empty.");
					}
				else
					{
						while(temp!=null)
						{
							if(temp.getData()==data)
								{
								Node node =temp;
									if(node==this.head)
										{
											if(temp==this.tail)
												{
													this.head=this.tail=null;
												}
											else
												{
													this.head=node.getNext();
												}
											System.out.println("Node deleted successfully.");
												
										}
									else 
										{
										Node before=null;
											while(temp!=null)
												{
													if(temp.getNext()==node)
														{
															before=temp;
															break;
														}
												temp = temp.getNext();
												}
												before.setNext(temp.getNext());
												if(this.tail==node)
													{
														this.tail=before;
														before.setNext(null);
													}
										System.out.println("Node deleted successfully.");
										}
								}
						 temp=temp.getNext();
						}	
					}
				
				
			}
		public void printList() 
		   {
				Node current = this.head;
				if(this.head==null)
					{
						System.out.println("Linked List is empty");
					}
		        while (current != null)
					{
						System.out.println(current.getData());
						current = current.getNext();
					}
		  
			}
	
}
class DeleteNodeInLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.addNode("one");
		list.addNode("two");
		list.addNode("three");
		list.addNode("four");
		list.addNode("five");

		System.out.println("Deleting [one]");
		list.deleteNode("one");
		list.printList();

		System.out.println("Deleting [five]");
		list.deleteNode("five");
		list.printList();
		
		System.out.println("Deleting [three]");
		list.deleteNode("three");
		list.printList();
		
		


	}
}
