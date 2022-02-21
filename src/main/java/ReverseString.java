import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class ReverseString {

	@Test
	public void example1() {
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		stringreversal(s);
	}

	public void stringreversal(char[] s) {
		/*
		 * Stack<Character> stck =new Stack<>();
		 * 
		 * StringBuffer sb = new StringBuffer(); StringBuffer reverse = null;
		 * 
		 * 
		 * List<Character> lst =new ArrayList<>();
		 * 
		 * for(int i=0;i<ch.length;i++) { stck.push(ch[i]); //lst =
		 * sb.append(stck.pop()); }
		 * 
		 * for(Character eachchar : stck) { lst.add(stck.pop()); }
		 * 
		 * 
		 * System.out.println("The reversed string is " + lst);
		 */

		int right=s.length-1;
		char temp = 0;
		int left;
		for(left=0;left<s.length/2;left++)
		
		{
			if(left>=right)break;
	    
		
		temp=s[left];
		s[left]=s[right];
		s[right]=temp;
		right--;
		}	
		System.out.println(s);
				
	}
}