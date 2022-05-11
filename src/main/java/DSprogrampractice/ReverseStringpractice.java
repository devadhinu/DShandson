package DSprogrampractice;

import java.util.Arrays;

import org.junit.Test;


public class ReverseStringpractice {

	@Test
	public void example()
	{
		String s ="Diesh";
		System.out.println(reversegivenstring(s));
		//reversegivenstring(s);
		
	}
	
public String reversegivenstring(String s)
{
	int left=0,right=s.length()-1;
	char temp;
	char[] ch= s.toCharArray();
	while(left<right)
	{
		temp = ch[left];
		ch[left++]=ch[right];
		ch[right--] = temp;
	}
	String reversed =new String(ch);
	return reversed;

}
	
}
