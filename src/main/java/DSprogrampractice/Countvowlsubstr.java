
package DSprogrampractice;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Countvowlsubstr {
@Test	
public void example()
{
String word = "aeiouuuou";
System.out.println(countVowelSubstrings(word));

///aeinghaeiou
}
public static boolean check(String s){						
    Set<Character> sb=new HashSet<Character>();						
    for(int i=0;i<s.length();i++)						
        sb.add(s.charAt(i));						
    if(sb.contains('a') && sb.contains('e') && sb.contains('i') && sb.contains('o') &&sb.contains('u') && sb.size()==5){						
                //System.out.println(s);						
                return true;						
    }						
    return false;						
} 						
public int countVowelSubstrings(String word) {						
    int count=0;						
    for(int i=0;i<word.length();i++){						
        StringBuilder sb=new StringBuilder();						
        for(int j=i;j<word.length();j++){
        	
            sb.append(word.charAt(j));						
            System.out.println(sb.toString());						
            if(check(sb.toString()))						
                count++;						
        }						
    }						
    return count;						
}						

 }