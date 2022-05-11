package DSprogrampractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

/*
 * Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

   public class Twosumpractice 
   {
	   @Test
	public void exmaple1()
	{
		int[] nums = {2,7,11,15};
		int target=9;
		twoSum(nums,target);
	}
    public int[] twoSum(int[] nums, int target) {
	int temp=0;
	HashMap<Integer,Integer> hm =new HashMap<>();
	for(int i=0;i<nums.length;i++)
	{
	            temp = target-nums[i];
	        
	        if(hm.containsKey(temp)) {
	        	
	        	return new int[] {hm.get(temp),i};
	        }
	        hm.put(nums[i], i);
		
	        
	    }
	return nums;
	}
}