import java.util.*;
public class Demo {
	/**
	 * @param args
	 */
	public static void main(String args[]) throws ArithmeticException{
		int a=0,b=0,c=0;
		Random r=new Random();
		for(int i=0;i<100;i++){
			try{
				a=r.nextInt()/100000000;
				b=r.nextInt()/100000000;
				c=10*(a/b);
				System.out.println("i: "+i+" C: "+c+" "+a+" "+b);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
				a=0;b=0;
			}
		}
	}
}
