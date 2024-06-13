package Java_Programs;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) 
	{
		   int s=0,r,C;
	       System.out.println("Enter Number = ");
	       Scanner sc = new Scanner(System.in);
	       int  n = sc.nextInt();
	       C = n;  //scanner class integer should save in n
	       
	       while(n>0) //153 //15 //1
	       {
	    	   r = n%10;  //3,5,1
	    	   s = s+(r*r*r);  //27,152,153
	    	   n = n/10;  //15,1,0
	       }
	       if(s==C) 
	       {
	    	   System.out.println("Armstrong Number");
	       }
	       else 
	       {
	    	   System.out.println("Not Armstrong Number");
	       }
	}

}
