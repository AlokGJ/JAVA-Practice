package string;

import java.io.IOException;

public class Strings {
	String str;
	
	Strings(String s){
		str=s;
	}
	Strings()
	{
		str=null;
	}
	
	public int compareTo(Strings s)
	{
		char[] temp1=this.toString().toCharArray();
		char[] temp2=s.toString().toCharArray();
		
		{
			for(int i=0;i<temp1.length;i++){
				if(temp1[i]!=temp2[i])
				{
					byte b=(byte) temp1[i];
					byte b1=(byte) temp2[i];
					return b-b1;
				}
			}
		}
		return 0;
	}
	
	public String toString(){
		return str;
	}
	
	public static void main(String args[])
	{
//		String str1="ABC";
//		String str2=str1;
//		System.out.println(str1 + " equals " + str2 + " -> " + str1.equals(str2));
//		System.out.println(str1 + " == " + str2 + " -> " + (str1==str2));
//		
//		Strings s=new Strings("EC");
//		Strings s1=new Strings("DD");
//		System.out.println(s1.compareTo(s));
//		Runtime r=Runtime.getRuntime();
//		Process p=null;
//		
//		try {
//			p=r.exec("msconfig");
//			try {
//				p.waitFor();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(p.exitValue());
		int n=7;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.println(i);
		}
	}
}
