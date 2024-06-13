package Java_Programs;

import java.util.Scanner;

public class CountSumOfDigitsInNumber {

	public static void main(String[] args)
	{
		   System.out.println("Enter Number");
	       Scanner sc = new Scanner (System.in);
	       int n = sc.nextInt();
	       int s = 0,r; //sum
	       
	       while(n>0)  //1234 //123  //12 //1 //0 loop ends
	       {
	    	   r= n%10;
	    	   s= s+r;  //4 //4+3  //4+3+2  //4+3+2+1
	    	   n= n/10;  //123  //12  //1  //0
	       }
	       System.out.println(s);
	}

}
