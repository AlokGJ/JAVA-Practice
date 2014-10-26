package strings;

public class Strings {
	public static void main(String args[]){
		char[] chr={'A','L','O','K'};
		byte[] ascii={65,66,67,68,69,70};
		
		//String Initialization
		String str=new String(chr);
		System.out.println(str);
		
		str=new String(ascii);
		System.out.println(str);
		
		for(int i=33;i<128;i++)
		{
			byte[] b={(byte) i};
			str=new String(b);
			System.out.print(i + " " + b[0]);
			System.out.println(str);
		}
	}
}
