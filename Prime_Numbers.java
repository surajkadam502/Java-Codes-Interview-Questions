package Java_Programs;

import java.util.Scanner;

public class Prime_Numbers {

	public static void main(String[] args) 
	{
		System.out.println("Enter Number upto natural numbers wants");
	    Scanner sc = new Scanner (System.in);
	    int n = sc.nextInt();  //two conditions should follow
	    int count = 0;         //1. number>0
	                           //2. It should have only two factors 1 and Itself so count=2
	    if(n>0) //17
	    {
	    	for(int i=1;i<=n;i++) 
	    	{
	    		if(n%i==0)  //17 is divisible by only 1 and itself
	    			count++;
	    	}
	    	if(count==2)  //this will be only if given number will be divisible by 1 and number itself
	    	{
	    		System.out.println("Number is Prime");
	    	}
	    	else 
	    	{
	    		System.out.println("Number is not prime");
	    	}
	    }
	    else 
    	{
    		System.out.println("Number is not prime");
    	}
	}

}
