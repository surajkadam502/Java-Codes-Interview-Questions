package Java_Programs;

import java.util.HashMap;
import java.util.Map;

public class Char_Count_In_String 
{
    
	public static void getCharCount(String name) 
	{
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		char [] character = name.toCharArray();	
		for (char c : character) 
		{
			//if(!String.valueOf(c).isBlank()) 
			//{
				if(charMap.containsKey(c)) 
				{
					charMap.put(c, charMap.get(c)+1);
				}
				else 
				{
					charMap.put(c, 1);
				}
			//}
		}
		System.out.println(name+ ":"+charMap);
	}
	
	
	public static void main(String[] args) 
	{
		getCharCount("suraj kadam");
	}

}
