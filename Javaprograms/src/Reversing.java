import java.util.Scanner;

public class Reversing {
	
	public static void main(String args[])
	{
		String str;
		
		int len,k=0;
		Scanner sc= new Scanner(System.in);
		str=sc.nextLine();
		len=str.length();
		
		char c[]=new char[len+1];
		while(len!=0)
		{
			c[++k]=str.charAt(--len);
		}
		String s = new String(c);
		System.out.print(s);
		sc.close();
	}

}
