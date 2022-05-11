package DSprogrampractice;

import org.junit.Test;

public class NoMatchingSubseq {
	
	@Test
	public void example()
	{
		
	String s ="abcde";
	String[] words = {"a","bb","acd","ace"};
	numMatchingSubseq(s,words);
	}
	
	
    public int numMatchingSubseq(String s, String[] words) {
        
        boolean result =false;		
        int count= 0;	
       String outputstring="";
        
        
       if((s==null) || (words==null)) result = false;	
       
        for(int k=0;k<words.length;k++)
        { 
         String wordarr =words[k];
        if(s.length()< wordarr.length())		
        {		
	    int j=0;
	    
	    for(int i=0;i<s.length() && j<wordarr.length();)	
	    {	
		if(s.charAt(i)==wordarr.charAt(j)) {
			
		outputstring=outputstring+wordarr.charAt(j);
		i++;
		j++;
	    }	
	   else 	
	   {	
		j++;
	   }	
      
        
    }
	}count++;
}
		return count;

}}
