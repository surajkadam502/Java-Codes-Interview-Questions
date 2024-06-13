package Java_Programs;

import java.util.Scanner;

public class Factorial_Program  //5! = 5*4*3*2*1
{

	public static void main(String[] args) 
	{
       int i;
       int factorial=1;  
       System.out.println("Enter value whose factorial to be find");
       Scanner sc = new Scanner(System.in);
       int value = sc.nextInt();
       
       for (i=1;i<=value;i++) //starts factorial from one 
       {
    	   factorial = factorial * i;  //1,1*2,2*3,6*4,24*5 = 120
       }
       System.out.println(factorial);
	}

}
