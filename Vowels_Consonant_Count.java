package Java_Programs;

import java.util.Scanner;

public class Vowels_Consonant_Count {

	public static void main(String[] args)
	{
        String S = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        S = sc.nextLine();  //next()=only for single word(suraj) , nextLine()=for more than one word(suraj kadam)
        S = S.toUpperCase(); //all char converted to upper case to reduce conditions inside if statement
        int i;
        int vol = 0;
        int con = 0;
        
        for(i=0;i<S.length();i++) 
        {
        	char c = S.charAt(i); //this will read character at each index
        	if(c !=' ')           //this condition will verify whether there is space available or not(it shouldn't)
        	{
        		if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') //Already converted to upper case so comparing with Upper case only
        		{
        			vol++;
        			//System.out.print(c);
        		}
        		else 
        		{
        			con++;
        			//System.out.print(c);
        		}
        	}
        }
        System.out.println("Count of Vol :"+vol);
        System.out.println("Count of Con :"+con);   
	}
}
