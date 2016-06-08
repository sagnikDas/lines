
public class Prime {
	
	public static void main(String args[])
	{
		int n=11;
		if(n>2 && n%2==0)
		{
			System.out.println("not prime");
			return;
		}
		
		int top=(int)Math.sqrt(n)+1;
		for(int i=3;i<top;i+=2)
		{
			if(n%i==0)
			{
				System.out.println("not prime");
				return;				
			}
		}
		System.out.println("prime");


	}

}
