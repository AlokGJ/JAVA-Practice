package MyPack;

public class Dummy {
	public void foo()
	{
		System.out.println("Foo");
		A a=new A();
		a.a();
	}
}
class A{
	public void a()
	{
		System.out.println("A");
	}
}