class Queue
{
    private int front;
	private int rear;
	private int maxsize;
	private int[] arr;
	private int data;

	public Queue(int maxsize)
		{
			this.front=-1;
			this.rear=-1;
			this.maxsize = maxsize;
			arr=new int[maxsize];
		}
	public void setData(int data)
		{
			this.data=data;
		}
	
	public void enqueue(int data)
		{
			if(this.front==-1 && this.rear==-1)
						{
							this.front++;
							this.rear++;
							arr[this.rear]= data;
							System.out.println(arr[this.rear]+" is enqueued.");
						}
			else
				{
					this.rear++;
					if(this.rear==maxsize)
						{
							
							System.out.println("Queue is full.\n");
							this.rear--;
							
						}		
				
					else
						{
						
							arr[this.rear]=data;
							System.out.println("\n"+arr[this.rear]+" is enqueued.");
						}
					
					
				}
			
		}
	

	public void dequeue()
		{
			if(this.front>this.rear)
				{
					System.out.println("Queue is empty.\n");
				}
			else
				{
					System.out.println("\n"+arr[front]+" is dequeued.");
					front++;
				}
		}
	public void display(Queue q)
		{
			int temp=this.front;
			while(temp<this.maxsize)
				{
					System.out.print("\t"+arr[temp]);
					temp++;
				}
			
		}


}
public class QueueImplementationUsingArray 
{
	public static void main(String[] args) 
	{
		Queue q = new Queue(7);
		q.enqueue(1);
		q.enqueue(2);
		q.display(q);
		q.dequeue();
		q.display(q);
		q.enqueue(3);
		q.enqueue(4);
		q.display(q);
		q.dequeue();
		q.display(q);
		q.enqueue(5);
		q.enqueue(6);
		q.display(q);
		q.dequeue();
		q.display(q);
		q.enqueue(7);
		q.enqueue(8);
		q.display(q);
		q.dequeue();
		q.display(q);
		
		
		
		
		
	}
}
