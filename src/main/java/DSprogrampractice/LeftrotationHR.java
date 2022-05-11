package DSprogrampractice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class LeftrotationHR {
	
	@Test
	public void example1()
	{
		int d=2;
		int[] a = {1,2,3,4,5};
		List<Integer> arr= new ArrayList<Integer>();
		for(Integer each : a) {
			arr.add(each);
		}
		rotateLeft(d,arr);
		
	}
	
		
	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		
		
		List<Integer> list= new ArrayList<Integer>(arr.size());
		
		int j=d;
		while(j<arr.size())
		{
			list.add(arr.get(j));
			j++;
		}
		j=0;
		while(j<d)
		{
			list.add(arr.get(j));
			j++;
		}
		System.out.println(list);
		return list;
	    
	    //System.out.println(arr);
	      
	}
	}


