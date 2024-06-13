package Java_Programs;

import java.util.Scanner;

public class Int_Plindrome {

	public static void main(String[] args) 
	{
	   int s=0,r,C;
       System.out.println("Enter Number = ");
       Scanner sc = new Scanner(System.in);
       int  n = sc.nextInt();
       C = n;  //scanner class integer should save in n
       
       while(n>0)  //434 ,43 ,4
       {
    	   r = n%10; //4 ,3 ,4
    	   s = (s*10)+r;  //4 ,43 ,434
    	   n = n/10;  //43 //4 //0
       }
       if(s==C)   //434 = 434
       {
    	   System.out.println("Palindrom");
       }
       else 
       {
    	   System.out.println("Not Palindrome");
       }
       
       
    }

}
