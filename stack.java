class Stack
{
	int stack[];
	int top;
	int maxSize;

	public Stack(int maxSize)
	{
		this.stack = new int[maxSize];
		this.maxSize = maxSize;
		top = -1;
	}

	void push(int value)
	{
		//stack overflow
		if(top == maxSize-1)
		{
			System.err.println("overflow");
			return;
		}
		
		stack[++top] = value;
		System.out.println("Pushed :" + value);
	}
	
	void pop()
	{
		if(top == -1)
		{
			System.err.println("Stack Underflow");
			return;
		}

		System.out.println("Popped: " + stack[top--]);

	}

	void peek()
	{
		System.out.println("Value: " + stack[top]);
	}

	bool isEmpty()
	{
		return top == -1;
	}
}
