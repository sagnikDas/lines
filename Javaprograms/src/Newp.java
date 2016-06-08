
public class Newp {
	
	public static void main(String args[])
	{

	    int a[]={6,
	    		1,
	    		3,
	    		46,
	    		1,
	    		3,
	    		9};
	    int k=47;
	        
	        int count=0;
	        for(int i=0;i<a.length;i++)
	            {
	               for(int j=i+1;j<a.length;j++)
	                   {
	                   if(a[i]!=a[j])
	                       {
	                        if((a[i]+a[j])==k)
	                        count++;                       
	                   }
	                   else
	                   {
	                	   continue;
	                   }
	               }
	     
	        }
	        System.out.println(count);
	        
	    }


	}


