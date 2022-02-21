package Testpractice.Testpractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Hashmapforeach {
	
	public static void main(String args[])
	{
		Map<String,Integer> hmap = new TreeMap<String,Integer>();
		hmap.put("Iphone",50000);
		hmap.put("K20 pro",20000);
		hmap.put("Nokia1100",3000);
		for(Entry<String,Integer> eachentry : hmap.entrySet())
		{
			System.out.println("The values are"+ eachentry.getValue());
			System.out.println("The keys are"+ eachentry.getKey());
		}
		Set<String> keys =hmap.keySet();
		for(String eachkey : keys)
		{
			System.out.println("The keys are"+ eachkey+"with values"+ hmap.get(eachkey));	
		Collection<Integer> values = hmap.values();
		
		System.out.println("values");
		System.out.println(hmap.containsKey("Iphone"));
		System.out.println(hmap.containsValue(20000));
	}}
}
