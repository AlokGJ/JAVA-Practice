package stack;

public class Demo {
	public static void main(String args[])
	{
		Stack<String> s=new Stack<String>(new String[Stack.MAX_SIZE]);
		for(int i=0;i<Stack.MAX_SIZE+1;i++)
		{
			s.push("Item "+(Stack.MAX_SIZE-i));
			System.out.println("Pushed Element: "+(Stack.MAX_SIZE-i));
			System.out.println("Top: "+s.topOfStack());
		}
		for(int i=0;i<Stack.MAX_SIZE;i++)
		{
			System.out.println("Poped String: "+s.pop());
		}
	}
}
