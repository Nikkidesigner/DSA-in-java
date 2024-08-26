class Stack
{
	private int top;
	private int maxsize;
	private int[] arr;

	public Stack(int maxsize)
		{
			this.top=-1;
			this.maxsize=maxsize;
			arr = new int[maxsize];
		}
	public void push(int data)
		{
			if(this.top>=maxsize)
				{
					System.out.println("Stack is full");
				}
			else
				{
					this.top++;
					arr[top]=data;
					System.out.println("Data pushed into stack");
				}
			
		}
	public void pop()
		{
			if(this.top==-1)
				{
					System.out.println("Stack is empty");
				}
			else
				{
					int temp=arr[top];
					top--;
					System.out.println(temp+" is popped out of the stack");

				}
			
		}
	public void display()
		{
			int temp=top;
			while(temp!=-1)
				{
					System.out.println("\t"+arr[temp]);
					temp--;
				}
		}
}
class  StackimplementationPractice
{

	public static void main(String[] args) 
	{
		
		Stack s = new Stack(7);
		s.push(10);
		s.push(9);
		s.push(8);
		s.push(7);
		s.push(6);
		s.push(5);
		s.push(4);
		s.display();
		s.pop();
		s.pop();
		s.pop();
		s.display();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.display();

	}
}
