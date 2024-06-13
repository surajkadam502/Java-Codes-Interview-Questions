package Java_Programs;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args)
	{
       System.out.println("Enter Value");
       
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int s=0,r,C;
       
       while(n!=0)  //153,15,1
       {
    	   r = n%10; //3,5,1
    	   s = (s*10)+r; //3,35,351
    	   n = n/10; //15,1,0
       }
       System.out.println(s);
       
       //alternative way Using StringBuffer
       StringBuffer sb = new StringBuffer(String.valueOf(n));
       StringBuffer s1 = sb.reverse();
       System.out.println(s1);
	}

}
