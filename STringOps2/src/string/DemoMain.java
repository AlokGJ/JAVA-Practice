package string;

public class DemoMain {
	public static void main(String args[])
	{
		ToStrings string=new ToStrings(10.35, 2.21, 2.3);
		System.out.println(string);
		
		
		String str="Hi.. Hello! there..";
		char[] chr=new char[100];
		int i=0,j=0;
		while(i<str.length())
		{
			if(str.charAt(i)!=' ')chr[j++]=str.charAt(i);
			i++;
		}
		System.out.println(new String(chr).length());
	}
}
