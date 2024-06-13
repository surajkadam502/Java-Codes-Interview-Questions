package Java_Programs;

import java.util.Scanner;

public class Even_Odd_Numbers 
{
    public static void main(String[] args) 
    {
    
    System.out.println("Enter number = ");	
	Scanner sc = new Scanner(System.in);
	int value = sc.nextInt();
	
	if (value%2==0) 
	{
		System.out.println("Number is Even");
	}
	else 
	{
		System.out.println("Number is odd");
	}
   }
}

