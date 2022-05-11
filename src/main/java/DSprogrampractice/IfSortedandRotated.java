package DSprogrampractice;

import org.junit.Test;

public class IfSortedandRotated {
	
	@Test
	public void example()
	{
		int[] arr = {3,4,5,1,2};
		System.out.println(issortedandroattaed(arr));
		
	}
	
	public boolean issortedandroattaed(int[] arr)
	{
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>arr[(i+1)%n])
			{
				count++;
			}
			
		}
		//if(arr[0]<[arr[n-1])count++;
		
		return count>1?false:true;
		
	}

}
