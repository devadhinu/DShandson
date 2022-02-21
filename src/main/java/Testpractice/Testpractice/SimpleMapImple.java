package Testpractice.Testpractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleMapImple {
	
	public static void main (String args[])
	{
		Map <Character,Integer> map = new LinkedHashMap<>();
		String str= "i will master java";
		for(int i=0;i<str.length();i++)
		{
			
			 if(map.containsKey(str.charAt(i))) { Integer value = map.get(str.charAt(i));
			  map.put(str.charAt(i), value+1); }
			  
			  else { map.put(str.charAt(i), 1); }
			 
			
			//map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0)+1);
		}
		
		System.out.println(map.entrySet());
	}

}
