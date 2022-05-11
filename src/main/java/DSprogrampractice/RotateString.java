package DSprogrampractice;

import org.junit.Test;

public class RotateString {
	
	/*
	 * Example 1:
	 * 
	 * Input: s = "abcde", goal = "cdeab" Output: true 
	 * 
	 * Input: s = "abcde", goal = "bcdea" Output: true 
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: s = "abcde", goal = "abced" Output: false
	 */
	@Test
	public void example()
	{
		String s     ="12345";
		String goal = "34521";
		
		System.out.println("the string is rotated "+ comparestringrotation(s,goal));		
		
	}

	public boolean comparestringrotation(String s,String goal)
	{
    if (s.length() != goal.length()) return false;
        
        StringBuilder st = new StringBuilder(s);
        st.append(s);
        
        if(st.toString().contains(goal)) return true;
               
        return false;
     		
	
} 
}
