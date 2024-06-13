package Java_Programs;

import java.util.Scanner;

public class Count_Number_Of_Digits {

	public static void main(String[] args) 
	{
        System.out.println("Enter Number whos digits wants to be count");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0) 
        {
        	n = n/10;
        	count++;
        }
        System.out.println(count);
	}

}
