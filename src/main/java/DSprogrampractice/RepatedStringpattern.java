package DSprogrampractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;


public class RepatedStringpattern {
	
	
	@Test
	public void example1()
	{
		String str = "ababab";
		findRepatedStringpattern(str);
		
	}

 public void findRepatedStringpattern(String str)
 
 {
  int i=0, temp=0;
  HashMap<Character,Integer> hmap =new HashMap<>();
  while(i<str.length())
  {
	  char c = str.charAt(i);
	  hmap.put(c, hmap.getOrDefault(c,0)+1);
	  i++;
  }
  int maxValueInMap = (Collections.max(hmap.values()));
  System.out.println("max value is"+maxValueInMap);
  
  for(Entry <Character,Integer> eachentry : hmap.entrySet())
  {
  
	  //int count = hmap.get(eachentry.getValue());
	  if (eachentry.getValue() == maxValueInMap) {
		  System.out.println("This is not in line with repetition no"+eachentry.getKey());
	  }
	  

	  
	  
 }

}


}