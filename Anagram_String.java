package Java_Programs;

import java.util.Arrays;

public class Anagram_String 
{
	public static boolean AngramCheck(String str1, String str2) 
	{
		char[]ArrayFromStr1 = str1.toCharArray();
		char[]ArrayFromStr2 = str2.toCharArray();
		
		Arrays.sort(ArrayFromStr1);
		Arrays.sort(ArrayFromStr2);
		
		return Arrays.equals(ArrayFromStr1, ArrayFromStr2);
	}

	public static void main(String[] args)
	{
       String str1 = "java";
       String str2 = "avaj";
       
       System.out.println("Both the strings are Anagram : "+AngramCheck(str1, str2));   
	}
}
