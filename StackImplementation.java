class Stack
{
	private int top;
	private int maxsize;
	private int[] arr;

	Stack(int maxsize)
		{
			this.top=-1;
			this.maxsize=maxsize;
			arr = new int[maxsize];
		}
	//checking the stack is full or not 
	 public boolean isFull()
		{
			if(top>=maxsize-1)
				{
					return true;
				}
			return false;
		}
	public boolean isEmpty() 
		{
			if (top < 0) 
				{
					return true;
				}
			return false;
		}

	public boolean push(int data)
		{
			if(isFull())
				return false;
			else
				{
					top++;
					arr[top]=data;
					return true;
				}
		}
	public void display()
		{
		if(top<0)
			{
			System.out.println("Stack is empty");
			}
		else
			{
				int temp=top;
				while(temp>-1)
					{
						System.out.println(arr[temp]);
						temp--;
					}
			}

		}
		public int pop()
		{
		if(top<0)
			{
			System.out.println("Stack is empty");
				return Integer.MIN_VALUE;
			}
		else
			{
				top--;
				return arr[top];
				
			}
		

		}
		public int peek() 
			{
				if (isEmpty())
					return Integer.MIN_VALUE;
				else
					return arr[top];
			}

}

class StackImplementation 
{
	public static void main(String[] args) 
	{
		Stack stack = new Stack(5);
        System.out.println("Stack created.\n");
		if (stack.push(1))
			System.out.println("The element is pushed to the stack!\n");
		else
			System.out.println("Stack is full!\n");

		if (stack.push(2))
			System.out.println("The element is pushed to the stack!\n");
		else
			System.out.println("Stack is full!\n");

		if (stack.push(3))
			System.out.println("The element is pushed to the stack!\n");
		else
			System.out.println("Stack is full!\n");

		if (stack.push(4))
			System.out.println("The element is pushed to the stack!\n");
		else
			System.out.println("Stack is full!\n");

		if (stack.push(5))
			System.out.println("The element is pushed to the stack!\n");
		else
			System.out.println("Stack is full!\n");

		stack.display();

		if (stack.push(6))
			System.out.println("The element is pushed to the stack!\n");
		else
			System.out.println("Stack is full!\n");

		System.out.println("The top element is : " + stack.peek());

		int poppedElement = stack.pop();
		if (poppedElement == Integer.MIN_VALUE)
			System.out.println("Stack is empty\n");
		else
			System.out.println("The element popped out is : " + poppedElement + "\n");

		poppedElement = stack.pop();
		if (poppedElement == Integer.MIN_VALUE)
			System.out.println("Stack is empty\n");
		else
			System.out.println("The element popped out is : " + poppedElement + "\n");

		poppedElement = stack.pop();
		if (poppedElement == Integer.MIN_VALUE)
			System.out.println("Stack is empty\n");
		else
			System.out.println("The element popped out is : " + poppedElement + "\n");

		poppedElement = stack.pop();
		if (poppedElement == Integer.MIN_VALUE)
			System.out.println("Stack is empty\n");
		else
			System.out.println("The element popped out is : " + poppedElement + "\n");

		poppedElement = stack.pop();
		if (poppedElement == Integer.MIN_VALUE)
			System.out.println("Stack is empty\n");
		else
			System.out.println("The element popped out is : " + poppedElement + "\n");

		poppedElement = stack.pop();
		if (poppedElement == Integer.MIN_VALUE)
			System.out.println("Stack is empty\n");
		else
			System.out.println("The element popped out is : " + poppedElement + "\n");

	}
}
