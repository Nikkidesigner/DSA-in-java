class Queue {
      
    private int front;
    private int rear;
    private int maxSize;
    private int arr[];
      
    Queue(int maxSize) {
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        this.arr = new int[this.maxSize];
    }
      
    public boolean isFull() {
        if (rear == maxSize - 1) {
            return true;
        }
        return false;
    }
            
    public boolean enqueue(int data) {
        if (isFull()) {
            return false;
        } else {
            arr[++rear] = data;
            return true;
        }
    }

    public void display() {
        if(isEmpty())
            System.out.println("Queue is empty!");
        else {
            for (int index = front; index <= rear; index++) {
                System.out.println(arr[index]);
            }
        }
    }
            
    public boolean isEmpty() {
        if (front > rear)
            return true;
        return false;
    }
            
    public int dequeue() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            int data = arr[this.front];
            arr[front++] = Integer.MIN_VALUE;
            return data;
        }
    }

    public int getMaxSize() {
        return maxSize;
    }
}


class DivisibilityInQueue 
{

    public static void main(String[] args) {
            
        Queue queue = new Queue(7);
        queue.enqueue(13983);
        queue.enqueue(10080);
        queue.enqueue(7113);
        queue.enqueue(2520);
        queue.enqueue(2500);

        Queue outputQueue = findEvenlyDivisibleNumbers(queue);
            
        System.out.println("Evenly divisible numbers");
        outputQueue.display();

    }
      /*
    public static Queue findEvenlyDivisibleNumbers(Queue queue)
		{
			Queue outputQueue = new Queue(queue.getMaxSize());
        
			while (!queue.isEmpty())
				{
					int num = queue.dequeue();
					boolean isDivisibleByAll = true;

					for (int i = 1; i <= 10; i++)
						{
							 if (num % i != 0)
								 {
									isDivisibleByAll = false;
									break;
								 }
						 }

					if (isDivisibleByAll) 
						{
							outputQueue.enqueue(num);
						}
			   }

			return outputQueue;
    
    }*/
	//------------------------------------------------------------
	  public static Queue findEvenlyDivisibleNumbers(Queue queue) 
		  {
			Queue tempqueue = new Queue(queue.getMaxSize());
       
        
            while(!queue.isEmpty())
            {
                int value = queue.dequeue();
				boolean flag=true;
                 for(int i=1;i<=10;i++)
                 {
                     if(value%i !=0)
                     {
                         flag=false;
                     }
                 }
				 if(flag)
				{
					tempqueue.enqueue(value);
				}
            }
        
        
				return tempqueue;
		  }
	//-------------------------------------------------------------


}
