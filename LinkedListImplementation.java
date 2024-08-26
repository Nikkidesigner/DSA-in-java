
	class Node
		{
			private String data;
			private Node next;
    
			Node(String data)
			{
				this.data = data;
				this.next = null;
			}
			public void setdata(String data)
				{
					this.data = data;
				}
			public void setnext(Node nextNode)
				{
					this.next=nextNode;
				}
			public String getdata()
				{
					return this.data;
				}
			public Node getNode()
				{
					return this.next;
				}

	
	}
	 class LinkedList
		{
			private Node head;
			private Node tail;
			
			public Node gethead()
				{
					return this.head;
				}
			public Node gettail()
				{
					return this.tail;
				}
//------------------insert at the end of the list --------------------------------------------
		public void addAtEnd(String data)
		{
			Node node = new Node(data);
			if(this.head==null)
				{
					this.head=this.tail = node;
				}
			else
				{
					this.tail.setnext(node);
					this.tail=node;
				}
		}
//---------------------------insert at the start of the list --------------------------------------
	public void addAtBeginning(String data)
	{
        Node node = new Node(data);
        if(this.head==null)
        {
            this.head=this.tail=node;
        }
        else
        {
            node.setnext(head);
            this.head=node;
        }
        
	}
	//---------------------------insert at the random place of the list --------------------------------------
	public void addAtRandom(String data1, String data2)
	{
        Node node = new Node(data1);
		
        if(this.head==null)
        {
            this.head=this.tail=node;
        }
        else
        {
            Node current = this.find(data2);
			node.setnext(current.getNode());
			current.setnext(node);
			if(current==this.tail)
				{
					this.tail=node;
				}
			else
				System.out.println("Node not found");
        }
        
	}
//------------------------------display the list -----------------------------------
		  public void printList() 
		   {
				Node current = this.head;
				if(this.head==null)
					{
						System.out.println("Linked List is empty");
					}
		        while (current != null)
					{
						System.out.println(current.getdata());
						current = current.getNode();  // Move to the next node
					}
		  
			}
//--------------------------------------finding/searching a node in the list ----------------------------------		
		public Node find(String data)
			{
			
				Node current = this.head;
				int count=0;
				while(current!=null)
					{
						if(data==current.getdata())
						{
								System.out.println(" element found : \n"+current);
								return current;
						}

								current=current.getNode();
					
					}
					return null;
			}

//------------------------------------------deleting a node from linked list--------------------------------------
		public void DeleteNode(String data)
			{
			if(this.head==null)
				{
					System.out.println("Node not found");
				}
			else
				{
					Node node = this.find(data);
					if(node==null)
						{
							System.out.println("Node not found");
						}
					else if(node==this.head)
						{
							this.head=this.head.getNode	();
							node.setnext(null);
						
							if(node==this.tail)
								{
									tail=null;
								}
						}
					else
							{
								Node nodeBefore = null;
								Node temp =this.head;
								while(temp!=null)
									{
										if(temp.getNode()==node)
										{
											nodeBefore=temp;
											break;
										}
										temp = temp.getNode();
									}
									nodeBefore.setnext(node.getNode());
									if(node==this.tail)
										{
											this.tail=nodeBefore;
										}
											node.setnext(null);

							}
					
					
					


				}
			}
	//--------------------------------------------------------------------
		}


    class LinkedListImplementation 
{

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.addAtEnd("Milan");
		list.addAtEnd("Venice");
		list.addAtEnd("Munich");
		list.addAtEnd("Vienna");
		list.addAtBeginning("Nikhil");
		list.addAtRandom("Prague", "Munich");
		System.out.println(" elements of the linked list : \n");
		list.printList();
		list.find("Nikhil");
		list.DeleteNode("Munich");
		System.out.println("After deleting node : ");
		list.printList();
	}
}
