package stack;

public class Stack<T> {
	public static int MAX_SIZE=10;
	private int top;
	private T[] stack;
	
	Stack(T[] o)
	{
		top=-1;
		stack=o;
	}
	
	public Stack() {
		// TODO Auto-generated constructor stub
	}

	public boolean push(T item)
	{
		if(this.top==(Stack.MAX_SIZE-1))
		{
			System.out.println("Stack Full");
			return false;
		}
		stack[++top]=item;
		return true;		
	}
	
	public T pop()
	{
		if(top==-1)
			return null;
		return stack[top--];	
	}
	
	public int getMaxLength()
	{
		return stack.length;
	}
	
	public void setMaxLength(int length)
	{
		Stack.MAX_SIZE=length;
	}
	
	public int topOfStack()
	{
		return top;
	}
}
