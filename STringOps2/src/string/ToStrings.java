package string;

public class ToStrings {
	Double l,b,h;
	public ToStrings(Double l,Double b,Double h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	
	public String toString(){
		return "Volume: "+(l*b*h);
	}
	
}
