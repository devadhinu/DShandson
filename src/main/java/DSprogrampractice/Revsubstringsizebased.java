package DSprogrampractice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.*;



public class Revsubstringsizebased {
	
	@Test
	public void example1()
	{
		String str = "This is new";
		Revsubstring(str);
			
	}
	public String Revsubstring(String str)	
	{
		String[] substr = str.split("\\s+");
		
		String reversestring = null;
		
		System.out.println(Arrays.deepToString(substr));
		
		TreeMap<String,Integer> hm = new TreeMap<String,Integer>();
		
		for(int i=0;i<substr.length;i++) 
		{
			hm.put(substr[i], substr[i].length());
			
		}
		hm.entrySet()
		  .stream()
		  .sorted(Map.Entry.<String, Integer>comparingByValue())
		  .forEach(System.out::println);
		
		return reversestring;
		
		
		
	}
}
