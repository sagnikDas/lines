
public class Factorial {
	
	public static void main(String args[])
	{
		int x=5, fact=1, facto=0;
		facto=factorial(x);
		System.out.print(facto);
		
	}
	static int factorial(int f)
	{
		if(f==0)
			return 1;
		return f*factorial(f-1);
		
	}

}
