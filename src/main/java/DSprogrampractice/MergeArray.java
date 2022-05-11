package DSprogrampractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MergeArray {
	
	/*
	 * 1)Create two pinters 
	 */
@Test
	public void example()
	{
		int[] nums1 = {1,2,5,0,0,0};
		int m = 3; 
		int n = 3;
		int[] nums2 = {2,3,6};	
		
		//System.out.println(Arrays.deepToString(merge(nums1,nums2,m,n)));
	}
	
	public int[] arraymerge(int[] nums1 ,int[] nums2,int m,int n)
	{
		int left = 0;
		int right = 0;
		int index = 0;
		int[] newArray = Arrays.copyOf(nums1,m);
		
		
		while (left < m || right < n) {
			if(left == m) nums1[index++] = nums2[right++];
			else if (right == n) nums1[index++] = newArray[left++];
			else if (newArray[left] <= nums2[right]) {
				nums1[index++] = newArray[left++];
			} else {
				nums1[index++] = nums2[right++];
			}
		}
		return nums1;
	}



public void merge(int[] nums1, int[] nums2, int m ,int n) {
    int left = m-1,right=n-1;
    int newindex = m+n-1;
    while(right>=0) {
        if(left>=0 && nums1[left] > nums2[right]) {
            nums1[newindex] = nums1[left--];
        } else {
            nums1[newindex] = nums2[right--];
        }
        right--;
       
    }System.out.println(nums1);
} 
}