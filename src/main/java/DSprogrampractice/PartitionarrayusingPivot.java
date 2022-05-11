package DSprogrampractice;

import java.util.Arrays;

import org.junit.Test;

/*https://leetcode.com/problems/partition-array-according-to-given-pivot*/

public class PartitionarrayusingPivot {
	
	@Test
	public void example1()
	{
	int[] nums = {9,12,5,10,14,3,10};
	int pivot = 10;
	int[] output = {9,5,3,10,10,12,14};
	
	System.out.println(Arrays.toString(pivotArray(nums,pivot)));
	}	
	
	
	public int[] pivotArray(int[] nums, int pivot) {
		
		
		int[] newarr =Arrays.copyOf(nums,nums.length);
		
		int count=0,pointer=0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]<pivot)newarr[pointer++]= nums[i];
			
			if(nums[i]==pivot) count++;
				
		}
		
		while(count>0)
		{
			newarr[pointer++]= pivot;
			count--;
		}
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>pivot)
			{
				newarr[pointer++]= nums[i];
			}
		}		

		return newarr;
	}
		
		
		
		

}