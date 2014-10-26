package thread;

public class ThreadDemo implements Runnable {
	Thread t;
	String name;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
		for(int i=1;i<=5;i++)
		{
			System.out.println(this.t.getName()+" i="+i);
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException ie){
			
		}
	}
	ThreadDemo(String name){
		t=new Thread(this, name);
		t.start();
	}
	public static void main(String args[]){
		try{
			System.out.println("Hi this is the tryblock");		
		}
		catch(Exception e) {
			e.getMessage();
		}
	}

}