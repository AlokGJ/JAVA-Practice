package throwspack;

public class ThrowsExcp {
	public void throwone() throws IllegalAccessException
	{
		System.out.println("Inside Throwone");
		throw new IllegalAccessException("Exception: From Throws");
	}
	
	public static void main(String args[]) throws IllegalAccessException{
		
		try{
			ThrowsExcp t=new ThrowsExcp();
			//t.throwone();
		}
//		catch(IllegalAccessException iae){
//			System.out.println(iae.getMessage());
//		}
		finally{
			
		}
		
		try{
			int a[]=new int[10];
			a[11]=1;
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
