package Java_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Words_In_String {

	public static void main(String[] args) 
	{
       String s= new String();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter String : ");
       s = sc.nextLine();
       String[]words = s.split(" "); //splitted string to array from space
       
       System.out.println(Arrays.toString(words)); //just to read array
       
       
       for(int i=words.length-1; i>=0; i--) 
       {
    	   System.out.print(words[i]+" ");
       }
       
	}

}
