package DSprogrampractice;

import org.junit.Test;

public class CircularprinterHR {
	
	@Test
	public void example()
	{
		String str ="ZNMD";
		circularprintlength(str);
	}
	
	public int circularprintlength(String str)
	{
		char[] ch = str.toCharArray();
		int diff=0, sum = 0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0) diff=ch[i]-'A';
			else 
			{
				diff=ch[i]-ch[i-1];
				diff=Math.abs(i);
			}
			if(diff>13) 
				{
				diff=26-diff;
				}
			sum+=diff;
			
		}
		System.out.println(sum);
		return sum;
	}

}
