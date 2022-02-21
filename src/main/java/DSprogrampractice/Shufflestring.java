package DSprogrampractice;

import java.util.HashMap;
import java.util.TreeMap;

import org.junit.Test;

public class Shufflestring {

	@Test
	public void example() {
		String s = "codeleet";

		int indices[] = { 4, 5, 6, 7, 0, 2, 1, 3 };
		//toshufflethestring(s, indices);
		System.out.println(toshufflethestring(s, indices));
	}

	public String toshufflethestring(String s, int indices[]) {
		TreeMap<Integer, Character> hm = new TreeMap<>();

		StringBuilder sBuilder = new StringBuilder();

		int i = 0;
		char str = s.charAt(i);
		for (i = 0; i < indices.length; i++) {

			hm.put(indices[i], s.charAt(i));

		}
		System.out.println(hm);

		 for(Integer key : hm.keySet()) 
		 { 
		 sBuilder.append(hm.get(key)); 
		 } 
		 return sBuilder.toString();
		 

	}

}
