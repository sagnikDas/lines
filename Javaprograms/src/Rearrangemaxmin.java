
public class Rearrangemaxmin {
	
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,6,7,8};
		int len=a.length;
		//System.out.print(len);
		int out[]=new int[len];
		int m=0;
		
		for(int i=0;i<=len;i++)
		{
			out[i]=a[len-i-1];
			System.out.println(out[i]+" ");
			out[i+1]=a[i];
			System.out.println(out[i+1]+" ");
			//m++;
		}
		for(int i=0;i<len;i++)
			System.out.print(out[i]+" ");
	}

}
