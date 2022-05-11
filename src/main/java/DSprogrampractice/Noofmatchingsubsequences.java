package DSprogrampractice;

import java.util.Stack;

import org.junit.Test;

public class Noofmatchingsubsequences {

	@Test
public void example()
{
	
String str = "abcde";
String[] words = {"a","bb","acd","ace"};
countmatchingsubseq(str,words);

}
	public int countmatchingsubseq(String str,String[] words)
	{
		int count=0;
		Stack<Integer> stck = new Stack<Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			stck.push(i);
		}
		for(int i=0;i<words.length;i++)
		{
			if (words[i].equals(stck.peek()))
			{
				count++;
			}
		}
		System.out.println(count);
		return 0;
		
	}
	
	
}
