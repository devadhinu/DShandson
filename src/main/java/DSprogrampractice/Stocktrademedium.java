package DSprogrampractice;

import java.util.HashMap;

import org.junit.Test;



public class Stocktrademedium
{
	
    @Test
	public void example()
	{
		int[] stockrate = {7,1,5,3,6,4};
		maxprofit(stockrate);
	}
	
	public int maxprofit (int[] stockrate)
	{
		
		int tobuy = 0;
		int profit=0;
		
		for(int i=1;i<stockrate.length-1;i++)
		{
			if(stockrate[i]<stockrate[i-1]) tobuy=stockrate[i];
			
			else if(stockrate[i]>stockrate[i-1]) profit+=stockrate[i]- tobuy;
			
			//System.out.println("its"+tobuy+","+profit);
			
		}
		System.out.println("its"+tobuy+","+profit);
		return profit;
		
		
	}

}