package exceptions;

class DemoException{
	public void dividebynumber(int a,int b){
		try{
			int c=a/b;
			System.out.println("C: "+c);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Program about Exception");
		}
	}
}

public class Aloks_Exception {
	public static void main(String args[])
	{
		DemoException d=new DemoException();
		d.dividebynumber(10, 0);
		
	}
}
