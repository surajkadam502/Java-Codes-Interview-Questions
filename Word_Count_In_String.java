package Java_Programs;

import java.util.Scanner;

public class Word_Count_In_String {

	public static void main(String[] args)
	{
       String S = new String();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter String: ");
       S = sc.nextLine();
       int i ,count = 1; //any single char or word required so string starts from count = 1;
       
       for(i=0; i<S.length()-1; i++) 
       {
    	   char c = S.charAt(i);
    	   
    	   char d = S.charAt(i+1);  //consider next character exceeding c
    	   
    	   if(c==' ' && d !=' ' )  //condition is like char at current index should be space and next index char should be present(word separation)
    	   {
    		   count++;
    	   }
       }
       System.out.println("Total word count : "+count);
	}

}
