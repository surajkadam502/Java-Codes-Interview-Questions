package Java_Programs;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_Char_From_String 
{

	public static void main(String[] args) 
	{
       String str = "Suraj Kadam";
       System.out.println(RemovalOfDuplicates(str));
       
	}
     
	public static String RemovalOfDuplicates(String str) 
	{
       Set<Character> set = new HashSet<>();
       StringBuffer sb = new StringBuffer();
       
       for(int i=0; i<str.length(); i++) 
       {
    	   Character c = str.charAt(i);
    	  
    	   if(!set.contains(c)) 
    	   {
    		   set.add(c);
    		   sb.append(c);   
    	   } 
       }
       return sb.toString();
	}
}