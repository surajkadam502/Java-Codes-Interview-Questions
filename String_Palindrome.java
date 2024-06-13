package Java_Programs;

import java.util.Scanner;

public class String_Palindrome
{
  public static void main(String[] args) 
  {
	System.out.println("Enter String =");
	Scanner sc = new Scanner (System.in);
	String str = sc.next();
	
	
	/*for (int i=0;i<str.length()/2;i++) 
	{
		
		if(str.charAt(i)!= str.charAt(str.length()-1-i)) 
		{ 
			System.out.println("Not Plaindrome!");
			return;
		}
	}
	System.out.println("Palindrome");*/
	
	String Orgional_String = str;
	
	String reverse = "";
	
	for(int i=str.length()-1;i>=0;i--) 
	{
		reverse = reverse+ str.charAt(i);
	}
	if(Orgional_String.equals(reverse)) 
	{
		System.out.println("String is Palindrome");
	}
	else 
	{
		System.out.println("String is not Palindrome");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  }
}
