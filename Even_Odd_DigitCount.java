package Java_Programs;

import java.util.Scanner;

public class Even_Odd_DigitCount {

	public static void main(String[] args)
	{
		System.out.println("Enter Number");
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt();
       int count =0;
       int EvenCount = 0;
       int OddCount = 0;
       
       while(n>0)  //1234
       {
    	   int r = n%10; //gives only reminder = 4
    	   
    	   if(r%2==0)   //4=even
    	   {
    		   EvenCount++; //count =1
    	   }
    	   else 
    	   {
    		   OddCount++; //count=0
    	   }
    	   n=n/10; 
    	   count++;//gives number without reminder,
    	            //Eliminate last digit and cycle continue with the new value
    	            //new value n = 123
       }
       System.out.println(count);
       System.out.println(EvenCount);
       System.out.println(OddCount);

	}

}
