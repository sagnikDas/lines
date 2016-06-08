
public class Mindifference {

	public static void main(String args[])
	{
		int a[]={1, 5, 3, 19, 18, 25};
		
		int i,j,aa=0,bb=0;
		int min=1000000000,min1=1000000000,min2=1000000000;
		
		for(i=0;i<a.length-1;i++)
		{
			
			for(j=i+1;j<a.length;j++)
			{
				if(Math.abs(a[i]-a[j])<min1)
				{
					min1=Math.abs(a[i]-a[j]);
					aa=a[i];
					bb=a[j];
				}
				
			}
		}
		System.out.println(min1+" "+aa+" "+bb);
	}
	
}