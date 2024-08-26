
class Queue
{
	private int maxsize;
	private int front;
	private int rear;
	private String arr[];
	
	public Queue(int maxsize)
		{
			this.rear = -1;
			this.front = 0;
			this.maxsize=maxsize;
			this.arr = new String[maxsize];
		}
	public boolean isFull()
		{
			if(this.rear==this.maxsize-1)
				return true;

				return false;
		}
		public boolean enqueue(String data) 
			{
				if (isFull())
					{
						return false;
					}			
				else
					{
						arr[++rear] = data;
						return true;
					}
			}
		public boolean isEmpty()
			{
				if(this.rear==-1||this.front>this.rear)
					{
						return true;
					}
				else
					return false;
			}
		public void display()
		{
			System.out.println("Displaying queue elelments :");
			for(int index=front;index<=rear;index++)
				{
					System.out.println(arr[index]);
				}
		}
		public boolean dequeue()
		{
			if (isEmpty())
			{
				return false;
			}
			else
			{
				System.out.println(arr[front]+" is dequeued.");
				arr[front]=null;
				front++;
				return true;
			}
			
		}
}
class queueImplementation 
{
	
	public static void main(String[] args) 
	{
		Queue queue = new Queue(5);
		System.out.println("Queue created.\n");
        if (queue.enqueue("Joe"))
			System.out.println("The element is enqueued to the queue!\n");
        else
            System.out.println("Queue is full!\n");
        if (queue.enqueue("Jack"))
			System.out.println("The element is enqueued to the queue!\n");
        else
            System.out.println("Queue is full!\n");
        if (queue.enqueue("Eva"))
			System.out.println("The element is enqueued to the queue!\n");
        else
            System.out.println("Queue is full!\n");
        if (queue.enqueue("Mia"))
			System.out.println("The element is enqueued to the queue!\n");
        else
            System.out.println("Queue is full!\n");
        if (queue.enqueue("Luke"))
			System.out.println("The element is enqueued to the queue!\n");
        else
            System.out.println("Queue is full!\n");

		 queue.display();
		 queue.dequeue();
		 queue.display();
		
	}
}
