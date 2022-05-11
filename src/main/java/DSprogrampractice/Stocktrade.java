package DSprogrampractice;

import java.util.HashMap;

import org.junit.Test;



public class Stocktrade
{
	
    @Test
	public void example()
	{
		int[] stockrate = {7,1,5,3,6,4};
		maxprofit(stockrate);
	}
	
	public int maxprofit (int[] stockrate)
	{
		
		int minvalue=Integer.MAX_VALUE;
		int profit=0;
		
		for(int i=0;i<stockrate.length;i++)
		{
			if(stockrate[i]<minvalue)minvalue=stockrate[i];
			
			else if(stockrate[i]-minvalue > profit)profit=stockrate[i]-minvalue;
			
			
			
		}
		System.out.println(profit);
		return profit;
		
		
	}

}