package DSprogrampractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class ArrayIntersection 
{
    @Test
	public void example1()
	{
	int [] nums1 = {1,2,2,1};
	int [] nums2 = {2,2};
	//System.out.println(intersectArray(nums1,nums2));
	}
    @Test
    
	public void example2()
	{
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		System.out.println(Arrays.toString(intersectArray(nums1,nums2)));
	}
	
	public int[] intersectArray(int[] nums1,int[] nums2)
	{
		
		Set<Integer> set1 =new HashSet<Integer>();
		Set<Integer> set2 =new HashSet<Integer>();
		
		for(int i=0;i<nums1.length;i++)
		{
			set1.add(nums1[i]);
		}
		for(int i=0;i<nums2.length;i++)
		{
			if(set1.contains(nums2[i]))
			set2.add(nums2[i]);
		}
		int[] result =new int[set2.size()];
		
		int i=0;
		for(Integer nums : set2 )
		{
		result[i++]=nums;
		System.out.println(nums);
		}
		//System.out.println(result);
		return result;
		
	}
	
}
